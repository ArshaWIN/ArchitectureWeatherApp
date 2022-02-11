package ilya.mihailenko.myapplication.di.activity

import android.app.Application
import android.content.Context
import android.location.Geocoder
import com.android.therun.di.app.activity.PerActivity
import com.github.terrakok.cicerone.NavigatorHolder
import dagger.Component
import ilya.mihailenko.myapplication.common.activityprovider.ActivityProvider
import ilya.mihailenko.myapplication.common.gps.GpsConnectionManager
import ilya.mihailenko.myapplication.common.location.CurrentLocationTracker
import ilya.mihailenko.myapplication.common.location.LocationTracker
import ilya.mihailenko.myapplication.common.navigation.AppRouter
import ilya.mihailenko.myapplication.di.app.AppComponent
import ilya.mihailenko.myapplication.di.common.BaseManager
import ilya.mihailenko.myapplication.di.common.ComponentManager
import ilya.mihailenko.myapplication.model.data.network.WeatherApi
import ilya.mihailenko.myapplication.presentation.base.AppActivity

@PerActivity
@Component(
    dependencies = [AppComponent::class],
    modules = [
        ActivityModule::class,
        CommonActivityModule::class
    ]
)
interface ActivityComponent {
    fun inject(appActivity: AppActivity)

    fun getApplication(): Application
    fun getContext(): Context
    fun getActivityProvider(): ActivityProvider

    fun provideWeatherApi(): WeatherApi

    fun getExtendedRouter(): AppRouter
    fun getNavigationHolder(): NavigatorHolder

    fun provideLocationTracker(): LocationTracker
    fun provideCurrentLocationTracker(): CurrentLocationTracker
    fun provideGpsConnectionManager(): GpsConnectionManager


    @Component.Builder
    interface Builder {
        fun appComponent(component: AppComponent): Builder
        fun appModule(activityModule: ActivityModule): Builder
        fun build(): ActivityComponent
    }

    object Manager : BaseManager<ActivityComponent>(

        clazz = ActivityComponent::class.java,
        createAndSave = {
            val componentManager = ComponentManager.getInstance()

            val activityComponent = DaggerActivityComponent.builder()
                .appComponent(componentManager.applicationComponent)
                .appModule(ActivityModule())
                .build()

            componentManager.addComponent(activityComponent)
        })
}