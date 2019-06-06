package xyz.thegrapevine.news

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import xyz.thegrapevine.news.exceptions.BadRequestException
import xyz.thegrapevine.news.exceptions.ServerErrorException
import xyz.thegrapevine.news.exceptions.UnauthorizedException
import xyz.thegrapevine.news.retrofit.CallAdapterFactory

class NewsClientBuilder(private val apiToken: String) {

    val httpClient = OkHttpClient.Builder()

    fun build(): NewsClient {
        httpClient.addInterceptor {
            val request = it.request().newBuilder()
                .addHeader("X-Api-Key", apiToken)
                .addHeader("Content-Type", "application/json; charset=utf8;")
                .build()
            return@addInterceptor it.proceed(request)
        }

        httpClient.addInterceptor {
            val request = it.request()
            val response = it.proceed(request)
            when {
                response.code() == 500 -> throw ServerErrorException()
                response.code() == 401 -> throw UnauthorizedException()
                response.code() == 400 -> throw BadRequestException()
                else -> return@addInterceptor response
            }
        }

        val retrofit = Retrofit.Builder()
            .client(httpClient.build())
            .baseUrl("https://newsapi.org/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(CallAdapterFactory().create())
            .build()

        return retrofit.create(NewsClient::class.java)
    }
}