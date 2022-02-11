package ilya.mihailenko.myapplication.presentation.weather;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H&\u00a8\u0006\b"}, d2 = {"Lilya/mihailenko/myapplication/presentation/weather/WeatherViewModelBinding;", "", "getCity", "Landroidx/lifecycle/LiveData;", "", "getWeather", "isLoading", "", "app_debug"})
public abstract interface WeatherViewModelBinding {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.lang.String> getWeather();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.lang.String> getCity();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.lang.Boolean> isLoading();
}