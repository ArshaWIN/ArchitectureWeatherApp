package ilya.mihailenko.myapplication.model.data.network

import ilya.mihailenko.myapplication.entity.weather.current.CurrentWeatherResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query


interface WeatherApi {

    @GET("weather")
    fun getCurrentWeather(
        @Query("q") city: String,
        @Query("units") units: String = "metric"
    ): Single<CurrentWeatherResponse>
}