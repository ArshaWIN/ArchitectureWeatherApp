package ilya.mihailenko.myapplication.common.gps

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.location.LocationManager
import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.processors.BehaviorProcessor
import java.util.concurrent.TimeUnit


class GpsReceiver(private val context: Context) : BroadcastReceiver() {

    private val gpsObserver = BehaviorProcessor.create<GpsState>()

    override fun onReceive(context: Context, intent: Intent) {
        gpsObserver.onNext(getGpsState(context))
    }

    fun observeGpsState(): Flowable<GpsState> {
        return gpsObserver
            .debounce(CONNECTION_CHECK_DEBOUNCE.toLong(), TimeUnit.MILLISECONDS)
            .startWithItem(getGpsState(context))
    }

    private fun isGpsEnabled(context: Context): Boolean {
        val locationManager = context.getSystemService(Context.LOCATION_SERVICE) as LocationManager?
        return locationManager != null && locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)

    }

    fun getGpsState(context: Context): GpsState {
        return if (isGpsEnabled(context)) GpsState.ENABLED else GpsState.DISABLED
    }

    companion object {
        const val CONNECTION_CHECK_DEBOUNCE = 200
    }
}
