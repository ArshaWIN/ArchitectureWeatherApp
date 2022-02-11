package ilya.mihailenko.myapplication.model.interactor.weather;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lilya/mihailenko/myapplication/model/interactor/weather/WeatherInteractor;", "", "getCurrentWeather", "Lio/reactivex/rxjava3/core/Single;", "Lilya/mihailenko/myapplication/entity/weather/current/CurrentWeather;", "location", "Landroid/location/Location;", "app_debug"})
public abstract interface WeatherInteractor {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Single<ilya.mihailenko.myapplication.entity.weather.current.CurrentWeather> getCurrentWeather(@org.jetbrains.annotations.NotNull()
    android.location.Location location);
}