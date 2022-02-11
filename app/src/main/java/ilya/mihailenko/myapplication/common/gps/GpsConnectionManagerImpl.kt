package ilya.mihailenko.myapplication.common.gps


import android.content.Context
import android.content.IntentFilter
import android.location.LocationManager
import io.reactivex.rxjava3.core.Flowable

class GpsConnectionManagerImpl(
    private val context: Context
) : GpsConnectionManager {

    private var gpsReceiver: GpsReceiver = GpsReceiver(context)

    init {
        registerReceiver(context)
    }

    private fun registerReceiver(context: Context) {
        val intentFilter = IntentFilter(LocationManager.PROVIDERS_CHANGED_ACTION)
        context.registerReceiver(gpsReceiver, intentFilter)
    }

    override fun observeGpsState(): Flowable<GpsState> {
        return gpsReceiver.observeGpsState()
    }

    override fun getGpsState(): GpsState {
        return gpsReceiver.getGpsState(context)
    }
}
