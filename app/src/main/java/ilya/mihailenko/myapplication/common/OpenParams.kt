package ilya.mihailenko.myapplication.common

import android.os.Bundle
import android.os.Parcelable
import androidx.fragment.app.Fragment


interface OpenParams : Parcelable {
}

fun <T : OpenParams> T.saveToBundle(bundle: Bundle) {
    val key = this::class.java.simpleName
    bundle.putParcelable(key, this)
}

inline fun <reified T : OpenParams> Fragment.openParams(): T {
    val key = T::class.java.simpleName
    return arguments?.getParcelable(key) ?: error("$key wasn't set")
}


fun <T : OpenParams> Fragment.applyOpenParams(openParams: T?): Fragment {
    return this.apply {
        arguments = Bundle().apply {
            openParams?.saveToBundle(this)
        }
    }
}