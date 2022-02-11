package ilya.mihailenko.myapplication.di.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0014J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0013H&\u00a8\u0006\u0015"}, d2 = {"Lilya/mihailenko/myapplication/di/app/AppComponent;", "", "getActivityProvider", "Lilya/mihailenko/myapplication/common/activityprovider/ActivityProvider;", "getApplication", "Landroid/app/Application;", "getContext", "Landroid/content/Context;", "inject", "", "theApp", "Lilya/mihailenko/myapplication/TheApp;", "provideAppRouter", "Lilya/mihailenko/myapplication/common/navigation/AppRouter;", "provideNavigationHolder", "Lcom/github/terrakok/cicerone/NavigatorHolder;", "provideResourcesManager", "Lilya/mihailenko/myapplication/common/resources/ResourcesManager;", "provideWeatherApi", "Lilya/mihailenko/myapplication/model/data/network/WeatherApi;", "Builder", "app_debug"})
@dagger.Component(modules = {ilya.mihailenko.myapplication.di.app.AppModule.class, ilya.mihailenko.myapplication.di.common.module.NavigationModule.class, ilya.mihailenko.myapplication.di.app.CommonAppModule.class, ilya.mihailenko.myapplication.di.common.module.NetworkModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.app.Application getApplication();
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Context getContext();
    
    @org.jetbrains.annotations.NotNull()
    public abstract ilya.mihailenko.myapplication.common.activityprovider.ActivityProvider getActivityProvider();
    
    @org.jetbrains.annotations.NotNull()
    public abstract ilya.mihailenko.myapplication.common.navigation.AppRouter provideAppRouter();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.github.terrakok.cicerone.NavigatorHolder provideNavigationHolder();
    
    @org.jetbrains.annotations.NotNull()
    public abstract ilya.mihailenko.myapplication.model.data.network.WeatherApi provideWeatherApi();
    
    @org.jetbrains.annotations.NotNull()
    public abstract ilya.mihailenko.myapplication.common.resources.ResourcesManager provideResourcesManager();
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    ilya.mihailenko.myapplication.TheApp theApp);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lilya/mihailenko/myapplication/di/app/AppComponent$Builder;", "", "appModule", "Lilya/mihailenko/myapplication/di/app/AppModule;", "build", "Lilya/mihailenko/myapplication/di/app/AppComponent;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        public abstract ilya.mihailenko.myapplication.di.app.AppComponent.Builder appModule(@org.jetbrains.annotations.NotNull()
        ilya.mihailenko.myapplication.di.app.AppModule appModule);
        
        @org.jetbrains.annotations.NotNull()
        public abstract ilya.mihailenko.myapplication.di.app.AppComponent build();
    }
}