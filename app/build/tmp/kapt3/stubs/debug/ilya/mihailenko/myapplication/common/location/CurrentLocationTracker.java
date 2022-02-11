package ilya.mihailenko.myapplication.common.location;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0007J\u0016\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0015H\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0016"}, d2 = {"Lilya/mihailenko/myapplication/common/location/CurrentLocationTracker;", "", "activityProvider", "Lilya/mihailenko/myapplication/common/activityprovider/ActivityProvider;", "(Lilya/mihailenko/myapplication/common/activityprovider/ActivityProvider;)V", "locationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "getLocationClient", "()Lcom/google/android/gms/location/FusedLocationProviderClient;", "locationClient$delegate", "Lkotlin/Lazy;", "locationRequest", "Lcom/google/android/gms/location/LocationRequest;", "getLocationRequest", "()Lcom/google/android/gms/location/LocationRequest;", "getCurrentLocation", "Lio/reactivex/rxjava3/core/Single;", "Landroid/location/Location;", "requestLocation", "", "singleEmitter", "Lio/reactivex/rxjava3/core/SingleEmitter;", "app_debug"})
public final class CurrentLocationTracker {
    private final ilya.mihailenko.myapplication.common.activityprovider.ActivityProvider activityProvider = null;
    private final kotlin.Lazy locationClient$delegate = null;
    
    public CurrentLocationTracker(@org.jetbrains.annotations.NotNull()
    ilya.mihailenko.myapplication.common.activityprovider.ActivityProvider activityProvider) {
        super();
    }
    
    private final com.google.android.gms.location.FusedLocationProviderClient getLocationClient() {
        return null;
    }
    
    private final com.google.android.gms.location.LocationRequest getLocationRequest() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.RequiresPermission(allOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public final io.reactivex.rxjava3.core.Single<android.location.Location> getCurrentLocation() {
        return null;
    }
    
    @androidx.annotation.RequiresPermission(allOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    private final void requestLocation(io.reactivex.rxjava3.core.SingleEmitter<android.location.Location> singleEmitter) {
    }
}