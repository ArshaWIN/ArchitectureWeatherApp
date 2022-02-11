package ilya.mihailenko.myapplication.entity.weather.current

import com.google.gson.annotations.SerializedName


data class CurrentWeatherResponse(
    @SerializedName("name")
    val city: String,
    @SerializedName("main")
    val mainInfo: WeatherResponseMain,
    val wind: WeatherResponseWind
)

fun CurrentWeatherResponse.toCurrentWeather(): CurrentWeather {
    return CurrentWeather(
        temperature = mainInfo.temperature,
        pressure = mainInfo.pressure,
        humidity = mainInfo.humidity,
        city = city,
        wind = wind.speed
    )
}