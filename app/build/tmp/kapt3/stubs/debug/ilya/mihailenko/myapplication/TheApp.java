package ilya.mihailenko.myapplication;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lilya/mihailenko/myapplication/TheApp;", "Landroid/app/Application;", "()V", "activityProvider", "Lilya/mihailenko/myapplication/common/activityprovider/ActivityProvider;", "getActivityProvider", "()Lilya/mihailenko/myapplication/common/activityprovider/ActivityProvider;", "setActivityProvider", "(Lilya/mihailenko/myapplication/common/activityprovider/ActivityProvider;)V", "onCreate", "", "app_debug"})
public final class TheApp extends android.app.Application {
    @javax.inject.Inject()
    public ilya.mihailenko.myapplication.common.activityprovider.ActivityProvider activityProvider;
    
    public TheApp() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ilya.mihailenko.myapplication.common.activityprovider.ActivityProvider getActivityProvider() {
        return null;
    }
    
    public final void setActivityProvider(@org.jetbrains.annotations.NotNull()
    ilya.mihailenko.myapplication.common.activityprovider.ActivityProvider p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
}