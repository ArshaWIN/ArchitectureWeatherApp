package ilya.mihailenko.myapplication.di.app

import android.app.Application
import android.content.Context
import com.github.terrakok.cicerone.NavigatorHolder
import dagger.Component
import ilya.mihailenko.myapplication.TheApp
import ilya.mihailenko.myapplication.common.activityprovider.ActivityProvider
import ilya.mihailenko.myapplication.common.navigation.AppRouter
import ilya.mihailenko.myapplication.common.resources.ResourcesManager
import ilya.mihailenko.myapplication.di.common.module.NavigationModule
import ilya.mihailenko.myapplication.di.common.module.NetworkModule
import ilya.mihailenko.myapplication.model.data.network.WeatherApi
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        NavigationModule::class,
        CommonAppModule::class,
        NetworkModule::class
    ]
)
interface AppComponent {

    fun getApplication(): Application
    fun getContext(): Context
    fun getActivityProvider(): ActivityProvider

    fun provideAppRouter(): AppRouter
    fun provideNavigationHolder(): NavigatorHolder

    fun provideWeatherApi(): WeatherApi

    fun provideResourcesManager(): ResourcesManager


    fun inject(theApp: TheApp)

    @Component.Builder
    interface Builder {
        fun appModule(appModule: AppModule): Builder
        fun build(): AppComponent
    }
}