package xyz.thegrapevine.news

import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryMap
import xyz.thegrapevine.news.entities.NewsEntity
import xyz.thegrapevine.news.entities.SourceEntity

interface NewsClient {
    /**
     * Returns the top headlines of today.
     *
     * @param q Query to search
     * @param sources An array of sources to use.
     * @see NewsEntity
     */
    @GET("top-headlines")
    fun getTopHeadlines(@Query("q") q: String?, @Query("sources") vararg sources: String?): NewsEntity

    /**
     * Returns available sources.
     * @see SourceEntity
     */
    @GET("sources")
    fun getSources(): SourceEntity

    /**
     * Returns the /everything endpoint
     *
     * @param q Query to search
     * @param sources An array of sources to use.
     * @see NewsEntity
     */
    @GET("everything")
    fun getEverything(@Query("q") q: String?, @Query("sources") vararg sources: String?): NewsEntity
}