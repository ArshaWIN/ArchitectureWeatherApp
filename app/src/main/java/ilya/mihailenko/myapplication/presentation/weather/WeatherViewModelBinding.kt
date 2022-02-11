package ilya.mihailenko.myapplication.presentation.weather

import androidx.lifecycle.LiveData


interface WeatherViewModelBinding {
    fun getWeather(): LiveData<String>
    fun getCity(): LiveData<String>
    fun isLoading(): LiveData<Boolean>
}