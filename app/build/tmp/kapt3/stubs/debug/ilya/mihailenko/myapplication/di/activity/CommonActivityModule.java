package ilya.mihailenko.myapplication.di.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\r"}, d2 = {"Lilya/mihailenko/myapplication/di/activity/CommonActivityModule;", "", "()V", "provideCurrentLocationTracker", "Lilya/mihailenko/myapplication/common/location/CurrentLocationTracker;", "activityProvider", "Lilya/mihailenko/myapplication/common/activityprovider/ActivityProvider;", "provideGpsConnectionManager", "Lilya/mihailenko/myapplication/common/gps/GpsConnectionManager;", "context", "Landroid/content/Context;", "provideLocationTracker", "Lilya/mihailenko/myapplication/common/location/LocationTracker;", "app_debug"})
@dagger.Module()
public final class CommonActivityModule {
    
    public CommonActivityModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.android.therun.di.app.activity.PerActivity()
    @dagger.Provides()
    public final ilya.mihailenko.myapplication.common.location.LocationTracker provideLocationTracker(@org.jetbrains.annotations.NotNull()
    ilya.mihailenko.myapplication.common.activityprovider.ActivityProvider activityProvider) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.android.therun.di.app.activity.PerActivity()
    @dagger.Provides()
    public final ilya.mihailenko.myapplication.common.location.CurrentLocationTracker provideCurrentLocationTracker(@org.jetbrains.annotations.NotNull()
    ilya.mihailenko.myapplication.common.activityprovider.ActivityProvider activityProvider) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.android.therun.di.app.activity.PerActivity()
    @dagger.Provides()
    public final ilya.mihailenko.myapplication.common.gps.GpsConnectionManager provideGpsConnectionManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
}