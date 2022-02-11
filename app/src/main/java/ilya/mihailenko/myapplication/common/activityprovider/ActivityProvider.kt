package ilya.mihailenko.myapplication.common.activityprovider

import android.app.Activity
import java.lang.ref.WeakReference

class ActivityProvider {
    private var activityRef: WeakReference<Activity>? = null

    fun setActivityRef(activityRef: Activity) {
        this.activityRef = WeakReference(activityRef)
    }

    val activity: Activity?
        get() = if (activityRef != null) activityRef?.get() else null
}