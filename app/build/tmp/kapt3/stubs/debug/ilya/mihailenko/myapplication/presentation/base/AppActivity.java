package ilya.mihailenko.myapplication.presentation.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0012\u0010\u0018\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u0016H\u0014J\b\u0010\u001c\u001a\u00020\u0016H\u0014J\b\u0010\u001d\u001a\u00020\u0016H\u0014R\u001a\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001e"}, d2 = {"Lilya/mihailenko/myapplication/presentation/base/AppActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "currentFragment", "Lilya/mihailenko/myapplication/presentation/base/BaseFragment;", "getCurrentFragment", "()Lilya/mihailenko/myapplication/presentation/base/BaseFragment;", "navigator", "Lcom/github/terrakok/cicerone/androidx/AppNavigator;", "navigatorHolder", "Lcom/github/terrakok/cicerone/NavigatorHolder;", "getNavigatorHolder", "()Lcom/github/terrakok/cicerone/NavigatorHolder;", "setNavigatorHolder", "(Lcom/github/terrakok/cicerone/NavigatorHolder;)V", "router", "Lilya/mihailenko/myapplication/common/navigation/AppRouter;", "getRouter", "()Lilya/mihailenko/myapplication/common/navigation/AppRouter;", "setRouter", "(Lilya/mihailenko/myapplication/common/navigation/AppRouter;)V", "inject", "", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onResumeFragments", "app_debug"})
public final class AppActivity extends androidx.appcompat.app.AppCompatActivity {
    @javax.inject.Inject()
    public com.github.terrakok.cicerone.NavigatorHolder navigatorHolder;
    @javax.inject.Inject()
    public ilya.mihailenko.myapplication.common.navigation.AppRouter router;
    private final com.github.terrakok.cicerone.androidx.AppNavigator navigator = null;
    
    public AppActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.github.terrakok.cicerone.NavigatorHolder getNavigatorHolder() {
        return null;
    }
    
    public final void setNavigatorHolder(@org.jetbrains.annotations.NotNull()
    com.github.terrakok.cicerone.NavigatorHolder p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ilya.mihailenko.myapplication.common.navigation.AppRouter getRouter() {
        return null;
    }
    
    public final void setRouter(@org.jetbrains.annotations.NotNull()
    ilya.mihailenko.myapplication.common.navigation.AppRouter p0) {
    }
    
    private final ilya.mihailenko.myapplication.presentation.base.BaseFragment<?> getCurrentFragment() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void inject() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    protected void onResumeFragments() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
}