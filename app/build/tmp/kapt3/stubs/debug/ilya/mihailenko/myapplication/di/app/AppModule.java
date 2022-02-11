package ilya.mihailenko.myapplication.di.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007J\r\u0010\b\u001a\u00020\u0003H\u0001\u00a2\u0006\u0002\b\tJ\r\u0010\n\u001a\u00020\u000bH\u0001\u00a2\u0006\u0002\b\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lilya/mihailenko/myapplication/di/app/AppModule;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "provideActivityProvider", "Lilya/mihailenko/myapplication/common/activityprovider/ActivityProvider;", "provideActivityProvider$app_debug", "provideApplication", "provideApplication$app_debug", "provideContext", "Landroid/content/Context;", "provideContext$app_debug", "app_debug"})
@dagger.Module()
public final class AppModule {
    private final android.app.Application application = null;
    
    public AppModule(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.app.Application provideApplication$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final ilya.mihailenko.myapplication.common.activityprovider.ActivityProvider provideActivityProvider$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.Context provideContext$app_debug() {
        return null;
    }
}