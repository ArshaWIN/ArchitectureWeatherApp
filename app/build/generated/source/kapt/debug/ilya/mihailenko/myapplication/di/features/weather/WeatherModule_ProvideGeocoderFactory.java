// Generated by Dagger (https://dagger.dev).
package ilya.mihailenko.myapplication.di.features.weather;

import android.content.Context;
import android.location.Geocoder;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WeatherModule_ProvideGeocoderFactory implements Factory<Geocoder> {
  private final Provider<Context> contextProvider;

  public WeatherModule_ProvideGeocoderFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public Geocoder get() {
    return provideGeocoder(contextProvider.get());
  }

  public static WeatherModule_ProvideGeocoderFactory create(Provider<Context> contextProvider) {
    return new WeatherModule_ProvideGeocoderFactory(contextProvider);
  }

  public static Geocoder provideGeocoder(Context context) {
    return Preconditions.checkNotNullFromProvides(WeatherModule.provideGeocoder(context));
  }
}
