// Generated by Dagger (https://dagger.dev).
package ilya.mihailenko.myapplication.di.activity;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import ilya.mihailenko.myapplication.common.activityprovider.ActivityProvider;
import ilya.mihailenko.myapplication.common.location.CurrentLocationTracker;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CommonActivityModule_ProvideCurrentLocationTrackerFactory implements Factory<CurrentLocationTracker> {
  private final CommonActivityModule module;

  private final Provider<ActivityProvider> activityProvider;

  public CommonActivityModule_ProvideCurrentLocationTrackerFactory(CommonActivityModule module,
      Provider<ActivityProvider> activityProvider) {
    this.module = module;
    this.activityProvider = activityProvider;
  }

  @Override
  public CurrentLocationTracker get() {
    return provideCurrentLocationTracker(module, activityProvider.get());
  }

  public static CommonActivityModule_ProvideCurrentLocationTrackerFactory create(
      CommonActivityModule module, Provider<ActivityProvider> activityProvider) {
    return new CommonActivityModule_ProvideCurrentLocationTrackerFactory(module, activityProvider);
  }

  public static CurrentLocationTracker provideCurrentLocationTracker(CommonActivityModule instance,
      ActivityProvider activityProvider) {
    return Preconditions.checkNotNullFromProvides(instance.provideCurrentLocationTracker(activityProvider));
  }
}
