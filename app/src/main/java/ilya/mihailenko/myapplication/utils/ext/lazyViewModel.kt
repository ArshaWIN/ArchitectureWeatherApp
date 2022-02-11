package ilya.mihailenko.myapplication.utils.ext

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import ilya.mihailenko.myapplication.presentation.base.Factory

inline fun <reified T : ViewModel> Fragment.lazyViewModel(
    noinline create: () -> T
) = viewModels<T> { Factory(create) }