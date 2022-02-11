package ilya.mihailenko.myapplication.common.gps

import io.reactivex.rxjava3.core.Flowable

interface GpsConnectionManager {
    fun observeGpsState(): Flowable<GpsState>
    fun getGpsState() : GpsState
}
