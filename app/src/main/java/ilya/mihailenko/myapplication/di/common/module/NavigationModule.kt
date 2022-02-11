package ilya.mihailenko.myapplication.di.common.module

import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.NavigatorHolder
import dagger.Module
import dagger.Provides
import ilya.mihailenko.myapplication.common.navigation.AppRouter
import javax.inject.Singleton

@Module
class NavigationModule {

    private val cicerone: Cicerone<AppRouter> = Cicerone.create(AppRouter())

    @Provides
    @Singleton
    fun provideAppRouter(): AppRouter = cicerone.router

    @Provides
    @Singleton
    fun provideAppNavigationHolder(): NavigatorHolder = cicerone.getNavigatorHolder()
}