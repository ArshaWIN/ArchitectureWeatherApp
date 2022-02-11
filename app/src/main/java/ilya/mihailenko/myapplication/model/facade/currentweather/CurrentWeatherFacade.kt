package ilya.mihailenko.myapplication.model.facade.currentweather

import ilya.mihailenko.myapplication.entity.weather.current.CurrentWeather
import io.reactivex.rxjava3.core.Single


interface CurrentWeatherFacade {

   fun getCurrentWeather() : Single<CurrentWeather>
}