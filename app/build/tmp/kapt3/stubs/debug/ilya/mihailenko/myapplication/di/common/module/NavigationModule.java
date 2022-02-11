package ilya.mihailenko.myapplication.di.common.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\u0005H\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lilya/mihailenko/myapplication/di/common/module/NavigationModule;", "", "()V", "cicerone", "Lcom/github/terrakok/cicerone/Cicerone;", "Lilya/mihailenko/myapplication/common/navigation/AppRouter;", "provideAppNavigationHolder", "Lcom/github/terrakok/cicerone/NavigatorHolder;", "provideAppRouter", "app_debug"})
@dagger.Module()
public final class NavigationModule {
    private final com.github.terrakok.cicerone.Cicerone<ilya.mihailenko.myapplication.common.navigation.AppRouter> cicerone = null;
    
    public NavigationModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final ilya.mihailenko.myapplication.common.navigation.AppRouter provideAppRouter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.github.terrakok.cicerone.NavigatorHolder provideAppNavigationHolder() {
        return null;
    }
}