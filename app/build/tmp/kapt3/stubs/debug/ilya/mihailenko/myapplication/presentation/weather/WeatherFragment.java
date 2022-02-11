package ilya.mihailenko.myapplication.presentation.weather;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0015H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001d"}, d2 = {"Lilya/mihailenko/myapplication/presentation/weather/WeatherFragment;", "Lilya/mihailenko/myapplication/presentation/base/BaseFragment;", "Lilya/mihailenko/myapplication/databinding/FragmentWeatherBinding;", "()V", "layoutRes", "", "getLayoutRes", "()I", "viewModel", "Lilya/mihailenko/myapplication/presentation/weather/WeatherViewModel;", "getViewModel", "()Lilya/mihailenko/myapplication/presentation/weather/WeatherViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "weatherViewModelFactory", "Lilya/mihailenko/myapplication/presentation/weather/WeatherViewModel$Factory;", "getWeatherViewModelFactory", "()Lilya/mihailenko/myapplication/presentation/weather/WeatherViewModel$Factory;", "setWeatherViewModelFactory", "(Lilya/mihailenko/myapplication/presentation/weather/WeatherViewModel$Factory;)V", "inject", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "release", "Companion", "app_debug"})
public final class WeatherFragment extends ilya.mihailenko.myapplication.presentation.base.BaseFragment<ilya.mihailenko.myapplication.databinding.FragmentWeatherBinding> {
    private final int layoutRes = ilya.mihailenko.myapplication.R.layout.fragment_weather;
    @javax.inject.Inject()
    public ilya.mihailenko.myapplication.presentation.weather.WeatherViewModel.Factory weatherViewModelFactory;
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final ilya.mihailenko.myapplication.presentation.weather.WeatherFragment.Companion Companion = null;
    
    public WeatherFragment() {
        super();
    }
    
    @java.lang.Override()
    public int getLayoutRes() {
        return 0;
    }
    
    @java.lang.Override()
    public void inject() {
    }
    
    @java.lang.Override()
    public void release() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ilya.mihailenko.myapplication.presentation.weather.WeatherViewModel.Factory getWeatherViewModelFactory() {
        return null;
    }
    
    public final void setWeatherViewModelFactory(@org.jetbrains.annotations.NotNull()
    ilya.mihailenko.myapplication.presentation.weather.WeatherViewModel.Factory p0) {
    }
    
    private final ilya.mihailenko.myapplication.presentation.weather.WeatherViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lilya/mihailenko/myapplication/presentation/weather/WeatherFragment$Companion;", "", "()V", "newInstance", "Lilya/mihailenko/myapplication/presentation/weather/WeatherFragment;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ilya.mihailenko.myapplication.presentation.weather.WeatherFragment newInstance() {
            return null;
        }
    }
}