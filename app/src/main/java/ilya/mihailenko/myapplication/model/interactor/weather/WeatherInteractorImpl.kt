package ilya.mihailenko.myapplication.model.interactor.weather

import android.location.Address
import android.location.Geocoder
import android.location.Location
import ilya.mihailenko.myapplication.entity.errors.CityNotRecognizedError
import ilya.mihailenko.myapplication.entity.weather.current.CurrentWeather
import ilya.mihailenko.myapplication.model.repository.weather.WeatherRepository
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject


class WeatherInteractorImpl @Inject constructor(
    private val weatherRepository: WeatherRepository,
    private val geocoder: Geocoder
) : WeatherInteractor {


    override fun getCurrentWeather(location: Location): Single<CurrentWeather> {
        val addresses: List<Address> =
            geocoder.getFromLocation(location.latitude, location.longitude, 1)
        return if (addresses.isNotEmpty()) {
            val city = addresses[0].locality
            weatherRepository.getCurrentWeather(city)
        } else {
            Single.error(CityNotRecognizedError())
        }
    }
}