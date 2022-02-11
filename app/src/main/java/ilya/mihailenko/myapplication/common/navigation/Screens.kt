package ilya.mihailenko.myapplication.common.navigation

import com.github.terrakok.cicerone.androidx.FragmentScreen
import ilya.mihailenko.myapplication.presentation.weather.WeatherFragment


object Screens {
    fun WeatherScreen() = FragmentScreen { WeatherFragment.newInstance() }

}