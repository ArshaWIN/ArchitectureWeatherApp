package ilya.mihailenko.myapplication.common.gps;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lilya/mihailenko/myapplication/common/gps/GpsState;", "", "()V", "DISABLED", "ENABLED", "Lilya/mihailenko/myapplication/common/gps/GpsState$ENABLED;", "Lilya/mihailenko/myapplication/common/gps/GpsState$DISABLED;", "app_debug"})
public abstract class GpsState {
    
    private GpsState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lilya/mihailenko/myapplication/common/gps/GpsState$ENABLED;", "Lilya/mihailenko/myapplication/common/gps/GpsState;", "()V", "app_debug"})
    public static final class ENABLED extends ilya.mihailenko.myapplication.common.gps.GpsState {
        @org.jetbrains.annotations.NotNull()
        public static final ilya.mihailenko.myapplication.common.gps.GpsState.ENABLED INSTANCE = null;
        
        private ENABLED() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lilya/mihailenko/myapplication/common/gps/GpsState$DISABLED;", "Lilya/mihailenko/myapplication/common/gps/GpsState;", "()V", "app_debug"})
    public static final class DISABLED extends ilya.mihailenko.myapplication.common.gps.GpsState {
        @org.jetbrains.annotations.NotNull()
        public static final ilya.mihailenko.myapplication.common.gps.GpsState.DISABLED INSTANCE = null;
        
        private DISABLED() {
            super();
        }
    }
}