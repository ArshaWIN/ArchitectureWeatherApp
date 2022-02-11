package ilya.mihailenko.myapplication.model.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u0006H\'\u00a8\u0006\b"}, d2 = {"Lilya/mihailenko/myapplication/model/data/network/WeatherApi;", "", "getCurrentWeather", "Lio/reactivex/rxjava3/core/Single;", "Lilya/mihailenko/myapplication/entity/weather/current/CurrentWeatherResponse;", "city", "", "units", "app_debug"})
public abstract interface WeatherApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "weather")
    public abstract io.reactivex.rxjava3.core.Single<ilya.mihailenko.myapplication.entity.weather.current.CurrentWeatherResponse> getCurrentWeather(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "units")
    java.lang.String units);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
    }
}