package ilya.mihailenko.myapplication.model.facade.currentweather;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lilya/mihailenko/myapplication/model/facade/currentweather/CurrentWeatherFacadeImpl;", "Lilya/mihailenko/myapplication/model/facade/currentweather/CurrentWeatherFacade;", "currentLocationTracker", "Lilya/mihailenko/myapplication/common/location/CurrentLocationTracker;", "gpsConnectionManager", "Lilya/mihailenko/myapplication/common/gps/GpsConnectionManager;", "weatherInteractor", "Lilya/mihailenko/myapplication/model/interactor/weather/WeatherInteractor;", "(Lilya/mihailenko/myapplication/common/location/CurrentLocationTracker;Lilya/mihailenko/myapplication/common/gps/GpsConnectionManager;Lilya/mihailenko/myapplication/model/interactor/weather/WeatherInteractor;)V", "getCurrentWeather", "Lio/reactivex/rxjava3/core/Single;", "Lilya/mihailenko/myapplication/entity/weather/current/CurrentWeather;", "app_debug"})
public final class CurrentWeatherFacadeImpl implements ilya.mihailenko.myapplication.model.facade.currentweather.CurrentWeatherFacade {
    private final ilya.mihailenko.myapplication.common.location.CurrentLocationTracker currentLocationTracker = null;
    private final ilya.mihailenko.myapplication.common.gps.GpsConnectionManager gpsConnectionManager = null;
    private final ilya.mihailenko.myapplication.model.interactor.weather.WeatherInteractor weatherInteractor = null;
    
    @javax.inject.Inject()
    public CurrentWeatherFacadeImpl(@org.jetbrains.annotations.NotNull()
    ilya.mihailenko.myapplication.common.location.CurrentLocationTracker currentLocationTracker, @org.jetbrains.annotations.NotNull()
    ilya.mihailenko.myapplication.common.gps.GpsConnectionManager gpsConnectionManager, @org.jetbrains.annotations.NotNull()
    ilya.mihailenko.myapplication.model.interactor.weather.WeatherInteractor weatherInteractor) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    @java.lang.Override()
    public io.reactivex.rxjava3.core.Single<ilya.mihailenko.myapplication.entity.weather.current.CurrentWeather> getCurrentWeather() {
        return null;
    }
}