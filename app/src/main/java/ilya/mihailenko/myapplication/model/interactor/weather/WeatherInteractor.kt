package ilya.mihailenko.myapplication.model.interactor.weather

import android.location.Location
import ilya.mihailenko.myapplication.entity.weather.current.CurrentWeather
import io.reactivex.rxjava3.core.Single


interface WeatherInteractor {

    fun getCurrentWeather(location: Location): Single<CurrentWeather>
}