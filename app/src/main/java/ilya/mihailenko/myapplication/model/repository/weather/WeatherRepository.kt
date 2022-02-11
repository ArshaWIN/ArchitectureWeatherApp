package ilya.mihailenko.myapplication.model.repository.weather

import ilya.mihailenko.myapplication.entity.weather.current.CurrentWeather
import io.reactivex.rxjava3.core.Single


interface WeatherRepository {

    fun getCurrentWeather(city: String): Single<CurrentWeather>
}