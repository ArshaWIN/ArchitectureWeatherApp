package ilya.mihailenko.myapplication.di.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u00a2\u0006\u0002\u0010\u0007J\r\u0010\u000b\u001a\u00028\u0000H\u0002\u00a2\u0006\u0002\u0010\fJ\u000b\u0010\r\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\fJ\u0006\u0010\u000e\u001a\u00020\u000fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\n\u00a8\u0006\u0010"}, d2 = {"Lilya/mihailenko/myapplication/di/common/BaseManager;", "T", "", "clazz", "Ljava/lang/Class;", "createAndSave", "Lkotlin/Function0;", "(Ljava/lang/Class;Lkotlin/jvm/functions/Function0;)V", "isPresent", "", "()Z", "get", "()Ljava/lang/Object;", "getComponent", "release", "", "app_debug"})
public class BaseManager<T extends java.lang.Object> {
    private final java.lang.Class<T> clazz = null;
    private final kotlin.jvm.functions.Function0<T> createAndSave = null;
    
    public BaseManager(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> clazz, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends T> createAndSave) {
        super();
    }
    
    private final boolean isPresent() {
        return false;
    }
    
    private final T get() {
        return null;
    }
    
    public final void release() {
    }
    
    public final T getComponent() {
        return null;
    }
}