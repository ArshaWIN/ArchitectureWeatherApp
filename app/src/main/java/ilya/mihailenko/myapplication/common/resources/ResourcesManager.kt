package ilya.mihailenko.myapplication.common.resources

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.annotation.*
import androidx.core.content.ContextCompat

class ResourcesManager(private val context: Context) {

    fun getString(@StringRes stringRes: Int): String {
        return context.getString(stringRes)
    }

    fun getString(@StringRes stringRes: Int, vararg args: Any): String {
        return context.getString(stringRes, *args)
    }

    fun getColor(@ColorRes colorRes: Int): Int {
        return ContextCompat.getColor(context, colorRes)
    }

    fun getDimenPixelSize(@DimenRes dimenRes: Int): Int {
        return context.resources.getDimensionPixelSize(dimenRes)
    }

    fun getInteger(@IntegerRes intRes: Int): Int {
        return context.resources.getInteger(intRes)
    }

    fun getPlural(@PluralsRes stringRes: Int, quantity: Int): String {
        return context.resources.getQuantityString(stringRes, quantity)
    }

    fun getPlural(@PluralsRes stringRes: Int, quantity: Int, vararg args: Any): String {
        return context.resources.getQuantityString(stringRes, quantity, *args)
    }

    fun getDrawable(@DrawableRes drawableRes: Int): Drawable? {
        return ContextCompat.getDrawable(context, drawableRes)
    }
}
