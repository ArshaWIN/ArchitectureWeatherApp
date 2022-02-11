package ilya.mihailenko.myapplication.di.features.weather

import android.annotation.SuppressLint
import android.content.Context
import android.location.Geocoder
import dagger.Binds
import dagger.Module
import dagger.Provides
import ilya.mihailenko.myapplication.di.common.scopes.PerFeature
import ilya.mihailenko.myapplication.model.facade.currentweather.CurrentWeatherFacade
import ilya.mihailenko.myapplication.model.facade.currentweather.CurrentWeatherFacadeImpl
import ilya.mihailenko.myapplication.model.interactor.weather.WeatherInteractor
import ilya.mihailenko.myapplication.model.interactor.weather.WeatherInteractorImpl
import ilya.mihailenko.myapplication.model.repository.weather.WeatherRepository
import ilya.mihailenko.myapplication.model.repository.weather.WeatherRepositoryImpl
import java.util.*

@Module
abstract class WeatherModule {

    @Binds
    @PerFeature
    abstract fun provideWeatherInteractor(weatherInteractorImpl: WeatherInteractorImpl): WeatherInteractor

    @Binds
    @PerFeature
    abstract fun provideWeatherRepository(weatherRepository: WeatherRepositoryImpl): WeatherRepository

    @Binds
    @PerFeature
    abstract fun provideCurrentWeatherFacade(currentWeatherFacade: CurrentWeatherFacadeImpl): CurrentWeatherFacade

    @SuppressLint("ModuleCompanionObjects")
    @Module
    companion object {

        @Provides
        @PerFeature
        @JvmStatic
        fun provideGeocoder(context: Context): Geocoder {
            return Geocoder(context, Locale.getDefault())
        }
    }

}