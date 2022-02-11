package ilya.mihailenko.myapplication.common.gps;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lilya/mihailenko/myapplication/common/gps/GpsConnectionManager;", "", "getGpsState", "Lilya/mihailenko/myapplication/common/gps/GpsState;", "observeGpsState", "Lio/reactivex/rxjava3/core/Flowable;", "app_debug"})
public abstract interface GpsConnectionManager {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Flowable<ilya.mihailenko.myapplication.common.gps.GpsState> observeGpsState();
    
    @org.jetbrains.annotations.NotNull()
    public abstract ilya.mihailenko.myapplication.common.gps.GpsState getGpsState();
}