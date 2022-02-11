package ilya.mihailenko.myapplication.model.interactor.weather;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lilya/mihailenko/myapplication/model/interactor/weather/WeatherInteractorImpl;", "Lilya/mihailenko/myapplication/model/interactor/weather/WeatherInteractor;", "weatherRepository", "Lilya/mihailenko/myapplication/model/repository/weather/WeatherRepository;", "geocoder", "Landroid/location/Geocoder;", "(Lilya/mihailenko/myapplication/model/repository/weather/WeatherRepository;Landroid/location/Geocoder;)V", "getCurrentWeather", "Lio/reactivex/rxjava3/core/Single;", "Lilya/mihailenko/myapplication/entity/weather/current/CurrentWeather;", "location", "Landroid/location/Location;", "app_debug"})
public final class WeatherInteractorImpl implements ilya.mihailenko.myapplication.model.interactor.weather.WeatherInteractor {
    private final ilya.mihailenko.myapplication.model.repository.weather.WeatherRepository weatherRepository = null;
    private final android.location.Geocoder geocoder = null;
    
    @javax.inject.Inject()
    public WeatherInteractorImpl(@org.jetbrains.annotations.NotNull()
    ilya.mihailenko.myapplication.model.repository.weather.WeatherRepository weatherRepository, @org.jetbrains.annotations.NotNull()
    android.location.Geocoder geocoder) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.rxjava3.core.Single<ilya.mihailenko.myapplication.entity.weather.current.CurrentWeather> getCurrentWeather(@org.jetbrains.annotations.NotNull()
    android.location.Location location) {
        return null;
    }
}