package ilya.mihailenko.myapplication.di.common.module

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import ilya.mihailenko.myapplication.BuildConfig
import ilya.mihailenko.myapplication.model.data.network.WeatherApi
import ilya.mihailenko.myapplication.model.data.network.interceptor.AppInfoInterceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
class NetworkModule {

    @Singleton
    @Provides
    internal fun provideLoggingInterceptor(): HttpLoggingInterceptor {
        val logLevel = if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY
        else HttpLoggingInterceptor.Level.NONE

        return HttpLoggingInterceptor().apply { level = logLevel }
    }

    @Singleton
    @Provides
    internal fun provideGson(): Gson {
        return GsonBuilder().create()
    }

    @Singleton
    @Provides
    internal fun provideOkHttpBuilder(
        loggingInterceptor: HttpLoggingInterceptor
    ): OkHttpClient.Builder {
        return OkHttpClient.Builder()
            .addNetworkInterceptor(loggingInterceptor)
            .connectTimeout(CONNECT_TIMEOUT, TimeUnit.SECONDS)
            .readTimeout(READ_TIMEOUT, TimeUnit.SECONDS)
            .writeTimeout(WRITE_TIMEOUT, TimeUnit.SECONDS)
    }

    @Singleton
    @Provides
    internal fun provideRetrofitBuilder(gson: Gson): Retrofit.Builder {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
    }


    @Singleton
    @Provides
    internal fun provideWeatherApi(
        retrofitBuilder: Retrofit.Builder,
        okHttpClientBuilder: OkHttpClient.Builder,
        appInfoInterceptor: AppInfoInterceptor,
    ): WeatherApi {

        okHttpClientBuilder
            .addInterceptor(appInfoInterceptor)

        return retrofitBuilder
            .client(okHttpClientBuilder.build())
            .build()
            .create(WeatherApi::class.java)
    }


    companion object {
        private const val BASE_URL = "https://community-open-weather-map.p.rapidapi.com/"
        private const val CONNECT_TIMEOUT = 45L
        private const val READ_TIMEOUT = 45L
        private const val WRITE_TIMEOUT = 45L
    }
}