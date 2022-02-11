package ilya.mihailenko.myapplication.common.location;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001b\u001cB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0018H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0006\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0018\u00010\bR\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lilya/mihailenko/myapplication/common/location/LocationTracker;", "", "activityProvider", "Lilya/mihailenko/myapplication/common/activityprovider/ActivityProvider;", "(Lilya/mihailenko/myapplication/common/activityprovider/ActivityProvider;)V", "isStartedLocationUpdates", "", "locationCallback", "Lilya/mihailenko/myapplication/common/location/LocationTracker$ReactiveLocationCallback;", "locationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "getLocationClient", "()Lcom/google/android/gms/location/FusedLocationProviderClient;", "locationClient$delegate", "Lkotlin/Lazy;", "locationRequest", "Lcom/google/android/gms/location/LocationRequest;", "getLocationRequest", "()Lcom/google/android/gms/location/LocationRequest;", "locationRequest$delegate", "locationSubject", "Lio/reactivex/rxjava3/subjects/PublishSubject;", "Landroid/location/Location;", "getLocationUpdates", "Lio/reactivex/rxjava3/core/Flowable;", "stopLocationUpdates", "", "Companion", "ReactiveLocationCallback", "app_debug"})
public final class LocationTracker {
    private final ilya.mihailenko.myapplication.common.activityprovider.ActivityProvider activityProvider = null;
    private boolean isStartedLocationUpdates = false;
    private final kotlin.Lazy locationClient$delegate = null;
    private final io.reactivex.rxjava3.subjects.PublishSubject<android.location.Location> locationSubject = null;
    private ilya.mihailenko.myapplication.common.location.LocationTracker.ReactiveLocationCallback locationCallback;
    private final kotlin.Lazy locationRequest$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final ilya.mihailenko.myapplication.common.location.LocationTracker.Companion Companion = null;
    private static final long UPDATES_INTERVAL = 500L;
    private static final long FASTEST_INTERVAL = 200L;
    
    public LocationTracker(@org.jetbrains.annotations.NotNull()
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
    public final io.reactivex.rxjava3.core.Flowable<android.location.Location> getLocationUpdates() {
        return null;
    }
    
    public final void stopLocationUpdates() {
    }
    
    private final boolean isStartedLocationUpdates() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lilya/mihailenko/myapplication/common/location/LocationTracker$ReactiveLocationCallback;", "Lcom/google/android/gms/location/LocationCallback;", "locationSubject", "Lio/reactivex/rxjava3/subjects/PublishSubject;", "Landroid/location/Location;", "(Lilya/mihailenko/myapplication/common/location/LocationTracker;Lio/reactivex/rxjava3/subjects/PublishSubject;)V", "onLocationResult", "", "locationResult", "Lcom/google/android/gms/location/LocationResult;", "app_debug"})
    final class ReactiveLocationCallback extends com.google.android.gms.location.LocationCallback {
        private final io.reactivex.rxjava3.subjects.PublishSubject<android.location.Location> locationSubject = null;
        
        public ReactiveLocationCallback(@org.jetbrains.annotations.NotNull()
        io.reactivex.rxjava3.subjects.PublishSubject<android.location.Location> locationSubject) {
            super();
        }
        
        @java.lang.Override()
        public void onLocationResult(@org.jetbrains.annotations.NotNull()
        com.google.android.gms.location.LocationResult locationResult) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lilya/mihailenko/myapplication/common/location/LocationTracker$Companion;", "", "()V", "FASTEST_INTERVAL", "", "UPDATES_INTERVAL", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}