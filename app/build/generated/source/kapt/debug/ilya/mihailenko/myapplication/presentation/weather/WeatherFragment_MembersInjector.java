// Generated by Dagger (https://dagger.dev).
package ilya.mihailenko.myapplication.presentation.weather;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WeatherFragment_MembersInjector implements MembersInjector<WeatherFragment> {
  private final Provider<WeatherViewModel.Factory> weatherViewModelFactoryProvider;

  public WeatherFragment_MembersInjector(
      Provider<WeatherViewModel.Factory> weatherViewModelFactoryProvider) {
    this.weatherViewModelFactoryProvider = weatherViewModelFactoryProvider;
  }

  public static MembersInjector<WeatherFragment> create(
      Provider<WeatherViewModel.Factory> weatherViewModelFactoryProvider) {
    return new WeatherFragment_MembersInjector(weatherViewModelFactoryProvider);
  }

  @Override
  public void injectMembers(WeatherFragment instance) {
    injectWeatherViewModelFactory(instance, weatherViewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("ilya.mihailenko.myapplication.presentation.weather.WeatherFragment.weatherViewModelFactory")
  public static void injectWeatherViewModelFactory(WeatherFragment instance,
      WeatherViewModel.Factory weatherViewModelFactory) {
    instance.weatherViewModelFactory = weatherViewModelFactory;
  }
}