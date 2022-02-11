package ilya.mihailenko.myapplication.common.gps;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lilya/mihailenko/myapplication/common/gps/GpsConnectionManagerImpl;", "Lilya/mihailenko/myapplication/common/gps/GpsConnectionManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "gpsReceiver", "Lilya/mihailenko/myapplication/common/gps/GpsReceiver;", "getGpsState", "Lilya/mihailenko/myapplication/common/gps/GpsState;", "observeGpsState", "Lio/reactivex/rxjava3/core/Flowable;", "registerReceiver", "", "app_debug"})
public final class GpsConnectionManagerImpl implements ilya.mihailenko.myapplication.common.gps.GpsConnectionManager {
    private final android.content.Context context = null;
    private ilya.mihailenko.myapplication.common.gps.GpsReceiver gpsReceiver;
    
    public GpsConnectionManagerImpl(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    private final void registerReceiver(android.content.Context context) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.rxjava3.core.Flowable<ilya.mihailenko.myapplication.common.gps.GpsState> observeGpsState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ilya.mihailenko.myapplication.common.gps.GpsState getGpsState() {
        return null;
    }
}