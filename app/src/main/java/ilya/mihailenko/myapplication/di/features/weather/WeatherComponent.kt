package ilya.mihailenko.myapplication.di.features.weather

import ilya.mihailenko.myapplication.di.common.scopes.PerFeature
import dagger.Component
import ilya.mihailenko.myapplication.di.activity.ActivityComponent
import ilya.mihailenko.myapplication.di.common.BaseManager
import ilya.mihailenko.myapplication.di.common.ComponentManager
import ilya.mihailenko.myapplication.presentation.weather.WeatherFragment

@PerFeature
@Component(dependencies = [ActivityComponent::class], modules = [WeatherModule::class])
interface WeatherComponent {
    fun inject(weatherFragment: WeatherFragment)

    @Component.Builder
    interface Builder {
        fun activityComponent(component: ActivityComponent): Builder
        fun build(): WeatherComponent
    }

    object Manager : BaseManager<WeatherComponent>(
            clazz = WeatherComponent::class.java,
            createAndSave = {
                val componentManager = ComponentManager.getInstance()
                val activityComponent = ActivityComponent.Manager.getComponent()

                val weatherComponent = DaggerWeatherComponent.builder()
                        .activityComponent(activityComponent)
                        .build()

                componentManager.addComponent(weatherComponent)
            })

}