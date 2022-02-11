package ilya.mihailenko.myapplication.presentation.weather

import android.annotation.SuppressLint
import androidx.databinding.ObservableField
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import ilya.mihailenko.myapplication.common.permission.RxPermissionsWrapper
import ilya.mihailenko.myapplication.entity.errors.LocationPermissionsNotGranted
import ilya.mihailenko.myapplication.entity.weather.current.CurrentWeather
import ilya.mihailenko.myapplication.model.facade.currentweather.CurrentWeatherFacade
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.kotlin.addTo
import timber.log.Timber
import androidx.lifecycle.MutableLiveData
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Scheduler
import io.reactivex.rxjava3.schedulers.Schedulers
import java.util.concurrent.TimeUnit


class WeatherViewModel @AssistedInject constructor(
    @Assisted private val rxPermissionsWrapper: RxPermissionsWrapper,
    private val currentWeatherFacade: CurrentWeatherFacade
) : ViewModel(), WeatherViewModelBinding {

    private val compositeDisposable = CompositeDisposable()

    override fun getWeather(): LiveData<String> = currentWeatherLiveData
    override fun getCity(): LiveData<String> = cityLiveData
    override fun isLoading(): LiveData<Boolean> = isLoadingLiveData

    private val currentWeatherLiveData: MutableLiveData<String> = MutableLiveData()
    private val cityLiveData: MutableLiveData<String> = MutableLiveData()
    private val isLoadingLiveData: MutableLiveData<Boolean> = MutableLiveData(false)

    @SuppressLint("MissingPermission")
    fun loadCurrentWeather() {
        rxPermissionsWrapper.requestLocationPermissions()
            .flatMap { granted ->
                if (granted) currentWeatherFacade.getCurrentWeather()
                else Single.error(LocationPermissionsNotGranted())
            }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { isLoadingLiveData.value = true }
            .doAfterTerminate { isLoadingLiveData.value = false }
            .subscribe({ onWeatherLoaded(it) }, { Timber.e(it) })
            .addTo(compositeDisposable)
    }

    private fun onWeatherLoaded(currentWeather: CurrentWeather) {
        val weatherText =
            "temp = ${currentWeather.temperature}, \nwind = ${currentWeather.wind}\nhumidity = ${currentWeather.humidity}\npressure = ${currentWeather.pressure}"
        currentWeatherLiveData.value = weatherText
        cityLiveData.value = currentWeather.city
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.clear()
    }

    fun onSwipeToRefreshed() {
        loadCurrentWeather()
    }

    @AssistedFactory
    interface Factory {
        fun create(rxPermissionsWrapper: RxPermissionsWrapper): WeatherViewModel
    }


}