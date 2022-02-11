package ilya.mihailenko.myapplication.presentation.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment


abstract class BaseFragment<TBinding : ViewDataBinding> : Fragment()  {

    protected lateinit var binding: TBinding
    abstract val layoutRes: Int

    private var instanceStateSaved: Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, layoutRes, container, false)
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        inject()
        super.onCreate(savedInstanceState)
    }


    override fun onDestroy() {
        super.onDestroy()
        if (needCloseScope()) {
            release()
        }
    }

    abstract fun inject()

    abstract fun release()

    override fun onResume() {
        super.onResume()
        instanceStateSaved = false
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        instanceStateSaved = true
    }

    private fun isRealRemoving(): Boolean =
        (isRemoving && !instanceStateSaved) //because isRemoving == true for fragment in backstack on screen rotation
                || ((parentFragment as? BaseFragment<*>)?.isRealRemoving() ?: false)

    //It will be valid only for 'onDestroy()' method
    private fun needCloseScope(): Boolean =
        when {
            activity?.isChangingConfigurations == true -> false
            activity?.isFinishing == true -> true
            else -> isRealRemoving()
        }

    open fun onBackPressed() {}
}