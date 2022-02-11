package ilya.mihailenko.myapplication.presentation.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\fH\u0002J\b\u0010\u0014\u001a\u00020\fH\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\u0012\u0010\u0016\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001f\u001a\u00020\u0012H\u0016J\b\u0010 \u001a\u00020\u0012H\u0016J\u0010\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u0018H\u0016J\b\u0010#\u001a\u00020\u0012H&R\u001c\u0010\u0005\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u000eX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006$"}, d2 = {"Lilya/mihailenko/myapplication/presentation/base/BaseFragment;", "TBinding", "Landroidx/databinding/ViewDataBinding;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "instanceStateSaved", "", "layoutRes", "", "getLayoutRes", "()I", "inject", "", "isRealRemoving", "needCloseScope", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onResume", "onSaveInstanceState", "outState", "release", "app_debug"})
public abstract class BaseFragment<TBinding extends androidx.databinding.ViewDataBinding> extends androidx.fragment.app.Fragment {
    protected TBinding binding;
    private boolean instanceStateSaved = false;
    
    public BaseFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final TBinding getBinding() {
        return null;
    }
    
    protected final void setBinding(@org.jetbrains.annotations.NotNull()
    TBinding p0) {
    }
    
    public abstract int getLayoutRes();
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public abstract void inject();
    
    public abstract void release();
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    private final boolean isRealRemoving() {
        return false;
    }
    
    private final boolean needCloseScope() {
        return false;
    }
    
    public void onBackPressed() {
    }
}