package ilya.mihailenko.myapplication.di.common.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b\u0005J\r\u0010\u0006\u001a\u00020\u0007H\u0001\u00a2\u0006\u0002\b\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0001\u00a2\u0006\u0002\b\fJ\u0015\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b\u0010J%\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016H\u0001\u00a2\u0006\u0002\b\u0017\u00a8\u0006\u0019"}, d2 = {"Lilya/mihailenko/myapplication/di/common/module/NetworkModule;", "", "()V", "provideGson", "Lcom/google/gson/Gson;", "provideGson$app_debug", "provideLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "provideLoggingInterceptor$app_debug", "provideOkHttpBuilder", "Lokhttp3/OkHttpClient$Builder;", "loggingInterceptor", "provideOkHttpBuilder$app_debug", "provideRetrofitBuilder", "Lretrofit2/Retrofit$Builder;", "gson", "provideRetrofitBuilder$app_debug", "provideWeatherApi", "Lilya/mihailenko/myapplication/model/data/network/WeatherApi;", "retrofitBuilder", "okHttpClientBuilder", "appInfoInterceptor", "Lilya/mihailenko/myapplication/model/data/network/interceptor/AppInfoInterceptor;", "provideWeatherApi$app_debug", "Companion", "app_debug"})
@dagger.Module()
public final class NetworkModule {
    @org.jetbrains.annotations.NotNull()
    public static final ilya.mihailenko.myapplication.di.common.module.NetworkModule.Companion Companion = null;
    private static final java.lang.String BASE_URL = "https://community-open-weather-map.p.rapidapi.com/";
    private static final long CONNECT_TIMEOUT = 45L;
    private static final long READ_TIMEOUT = 45L;
    private static final long WRITE_TIMEOUT = 45L;
    
    public NetworkModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.logging.HttpLoggingInterceptor provideLoggingInterceptor$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.gson.Gson provideGson$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.OkHttpClient.Builder provideOkHttpBuilder$app_debug(@org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor loggingInterceptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.Retrofit.Builder provideRetrofitBuilder$app_debug(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final ilya.mihailenko.myapplication.model.data.network.WeatherApi provideWeatherApi$app_debug(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit.Builder retrofitBuilder, @org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient.Builder okHttpClientBuilder, @org.jetbrains.annotations.NotNull()
    ilya.mihailenko.myapplication.model.data.network.interceptor.AppInfoInterceptor appInfoInterceptor) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lilya/mihailenko/myapplication/di/common/module/NetworkModule$Companion;", "", "()V", "BASE_URL", "", "CONNECT_TIMEOUT", "", "READ_TIMEOUT", "WRITE_TIMEOUT", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}