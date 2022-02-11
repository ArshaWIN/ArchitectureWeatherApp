package ilya.mihailenko.myapplication.model.repository.weather;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lilya/mihailenko/myapplication/model/repository/weather/WeatherRepositoryImpl;", "Lilya/mihailenko/myapplication/model/repository/weather/WeatherRepository;", "weatherApi", "Lilya/mihailenko/myapplication/model/data/network/WeatherApi;", "(Lilya/mihailenko/myapplication/model/data/network/WeatherApi;)V", "getCurrentWeather", "Lio/reactivex/rxjava3/core/Single;", "Lilya/mihailenko/myapplication/entity/weather/current/CurrentWeather;", "city", "", "app_debug"})
public final class WeatherRepositoryImpl implements ilya.mihailenko.myapplication.model.repository.weather.WeatherRepository {
    private final ilya.mihailenko.myapplication.model.data.network.WeatherApi weatherApi = null;
    
    @javax.inject.Inject()
    public WeatherRepositoryImpl(@org.jetbrains.annotations.NotNull()
    ilya.mihailenko.myapplication.model.data.network.WeatherApi weatherApi) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.rxjava3.core.Single<ilya.mihailenko.myapplication.entity.weather.current.CurrentWeather> getCurrentWeather(@org.jetbrains.annotations.NotNull()
    java.lang.String city) {
        return null;
    }
}