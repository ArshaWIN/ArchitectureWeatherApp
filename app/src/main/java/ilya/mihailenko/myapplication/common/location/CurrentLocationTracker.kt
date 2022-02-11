package ilya.mihailenko.myapplication.common.location

import android.location.Location
import android.os.Looper
import androidx.annotation.RequiresPermission
import com.google.android.gms.location.*
import ilya.mihailenko.myapplication.common.activityprovider.ActivityProvider
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.core.SingleEmitter

class CurrentLocationTracker(private val activityProvider: ActivityProvider) {

    private val locationClient: FusedLocationProviderClient by lazy {
        val activity = activityProvider.activity
        checkNotNull(activity) { "Activity must be set" }
        LocationServices.getFusedLocationProviderClient(activity)
    }

    private val locationRequest: LocationRequest
        get() {
            val locationRequest = LocationRequest.create()
            locationRequest.numUpdates = 1
            locationRequest.priority = LocationRequest.PRIORITY_HIGH_ACCURACY
            return locationRequest
        }

    @RequiresPermission(allOf = ["android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"])
    fun getCurrentLocation(): Single<Location> {
        return Single.create { emitter ->
            val lastLocationTask = locationClient.lastLocation

            lastLocationTask.addOnCompleteListener { command ->
                val location = command.result

                if (location != null) {
                    emitter.onSuccess(location)
                } else {
                    requestLocation(emitter)
                }
            }
        }
    }

    @RequiresPermission(allOf = ["android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"])
    private fun requestLocation(singleEmitter: SingleEmitter<Location>) {

        val locationCallback = object : LocationCallback() {

            override fun onLocationResult(locationResult: LocationResult) {
                singleEmitter.onSuccess(locationResult.lastLocation)
            }
        }

        locationClient.requestLocationUpdates(locationRequest, locationCallback, Looper.getMainLooper())

        singleEmitter.setCancellable {
            locationClient.removeLocationUpdates(locationCallback)
        }
    }

}
