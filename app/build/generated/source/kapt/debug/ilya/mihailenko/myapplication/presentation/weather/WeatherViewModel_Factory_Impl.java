// Generated by Dagger (https://dagger.dev).
package ilya.mihailenko.myapplication.presentation.weather;

import dagger.internal.DaggerGenerated;
import dagger.internal.InstanceFactory;
import ilya.mihailenko.myapplication.common.permission.RxPermissionsWrapper;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WeatherViewModel_Factory_Impl implements WeatherViewModel.Factory {
  private final WeatherViewModel_Factory delegateFactory;

  WeatherViewModel_Factory_Impl(WeatherViewModel_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public WeatherViewModel create(RxPermissionsWrapper rxPermissionsWrapper) {
    return delegateFactory.get(rxPermissionsWrapper);
  }

  public static Provider<WeatherViewModel.Factory> create(
      WeatherViewModel_Factory delegateFactory) {
    return InstanceFactory.create(new WeatherViewModel_Factory_Impl(delegateFactory));
  }
}
