package ilya.mihailenko.myapplication.entity.weather.current

import com.google.gson.annotations.SerializedName


data class WeatherResponseMain(
    @SerializedName("temp")
    val temperature: Double,
    val pressure: Int,
    val humidity: Int
)
