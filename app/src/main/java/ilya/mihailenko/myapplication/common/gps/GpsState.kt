package ilya.mihailenko.myapplication.common.gps

sealed class GpsState {
    object ENABLED : GpsState()
    object DISABLED : GpsState()
}
