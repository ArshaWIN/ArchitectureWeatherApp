package ilya.mihailenko.myapplication.model.facade.currentweather;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lilya/mihailenko/myapplication/model/facade/currentweather/CurrentWeatherFacade;", "", "getCurrentWeather", "Lio/reactivex/rxjava3/core/Single;", "Lilya/mihailenko/myapplication/entity/weather/current/CurrentWeather;", "app_debug"})
public abstract interface CurrentWeatherFacade {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Single<ilya.mihailenko.myapplication.entity.weather.current.CurrentWeather> getCurrentWeather();
}