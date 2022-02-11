package ilya.mihailenko.myapplication.model.facade.currentweather

import android.annotation.SuppressLint
import ilya.mihailenko.myapplication.common.gps.GpsConnectionManager
import ilya.mihailenko.myapplication.common.gps.GpsState
import ilya.mihailenko.myapplication.common.location.CurrentLocationTracker
import ilya.mihailenko.myapplication.entity.errors.NoGpsError
import ilya.mihailenko.myapplication.entity.weather.current.CurrentWeather
import ilya.mihailenko.myapplication.model.interactor.weather.WeatherInteractor
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject


class CurrentWeatherFacadeImpl @Inject constructor(
    private val currentLocationTracker: CurrentLocationTracker,
    private val gpsConnectionManager: GpsConnectionManager,
    private val weatherInteractor: WeatherInteractor
) : CurrentWeatherFacade {

    @SuppressLint("MissingPermission")
    override fun getCurrentWeather(): Single<CurrentWeather> {
        val gpsState = gpsConnectionManager.getGpsState()

        return if (gpsState == GpsState.DISABLED) {
            Single.error(NoGpsError())
        } else {
            currentLocationTracker.getCurrentLocation()
                .flatMap { weatherInteractor.getCurrentWeather(it) }
        }
    }
}