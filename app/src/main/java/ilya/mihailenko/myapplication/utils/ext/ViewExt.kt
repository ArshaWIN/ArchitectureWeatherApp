package ilya.mihailenko.myapplication.utils.ext

import android.view.View


fun View.visible(isVisible: Boolean) {
    visibility = if (isVisible) View.VISIBLE else View.GONE
}