package ilya.mihailenko.myapplication.entity.weather.current;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lilya/mihailenko/myapplication/entity/weather/current/CurrentWeatherResponse;", "", "city", "", "mainInfo", "Lilya/mihailenko/myapplication/entity/weather/current/WeatherResponseMain;", "wind", "Lilya/mihailenko/myapplication/entity/weather/current/WeatherResponseWind;", "(Ljava/lang/String;Lilya/mihailenko/myapplication/entity/weather/current/WeatherResponseMain;Lilya/mihailenko/myapplication/entity/weather/current/WeatherResponseWind;)V", "getCity", "()Ljava/lang/String;", "getMainInfo", "()Lilya/mihailenko/myapplication/entity/weather/current/WeatherResponseMain;", "getWind", "()Lilya/mihailenko/myapplication/entity/weather/current/WeatherResponseWind;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class CurrentWeatherResponse {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "name")
    private final java.lang.String city = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "main")
    private final ilya.mihailenko.myapplication.entity.weather.current.WeatherResponseMain mainInfo = null;
    @org.jetbrains.annotations.NotNull()
    private final ilya.mihailenko.myapplication.entity.weather.current.WeatherResponseWind wind = null;
    
    @org.jetbrains.annotations.NotNull()
    public final ilya.mihailenko.myapplication.entity.weather.current.CurrentWeatherResponse copy(@org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    ilya.mihailenko.myapplication.entity.weather.current.WeatherResponseMain mainInfo, @org.jetbrains.annotations.NotNull()
    ilya.mihailenko.myapplication.entity.weather.current.WeatherResponseWind wind) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public CurrentWeatherResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    ilya.mihailenko.myapplication.entity.weather.current.WeatherResponseMain mainInfo, @org.jetbrains.annotations.NotNull()
    ilya.mihailenko.myapplication.entity.weather.current.WeatherResponseWind wind) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ilya.mihailenko.myapplication.entity.weather.current.WeatherResponseMain component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ilya.mihailenko.myapplication.entity.weather.current.WeatherResponseMain getMainInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ilya.mihailenko.myapplication.entity.weather.current.WeatherResponseWind component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ilya.mihailenko.myapplication.entity.weather.current.WeatherResponseWind getWind() {
        return null;
    }
}