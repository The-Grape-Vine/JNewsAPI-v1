package xyz.thegrapevine.news

import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryMap
import xyz.thegrapevine.news.entities.NewsEntity
import xyz.thegrapevine.news.entities.SourceEntity

interface NewsClient {
    @GET("top-headlines")
    fun getTopHeadlines(@Query("q") q: String?, @Query("sources") vararg sources: String?): NewsEntity

    @GET("sources")
    fun getSources(): SourceEntity

    @GET("everything")
    fun getEverything(@Query("q") q: String?, @Query("sources") vararg sources: String?): NewsEntity
}