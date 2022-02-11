package ilya.mihailenko.myapplication.presentation.weather

import android.os.Bundle
import android.os.Handler
import android.view.View
import ilya.mihailenko.myapplication.R
import ilya.mihailenko.myapplication.common.permission.RxPermissionsWrapper
import ilya.mihailenko.myapplication.databinding.FragmentWeatherBinding
import ilya.mihailenko.myapplication.di.features.weather.WeatherComponent
import ilya.mihailenko.myapplication.presentation.base.BaseFragment
import ilya.mihailenko.myapplication.utils.ext.lazyViewModel
import javax.inject.Inject


class WeatherFragment : BaseFragment<FragmentWeatherBinding>() {
    override val layoutRes: Int = R.layout.fragment_weather

    override fun inject() = WeatherComponent.Manager.getComponent().inject(this)
    override fun release() = WeatherComponent.Manager.release()

    @Inject
    lateinit var weatherViewModelFactory: WeatherViewModel.Factory

    private val viewModel: WeatherViewModel by lazyViewModel {
        weatherViewModelFactory.create(RxPermissionsWrapper(this))
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this.viewLifecycleOwner
//        viewModel.onSwipeToRefreshed()
        binding.swipeRefreshLayout.setOnRefreshListener {
            viewModel.onSwipeToRefreshed()
            binding.swipeRefreshLayout.isRefreshing = false
        }
    }

    companion object {
        fun newInstance() = WeatherFragment()
    }

}