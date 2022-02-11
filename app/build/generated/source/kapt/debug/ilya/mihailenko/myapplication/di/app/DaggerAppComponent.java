// Generated by Dagger (https://dagger.dev).
package ilya.mihailenko.myapplication.di.app;

import android.app.Application;
import android.content.Context;
import com.github.terrakok.cicerone.NavigatorHolder;
import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import ilya.mihailenko.myapplication.TheApp;
import ilya.mihailenko.myapplication.TheApp_MembersInjector;
import ilya.mihailenko.myapplication.common.activityprovider.ActivityProvider;
import ilya.mihailenko.myapplication.common.navigation.AppRouter;
import ilya.mihailenko.myapplication.common.resources.ResourcesManager;
import ilya.mihailenko.myapplication.di.common.module.NavigationModule;
import ilya.mihailenko.myapplication.di.common.module.NavigationModule_ProvideAppNavigationHolderFactory;
import ilya.mihailenko.myapplication.di.common.module.NavigationModule_ProvideAppRouterFactory;
import ilya.mihailenko.myapplication.di.common.module.NetworkModule;
import ilya.mihailenko.myapplication.di.common.module.NetworkModule_ProvideGson$app_debugFactory;
import ilya.mihailenko.myapplication.di.common.module.NetworkModule_ProvideLoggingInterceptor$app_debugFactory;
import ilya.mihailenko.myapplication.di.common.module.NetworkModule_ProvideOkHttpBuilder$app_debugFactory;
import ilya.mihailenko.myapplication.di.common.module.NetworkModule_ProvideRetrofitBuilder$app_debugFactory;
import ilya.mihailenko.myapplication.di.common.module.NetworkModule_ProvideWeatherApi$app_debugFactory;
import ilya.mihailenko.myapplication.model.data.network.WeatherApi;
import ilya.mihailenko.myapplication.model.data.network.interceptor.AppInfoInterceptor;
import ilya.mihailenko.myapplication.model.data.network.interceptor.AppInfoInterceptor_Factory;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAppComponent implements AppComponent {
  private final DaggerAppComponent appComponent = this;

  private Provider<Application> provideApplication$app_debugProvider;

  private Provider<Context> provideContext$app_debugProvider;

  private Provider<ActivityProvider> provideActivityProvider$app_debugProvider;

  private Provider<AppRouter> provideAppRouterProvider;

  private Provider<NavigatorHolder> provideAppNavigationHolderProvider;

  private Provider<Gson> provideGson$app_debugProvider;

  private Provider<Retrofit.Builder> provideRetrofitBuilder$app_debugProvider;

  private Provider<HttpLoggingInterceptor> provideLoggingInterceptor$app_debugProvider;

  private Provider<OkHttpClient.Builder> provideOkHttpBuilder$app_debugProvider;

  private Provider<AppInfoInterceptor> appInfoInterceptorProvider;

  private Provider<WeatherApi> provideWeatherApi$app_debugProvider;

  private Provider<ResourcesManager> provideResourceManagerProvider;

  private DaggerAppComponent(AppModule appModuleParam, NavigationModule navigationModuleParam,
      CommonAppModule commonAppModuleParam, NetworkModule networkModuleParam) {

    initialize(appModuleParam, navigationModuleParam, commonAppModuleParam, networkModuleParam);

  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final AppModule appModuleParam,
      final NavigationModule navigationModuleParam, final CommonAppModule commonAppModuleParam,
      final NetworkModule networkModuleParam) {
    this.provideApplication$app_debugProvider = DoubleCheck.provider(AppModule_ProvideApplication$app_debugFactory.create(appModuleParam));
    this.provideContext$app_debugProvider = DoubleCheck.provider(AppModule_ProvideContext$app_debugFactory.create(appModuleParam));
    this.provideActivityProvider$app_debugProvider = DoubleCheck.provider(AppModule_ProvideActivityProvider$app_debugFactory.create(appModuleParam));
    this.provideAppRouterProvider = DoubleCheck.provider(NavigationModule_ProvideAppRouterFactory.create(navigationModuleParam));
    this.provideAppNavigationHolderProvider = DoubleCheck.provider(NavigationModule_ProvideAppNavigationHolderFactory.create(navigationModuleParam));
    this.provideGson$app_debugProvider = DoubleCheck.provider(NetworkModule_ProvideGson$app_debugFactory.create(networkModuleParam));
    this.provideRetrofitBuilder$app_debugProvider = DoubleCheck.provider(NetworkModule_ProvideRetrofitBuilder$app_debugFactory.create(networkModuleParam, provideGson$app_debugProvider));
    this.provideLoggingInterceptor$app_debugProvider = DoubleCheck.provider(NetworkModule_ProvideLoggingInterceptor$app_debugFactory.create(networkModuleParam));
    this.provideOkHttpBuilder$app_debugProvider = DoubleCheck.provider(NetworkModule_ProvideOkHttpBuilder$app_debugFactory.create(networkModuleParam, provideLoggingInterceptor$app_debugProvider));
    this.appInfoInterceptorProvider = DoubleCheck.provider(AppInfoInterceptor_Factory.create());
    this.provideWeatherApi$app_debugProvider = DoubleCheck.provider(NetworkModule_ProvideWeatherApi$app_debugFactory.create(networkModuleParam, provideRetrofitBuilder$app_debugProvider, provideOkHttpBuilder$app_debugProvider, appInfoInterceptorProvider));
    this.provideResourceManagerProvider = DoubleCheck.provider(CommonAppModule_ProvideResourceManagerFactory.create(commonAppModuleParam, provideContext$app_debugProvider));
  }

  @Override
  public Application getApplication() {
    return provideApplication$app_debugProvider.get();
  }

  @Override
  public Context getContext() {
    return provideContext$app_debugProvider.get();
  }

  @Override
  public ActivityProvider getActivityProvider() {
    return provideActivityProvider$app_debugProvider.get();
  }

  @Override
  public AppRouter provideAppRouter() {
    return provideAppRouterProvider.get();
  }

  @Override
  public NavigatorHolder provideNavigationHolder() {
    return provideAppNavigationHolderProvider.get();
  }

  @Override
  public WeatherApi provideWeatherApi() {
    return provideWeatherApi$app_debugProvider.get();
  }

  @Override
  public ResourcesManager provideResourcesManager() {
    return provideResourceManagerProvider.get();
  }

  @Override
  public void inject(TheApp theApp) {
    injectTheApp(theApp);
  }

  private TheApp injectTheApp(TheApp instance) {
    TheApp_MembersInjector.injectActivityProvider(instance, provideActivityProvider$app_debugProvider.get());
    return instance;
  }

  private static final class Builder implements AppComponent.Builder {
    private AppModule appModule;

    @Override
    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }

    @Override
    public AppComponent build() {
      Preconditions.checkBuilderRequirement(appModule, AppModule.class);
      return new DaggerAppComponent(appModule, new NavigationModule(), new CommonAppModule(), new NetworkModule());
    }
  }
}
