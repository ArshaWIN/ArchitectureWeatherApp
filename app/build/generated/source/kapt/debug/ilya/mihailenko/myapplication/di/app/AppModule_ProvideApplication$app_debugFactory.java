// Generated by Dagger (https://dagger.dev).
package ilya.mihailenko.myapplication.di.app;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideApplication$app_debugFactory implements Factory<Application> {
  private final AppModule module;

  public AppModule_ProvideApplication$app_debugFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public Application get() {
    return provideApplication$app_debug(module);
  }

  public static AppModule_ProvideApplication$app_debugFactory create(AppModule module) {
    return new AppModule_ProvideApplication$app_debugFactory(module);
  }

  public static Application provideApplication$app_debug(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideApplication$app_debug());
  }
}
