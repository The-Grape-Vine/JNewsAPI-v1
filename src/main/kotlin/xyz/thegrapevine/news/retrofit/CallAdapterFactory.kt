package xyz.thegrapevine.news.retrofit

import org.slf4j.LoggerFactory
import retrofit2.Call
import retrofit2.CallAdapter
import retrofit2.Retrofit
import java.lang.reflect.Type

/**
 * A generic call adapter factory for Retrofit.
 */
class CallAdapterFactory : CallAdapter.Factory() {

    private val LOG = LoggerFactory.getLogger(this::class.java)

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
                    LOG.error("Error while executing request.", e)
                }

            }
        }
    }
}