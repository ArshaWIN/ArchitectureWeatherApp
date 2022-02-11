package ilya.mihailenko.myapplication.di.common;

import android.app.Application;

import ilya.mihailenko.myapplication.di.app.AppModule;

import androidx.annotation.NonNull;
import ilya.mihailenko.myapplication.di.app.AppComponent;
import ilya.mihailenko.myapplication.di.app.DaggerAppComponent;

public class ComponentManager implements ComponentProvider {
    private static volatile ComponentManager INSTANCE;
    private final ComponentMap componentMap = new ComponentMap();
    private final AppComponent appComponent;

    private ComponentManager(AppComponent appComponent) {
        this.appComponent = appComponent;
    }

    //region Initialization

    public static synchronized void init(Application application) {
        if (INSTANCE != null) {
            throw new IllegalStateException("ComponentManager has already been initialized");
        }

        AppComponent appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(application))
                .build();

        @SuppressWarnings("UnnecessaryLocalVariable") //need for
                ComponentManager componentManager = new ComponentManager(appComponent);
        INSTANCE = componentManager;
    }

    public static ComponentManager getInstance() {
        if (INSTANCE == null) {
            throw new IllegalStateException("ComponentManager hasn't been initialized");
        }
        return INSTANCE;
    }

    //endregion

    public AppComponent getApplicationComponent() {
        return appComponent;
    }

    public <T> T addComponent(T component) {
        componentMap.addComponent(component);
        return component;
    }

    public boolean hasComponent(Class<?> clazz) {
        return componentMap.hasComponent(clazz);
    }

    public void removeComponent(Class<?> clazz) {
        componentMap.remove(clazz);
    }

    @SuppressWarnings("ConstantConditions")
    @NonNull
    @Override
    public <T> T getComponent(Class<T> clazz) {
        if (clazz == AppComponent.class) {
            return clazz.cast(getApplicationComponent());
        }

        return componentMap.getComponent(clazz);
    }
}