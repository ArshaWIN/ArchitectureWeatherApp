package ilya.mihailenko.myapplication.common.permission;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\r\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u000eJ\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014H\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lilya/mihailenko/myapplication/common/permission/RxPermissionsWrapper;", "", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "rxPermissions", "Lcom/tbruyelle/rxpermissions3/RxPermissions;", "isGranted", "", "permission", "", "isLocationPermissionGranted", "isNeverAskAgain", "requestCameraPermissions", "Lio/reactivex/rxjava3/core/Single;", "requestLocationPermissions", "app_debug"})
public final class RxPermissionsWrapper {
    private final android.app.Activity activity = null;
    private com.tbruyelle.rxpermissions3.RxPermissions rxPermissions;
    
    public RxPermissionsWrapper(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        super();
    }
    
    public RxPermissionsWrapper(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity fragmentActivity) {
        super();
    }
    
    public RxPermissionsWrapper(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"InlinedApi"})
    public final io.reactivex.rxjava3.core.Single<java.lang.Boolean> requestLocationPermissions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Single<java.lang.Boolean> requestCameraPermissions() {
        return null;
    }
    
    public final boolean isLocationPermissionGranted() {
        return false;
    }
    
    public final boolean isGranted(@org.jetbrains.annotations.NotNull()
    java.lang.String permission) {
        return false;
    }
    
    private final boolean isNeverAskAgain(java.lang.String permission) {
        return false;
    }
}