package ilya.mihailenko.myapplication.presentation.weather;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001bB\u0019\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u0011H\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0011H\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0007J\b\u0010\u0016\u001a\u00020\u0015H\u0014J\u0006\u0010\u0017\u001a\u00020\u0015J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lilya/mihailenko/myapplication/presentation/weather/WeatherViewModel;", "Landroidx/lifecycle/ViewModel;", "Lilya/mihailenko/myapplication/presentation/weather/WeatherViewModelBinding;", "rxPermissionsWrapper", "Lilya/mihailenko/myapplication/common/permission/RxPermissionsWrapper;", "currentWeatherFacade", "Lilya/mihailenko/myapplication/model/facade/currentweather/CurrentWeatherFacade;", "(Lilya/mihailenko/myapplication/common/permission/RxPermissionsWrapper;Lilya/mihailenko/myapplication/model/facade/currentweather/CurrentWeatherFacade;)V", "cityLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "currentWeatherLiveData", "isLoadingLiveData", "", "getCity", "Landroidx/lifecycle/LiveData;", "getWeather", "isLoading", "loadCurrentWeather", "", "onCleared", "onSwipeToRefreshed", "onWeatherLoaded", "currentWeather", "Lilya/mihailenko/myapplication/entity/weather/current/CurrentWeather;", "Factory", "app_debug"})
public final class WeatherViewModel extends androidx.lifecycle.ViewModel implements ilya.mihailenko.myapplication.presentation.weather.WeatherViewModelBinding {
    private final ilya.mihailenko.myapplication.common.permission.RxPermissionsWrapper rxPermissionsWrapper = null;
    private final ilya.mihailenko.myapplication.model.facade.currentweather.CurrentWeatherFacade currentWeatherFacade = null;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable compositeDisposable = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> currentWeatherLiveData = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> cityLiveData = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoadingLiveData = null;
    
    @dagger.assisted.AssistedInject()
    public WeatherViewModel(@org.jetbrains.annotations.NotNull()
    @dagger.assisted.Assisted()
    ilya.mihailenko.myapplication.common.permission.RxPermissionsWrapper rxPermissionsWrapper, @org.jetbrains.annotations.NotNull()
    ilya.mihailenko.myapplication.model.facade.currentweather.CurrentWeatherFacade currentWeatherFacade) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.lang.String> getWeather() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.lang.String> getCity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public final void loadCurrentWeather() {
    }
    
    private final void onWeatherLoaded(ilya.mihailenko.myapplication.entity.weather.current.CurrentWeather currentWeather) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void onSwipeToRefreshed() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lilya/mihailenko/myapplication/presentation/weather/WeatherViewModel$Factory;", "", "create", "Lilya/mihailenko/myapplication/presentation/weather/WeatherViewModel;", "rxPermissionsWrapper", "Lilya/mihailenko/myapplication/common/permission/RxPermissionsWrapper;", "app_debug"})
    @dagger.assisted.AssistedFactory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract ilya.mihailenko.myapplication.presentation.weather.WeatherViewModel create(@org.jetbrains.annotations.NotNull()
        ilya.mihailenko.myapplication.common.permission.RxPermissionsWrapper rxPermissionsWrapper);
    }
}