package ilya.mihailenko.myapplication.di.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0018\u0019J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\u0017H&\u00a8\u0006\u001a"}, d2 = {"Lilya/mihailenko/myapplication/di/activity/ActivityComponent;", "", "getActivityProvider", "Lilya/mihailenko/myapplication/common/activityprovider/ActivityProvider;", "getApplication", "Landroid/app/Application;", "getContext", "Landroid/content/Context;", "getExtendedRouter", "Lilya/mihailenko/myapplication/common/navigation/AppRouter;", "getNavigationHolder", "Lcom/github/terrakok/cicerone/NavigatorHolder;", "inject", "", "appActivity", "Lilya/mihailenko/myapplication/presentation/base/AppActivity;", "provideCurrentLocationTracker", "Lilya/mihailenko/myapplication/common/location/CurrentLocationTracker;", "provideGpsConnectionManager", "Lilya/mihailenko/myapplication/common/gps/GpsConnectionManager;", "provideLocationTracker", "Lilya/mihailenko/myapplication/common/location/LocationTracker;", "provideWeatherApi", "Lilya/mihailenko/myapplication/model/data/network/WeatherApi;", "Builder", "Manager", "app_debug"})
@dagger.Component(dependencies = {ilya.mihailenko.myapplication.di.app.AppComponent.class}, modules = {ilya.mihailenko.myapplication.di.activity.ActivityModule.class, ilya.mihailenko.myapplication.di.activity.CommonActivityModule.class})
@com.android.therun.di.app.activity.PerActivity()
public abstract interface ActivityComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    ilya.mihailenko.myapplication.presentation.base.AppActivity appActivity);
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.app.Application getApplication();
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Context getContext();
    
    @org.jetbrains.annotations.NotNull()
    public abstract ilya.mihailenko.myapplication.common.activityprovider.ActivityProvider getActivityProvider();
    
    @org.jetbrains.annotations.NotNull()
    public abstract ilya.mihailenko.myapplication.model.data.network.WeatherApi provideWeatherApi();
    
    @org.jetbrains.annotations.NotNull()
    public abstract ilya.mihailenko.myapplication.common.navigation.AppRouter getExtendedRouter();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.github.terrakok.cicerone.NavigatorHolder getNavigationHolder();
    
    @org.jetbrains.annotations.NotNull()
    public abstract ilya.mihailenko.myapplication.common.location.LocationTracker provideLocationTracker();
    
    @org.jetbrains.annotations.NotNull()
    public abstract ilya.mihailenko.myapplication.common.location.CurrentLocationTracker provideCurrentLocationTracker();
    
    @org.jetbrains.annotations.NotNull()
    public abstract ilya.mihailenko.myapplication.common.gps.GpsConnectionManager provideGpsConnectionManager();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H&J\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lilya/mihailenko/myapplication/di/activity/ActivityComponent$Builder;", "", "appComponent", "component", "Lilya/mihailenko/myapplication/di/app/AppComponent;", "appModule", "activityModule", "Lilya/mihailenko/myapplication/di/activity/ActivityModule;", "build", "Lilya/mihailenko/myapplication/di/activity/ActivityComponent;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        public abstract ilya.mihailenko.myapplication.di.activity.ActivityComponent.Builder appComponent(@org.jetbrains.annotations.NotNull()
        ilya.mihailenko.myapplication.di.app.AppComponent component);
        
        @org.jetbrains.annotations.NotNull()
        public abstract ilya.mihailenko.myapplication.di.activity.ActivityComponent.Builder appModule(@org.jetbrains.annotations.NotNull()
        ilya.mihailenko.myapplication.di.activity.ActivityModule activityModule);
        
        @org.jetbrains.annotations.NotNull()
        public abstract ilya.mihailenko.myapplication.di.activity.ActivityComponent build();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lilya/mihailenko/myapplication/di/activity/ActivityComponent$Manager;", "Lilya/mihailenko/myapplication/di/common/BaseManager;", "Lilya/mihailenko/myapplication/di/activity/ActivityComponent;", "()V", "app_debug"})
    public static final class Manager extends ilya.mihailenko.myapplication.di.common.BaseManager<ilya.mihailenko.myapplication.di.activity.ActivityComponent> {
        @org.jetbrains.annotations.NotNull()
        public static final ilya.mihailenko.myapplication.di.activity.ActivityComponent.Manager INSTANCE = null;
        
        private Manager() {
            super(null, null);
        }
    }
}