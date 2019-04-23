package xyz.thegrapevine.news.retrofit

import retrofit2.Call
import retrofit2.CallAdapter
import retrofit2.Retrofit
import java.lang.reflect.Type



class CallAdapterFactory : CallAdapter.Factory() {

    fun create(): CallAdapterFactory {
        return CallAdapterFactory()
    }
    override fun get(returnType: Type, annotations: Array<Annotation>, retrofit: Retrofit): CallAdapter<*, *>? {
        return object : CallAdapter<Any, Any> {
            override fun responseType(): Type {
                return returnType
            }

            override fun adapt(call: Call<Any>): Any? {
                return try {
                    call.execute().body()
                } catch (e: Exception) {
                    println("Error while executing request to ${call.request().url()}")
                    null
                }

            }
        }
    }
}