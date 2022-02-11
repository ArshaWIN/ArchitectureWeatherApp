package ilya.mihailenko.myapplication.di.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\t"}, d2 = {"Lilya/mihailenko/myapplication/di/app/CommonAppModule;", "", "()V", "provideLocationConnectionManager", "Lilya/mihailenko/myapplication/common/gps/GpsConnectionManager;", "context", "Landroid/content/Context;", "provideResourceManager", "Lilya/mihailenko/myapplication/common/resources/ResourcesManager;", "app_debug"})
@dagger.Module()
public final class CommonAppModule {
    
    public CommonAppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final ilya.mihailenko.myapplication.common.resources.ResourcesManager provideResourceManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final ilya.mihailenko.myapplication.common.gps.GpsConnectionManager provideLocationConnectionManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
}