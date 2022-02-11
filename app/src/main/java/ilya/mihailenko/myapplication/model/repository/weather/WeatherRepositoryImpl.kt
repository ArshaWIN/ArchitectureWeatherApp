package ilya.mihailenko.myapplication.model.repository.weather

import ilya.mihailenko.myapplication.entity.weather.current.CurrentWeather
import ilya.mihailenko.myapplication.entity.weather.current.toCurrentWeather
import ilya.mihailenko.myapplication.model.data.network.WeatherApi
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject


class WeatherRepositoryImpl @Inject constructor(
    private val weatherApi: WeatherApi
) : WeatherRepository {

    override fun getCurrentWeather(city: String): Single<CurrentWeather> {
        return weatherApi.getCurrentWeather(city)
            .map { it.toCurrentWeather() }
    }

}