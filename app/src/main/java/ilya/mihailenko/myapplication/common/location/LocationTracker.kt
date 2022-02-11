package ilya.mihailenko.myapplication.common.location

import android.location.Location
import android.os.Looper
import androidx.annotation.RequiresPermission
import com.google.android.gms.location.*
import com.google.android.gms.location.LocationCallback
import ilya.mihailenko.myapplication.common.activityprovider.ActivityProvider
import io.reactivex.rxjava3.core.BackpressureStrategy
import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.subjects.PublishSubject

class LocationTracker(private val activityProvider: ActivityProvider) {

    private var isStartedLocationUpdates = false

    private val locationClient: FusedLocationProviderClient by lazy {
        val activity = activityProvider.activity
        checkNotNull(activity) { "Activity must be set" }
        LocationServices.getFusedLocationProviderClient(activity)
    }

    private val locationSubject: PublishSubject<Location> = PublishSubject.create()
    private var locationCallback: ReactiveLocationCallback? = null

    private val locationRequest: LocationRequest by lazy {
        LocationRequest.create().apply {
            interval = UPDATES_INTERVAL
            fastestInterval = FASTEST_INTERVAL
            priority = LocationRequest.PRIORITY_HIGH_ACCURACY
        }
    }

    @RequiresPermission(
        allOf = ["android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"]
    )
    fun getLocationUpdates(): Flowable<Location> {

        if (!isStartedLocationUpdates()) {
            isStartedLocationUpdates = true
            locationCallback = ReactiveLocationCallback(locationSubject)
            locationCallback?.let {
                locationClient.requestLocationUpdates(
                    locationRequest, it, Looper.getMainLooper()
                )
            }
        }

        return locationSubject.toFlowable(BackpressureStrategy.LATEST)
    }

    fun stopLocationUpdates() {
        locationCallback?.let { locationClient.removeLocationUpdates(it) }
        locationCallback = null
    }

    private fun isStartedLocationUpdates() = isStartedLocationUpdates && locationCallback != null

    private inner class ReactiveLocationCallback constructor(
        private val locationSubject: PublishSubject<Location>
    ) : LocationCallback() {

        override fun onLocationResult(locationResult: LocationResult) {
            locationSubject.onNext(locationResult.lastLocation)
        }
    }

    companion object {
        private const val UPDATES_INTERVAL = 500L
        private const val FASTEST_INTERVAL = 200L
    }
}
