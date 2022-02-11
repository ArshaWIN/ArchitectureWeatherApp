package ilya.mihailenko.myapplication.databinding;
import ilya.mihailenko.myapplication.R;
import ilya.mihailenko.myapplication.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentWeatherBindingImpl extends FragmentWeatherBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.ProgressBar mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentWeatherBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentWeatherBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[0]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView3 = (android.widget.ProgressBar) bindings[3];
        this.mboundView3.setTag(null);
        this.swipeRefreshLayout.setTag(null);
        this.tvCity.setTag(null);
        this.tvWeather.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((ilya.mihailenko.myapplication.presentation.weather.WeatherViewModelBinding) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable ilya.mihailenko.myapplication.presentation.weather.WeatherViewModelBinding ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelIsLoading((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelWeather((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelCity((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsLoading(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelIsLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelWeather(androidx.lifecycle.LiveData<java.lang.String> ViewModelWeather, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCity(androidx.lifecycle.LiveData<java.lang.String> ViewModelCity, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelIsLoading = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue = false;
        java.lang.String viewModelWeatherGetValue = null;
        androidx.lifecycle.LiveData<java.lang.String> viewModelWeather = null;
        java.lang.String viewModelCityGetValue = null;
        java.lang.Boolean viewModelIsLoadingGetValue = null;
        androidx.lifecycle.LiveData<java.lang.String> viewModelCity = null;
        ilya.mihailenko.myapplication.presentation.weather.WeatherViewModelBinding viewModel = mViewModel;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isLoading()
                        viewModelIsLoading = viewModel.isLoading();
                    }
                    updateLiveDataRegistration(0, viewModelIsLoading);


                    if (viewModelIsLoading != null) {
                        // read viewModel.isLoading().getValue()
                        viewModelIsLoadingGetValue = viewModelIsLoading.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading().getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsLoadingGetValue);
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.weather
                        viewModelWeather = viewModel.getWeather();
                    }
                    updateLiveDataRegistration(1, viewModelWeather);


                    if (viewModelWeather != null) {
                        // read viewModel.weather.getValue()
                        viewModelWeatherGetValue = viewModelWeather.getValue();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.city
                        viewModelCity = viewModel.getCity();
                    }
                    updateLiveDataRegistration(2, viewModelCity);


                    if (viewModelCity != null) {
                        // read viewModel.city.getValue()
                        viewModelCityGetValue = viewModelCity.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            ilya.mihailenko.myapplication.ui.binding.adapters.CommonBindingsAdapter.isViewVisible(this.mboundView3, androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCity, viewModelCityGetValue);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvWeather, viewModelWeatherGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.isLoading()
        flag 1 (0x2L): viewModel.weather
        flag 2 (0x3L): viewModel.city
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}