package ilya.mihailenko.myapplication.presentation.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.terrakok.cicerone.NavigatorHolder
import com.github.terrakok.cicerone.androidx.AppNavigator
import ilya.mihailenko.myapplication.R
import ilya.mihailenko.myapplication.common.navigation.AppRouter
import ilya.mihailenko.myapplication.common.navigation.Screens
import ilya.mihailenko.myapplication.di.activity.ActivityComponent
import javax.inject.Inject

class AppActivity : AppCompatActivity() {


    @Inject
    lateinit var navigatorHolder: NavigatorHolder

    @Inject
    lateinit var router: AppRouter

    private val navigator: AppNavigator = AppNavigator(this, R.id.container)

    private val currentFragment: BaseFragment<*>?
        get() = supportFragmentManager.findFragmentById(R.id.container) as? BaseFragment<*>


    override fun onCreate(savedInstanceState: Bundle?) {
        inject()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_container)

        if (savedInstanceState == null) {
            router.newRootScreen(Screens.WeatherScreen())
        }

    }

    private fun inject() {
        ActivityComponent.Manager.getComponent().inject(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        if (isFinishing) {
            ActivityComponent.Manager.release()
        }
    }

    override fun onResumeFragments() {
        super.onResumeFragments()
        navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        super.onPause()
        navigatorHolder.removeNavigator()
    }

    override fun onBackPressed() {
        currentFragment?.onBackPressed() ?: super.onBackPressed()
    }
}