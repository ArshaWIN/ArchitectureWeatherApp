package ilya.mihailenko.myapplication.common.gps;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R<\u0010\u0005\u001a0\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007 \b*\u0017\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u0006\u00a2\u0006\u0002\b\t0\u0006\u00a2\u0006\u0002\b\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lilya/mihailenko/myapplication/common/gps/GpsReceiver;", "Landroid/content/BroadcastReceiver;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "gpsObserver", "Lio/reactivex/rxjava3/processors/BehaviorProcessor;", "Lilya/mihailenko/myapplication/common/gps/GpsState;", "kotlin.jvm.PlatformType", "Lio/reactivex/rxjava3/annotations/NonNull;", "getGpsState", "isGpsEnabled", "", "observeGpsState", "Lio/reactivex/rxjava3/core/Flowable;", "onReceive", "", "intent", "Landroid/content/Intent;", "Companion", "app_debug"})
public final class GpsReceiver extends android.content.BroadcastReceiver {
    private final android.content.Context context = null;
    private final io.reactivex.rxjava3.processors.BehaviorProcessor<ilya.mihailenko.myapplication.common.gps.GpsState> gpsObserver = null;
    @org.jetbrains.annotations.NotNull()
    public static final ilya.mihailenko.myapplication.common.gps.GpsReceiver.Companion Companion = null;
    public static final int CONNECTION_CHECK_DEBOUNCE = 200;
    
    public GpsReceiver(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Flowable<ilya.mihailenko.myapplication.common.gps.GpsState> observeGpsState() {
        return null;
    }
    
    private final boolean isGpsEnabled(android.content.Context context) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ilya.mihailenko.myapplication.common.gps.GpsState getGpsState(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lilya/mihailenko/myapplication/common/gps/GpsReceiver$Companion;", "", "()V", "CONNECTION_CHECK_DEBOUNCE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}