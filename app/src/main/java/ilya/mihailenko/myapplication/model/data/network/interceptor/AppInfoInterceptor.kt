package ilya.mihailenko.myapplication.model.data.network.interceptor

import okhttp3.Interceptor
import okhttp3.Response
import java.io.IOException
import javax.inject.Inject
import javax.inject.Singleton

private const val HEADER_API_HOST = "x-rapidapi-host"
private const val HEADER_API_KEY = "x-rapidapi-key"
private const val API_HOST = "community-open-weather-map.p.rapidapi.com"
private const val API_KEY = "0c56f91d24msh8fb8597c04fc96ap148ca3jsn519fb5830c1a"

@Singleton
class AppInfoInterceptor @Inject constructor() : Interceptor {

    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        val builder = chain.request().newBuilder()
            .addHeader(HEADER_API_HOST, API_HOST)
            .addHeader(HEADER_API_KEY, API_KEY)


        val request = builder.build()
        return chain.proceed(request)
    }
}
