package ilya.mihailenko.myapplication.di.features.weather;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\'\u00a8\u0006\u0010"}, d2 = {"Lilya/mihailenko/myapplication/di/features/weather/WeatherModule;", "", "()V", "provideCurrentWeatherFacade", "Lilya/mihailenko/myapplication/model/facade/currentweather/CurrentWeatherFacade;", "currentWeatherFacade", "Lilya/mihailenko/myapplication/model/facade/currentweather/CurrentWeatherFacadeImpl;", "provideWeatherInteractor", "Lilya/mihailenko/myapplication/model/interactor/weather/WeatherInteractor;", "weatherInteractorImpl", "Lilya/mihailenko/myapplication/model/interactor/weather/WeatherInteractorImpl;", "provideWeatherRepository", "Lilya/mihailenko/myapplication/model/repository/weather/WeatherRepository;", "weatherRepository", "Lilya/mihailenko/myapplication/model/repository/weather/WeatherRepositoryImpl;", "Companion", "app_debug"})
@dagger.Module()
public abstract class WeatherModule {
    @org.jetbrains.annotations.NotNull()
    public static final ilya.mihailenko.myapplication.di.features.weather.WeatherModule.Companion Companion = null;
    
    public WeatherModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @ilya.mihailenko.myapplication.di.common.scopes.PerFeature()
    @dagger.Binds()
    public abstract ilya.mihailenko.myapplication.model.interactor.weather.WeatherInteractor provideWeatherInteractor(@org.jetbrains.annotations.NotNull()
    ilya.mihailenko.myapplication.model.interactor.weather.WeatherInteractorImpl weatherInteractorImpl);
    
    @org.jetbrains.annotations.NotNull()
    @ilya.mihailenko.myapplication.di.common.scopes.PerFeature()
    @dagger.Binds()
    public abstract ilya.mihailenko.myapplication.model.repository.weather.WeatherRepository provideWeatherRepository(@org.jetbrains.annotations.NotNull()
    ilya.mihailenko.myapplication.model.repository.weather.WeatherRepositoryImpl weatherRepository);
    
    @org.jetbrains.annotations.NotNull()
    @ilya.mihailenko.myapplication.di.common.scopes.PerFeature()
    @dagger.Binds()
    public abstract ilya.mihailenko.myapplication.model.facade.currentweather.CurrentWeatherFacade provideCurrentWeatherFacade(@org.jetbrains.annotations.NotNull()
    ilya.mihailenko.myapplication.model.facade.currentweather.CurrentWeatherFacadeImpl currentWeatherFacade);
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    @ilya.mihailenko.myapplication.di.common.scopes.PerFeature()
    @dagger.Provides()
    public static final android.location.Geocoder provideGeocoder(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"ModuleCompanionObjects"})
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lilya/mihailenko/myapplication/di/features/weather/WeatherModule$Companion;", "", "()V", "provideGeocoder", "Landroid/location/Geocoder;", "context", "Landroid/content/Context;", "app_debug"})
    @dagger.Module()
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        @ilya.mihailenko.myapplication.di.common.scopes.PerFeature()
        @dagger.Provides()
        public final android.location.Geocoder provideGeocoder(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}