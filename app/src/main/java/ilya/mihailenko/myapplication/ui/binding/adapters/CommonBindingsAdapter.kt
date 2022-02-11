package ilya.mihailenko.myapplication.ui.binding.adapters

import android.view.View
import androidx.databinding.BindingAdapter
import ilya.mihailenko.myapplication.utils.ext.visible


object CommonBindingsAdapter {

    @JvmStatic
    @BindingAdapter("android:visibility")
    fun isViewVisible(view: View, isVisible: Boolean) {
        view.visible(isVisible)
    }


}
