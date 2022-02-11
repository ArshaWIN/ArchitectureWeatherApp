package ilya.mihailenko.myapplication.di.features.weather;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\b"}, d2 = {"Lilya/mihailenko/myapplication/di/features/weather/WeatherComponent;", "", "inject", "", "weatherFragment", "Lilya/mihailenko/myapplication/presentation/weather/WeatherFragment;", "Builder", "Manager", "app_debug"})
@dagger.Component(dependencies = {ilya.mihailenko.myapplication.di.activity.ActivityComponent.class}, modules = {ilya.mihailenko.myapplication.di.features.weather.WeatherModule.class})
@ilya.mihailenko.myapplication.di.common.scopes.PerFeature()
public abstract interface WeatherComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    ilya.mihailenko.myapplication.presentation.weather.WeatherFragment weatherFragment);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lilya/mihailenko/myapplication/di/features/weather/WeatherComponent$Builder;", "", "activityComponent", "component", "Lilya/mihailenko/myapplication/di/activity/ActivityComponent;", "build", "Lilya/mihailenko/myapplication/di/features/weather/WeatherComponent;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        public abstract ilya.mihailenko.myapplication.di.features.weather.WeatherComponent.Builder activityComponent(@org.jetbrains.annotations.NotNull()
        ilya.mihailenko.myapplication.di.activity.ActivityComponent component);
        
        @org.jetbrains.annotations.NotNull()
        public abstract ilya.mihailenko.myapplication.di.features.weather.WeatherComponent build();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lilya/mihailenko/myapplication/di/features/weather/WeatherComponent$Manager;", "Lilya/mihailenko/myapplication/di/common/BaseManager;", "Lilya/mihailenko/myapplication/di/features/weather/WeatherComponent;", "()V", "app_debug"})
    public static final class Manager extends ilya.mihailenko.myapplication.di.common.BaseManager<ilya.mihailenko.myapplication.di.features.weather.WeatherComponent> {
        @org.jetbrains.annotations.NotNull()
        public static final ilya.mihailenko.myapplication.di.features.weather.WeatherComponent.Manager INSTANCE = null;
        
        private Manager() {
            super(null, null);
        }
    }
}