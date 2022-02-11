package ilya.mihailenko.myapplication.entity.weather.current


data class CurrentWeather(
    val temperature: Double,
    val pressure: Int,
    val humidity: Int,
    val city: String,
    val wind: Double
)
