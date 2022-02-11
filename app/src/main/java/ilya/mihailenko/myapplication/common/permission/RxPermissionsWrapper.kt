package ilya.mihailenko.myapplication.common.permission

import android.Manifest.permission.*
import android.annotation.SuppressLint
import android.app.Activity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.tbruyelle.rxpermissions3.RxPermissions
import io.reactivex.rxjava3.core.Single


class RxPermissionsWrapper(private val activity: Activity) {

    private lateinit var rxPermissions: RxPermissions

    constructor(fragmentActivity: FragmentActivity) : this(fragmentActivity as Activity) {
        rxPermissions = RxPermissions(fragmentActivity)
    }

    constructor(fragment: Fragment) : this(fragment.requireActivity()) {
        rxPermissions = RxPermissions(fragment)
    }


    @SuppressLint("InlinedApi")
    fun requestLocationPermissions(): Single<Boolean> {
        return rxPermissions.request(
            ACCESS_COARSE_LOCATION,
            ACCESS_FINE_LOCATION
        )
            .singleOrError()
    }

    fun requestCameraPermissions(): Single<Boolean> {
        return rxPermissions.request(CAMERA)
            .singleOrError()
    }

    fun isLocationPermissionGranted(): Boolean {
        return rxPermissions.isGranted(ACCESS_COARSE_LOCATION)
                && rxPermissions.isGranted(ACCESS_FINE_LOCATION)
    }

    fun isGranted(permission: String): Boolean =
        rxPermissions.isGranted(permission)

    private fun isNeverAskAgain(permission: String): Boolean =
        !rxPermissions.shouldShowRequestPermissionRationale(
            activity,
            permission
        )
            .blockingFirst()
}

