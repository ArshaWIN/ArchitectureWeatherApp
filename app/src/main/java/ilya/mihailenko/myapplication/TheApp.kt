package ilya.mihailenko.myapplication

import android.app.Activity
import android.app.Application
import ilya.mihailenko.myapplication.common.activityprovider.ActivityProvider
import ilya.mihailenko.myapplication.common.activityprovider.SimpleActivityLifecycleCallbacks
import ilya.mihailenko.myapplication.di.common.ComponentManager
import timber.log.Timber
import javax.inject.Inject


class TheApp : Application() {

    @Inject
    lateinit var activityProvider: ActivityProvider

    override fun onCreate() {
        super.onCreate()
        registerActivityLifecycleCallbacks(object : SimpleActivityLifecycleCallbacks() {
            override fun onActivityStarted(activity: Activity) {
                activityProvider.setActivityRef(activity)
            }
        })

        ComponentManager.init(this)
        ComponentManager.getInstance().applicationComponent.inject(this)
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}