package ilya.mihailenko.myapplication.di.common;

import java.util.HashMap;
import java.util.Map;

import androidx.annotation.NonNull;
import dagger.Component;
import dagger.Subcomponent;

public class ComponentMap {
    private final Map<Class<?>, Object> componentMap = new HashMap<>();

    public ComponentMap() {
    }

    public <T> void addComponent(T component) {
        Class<?> clazz = getComponentClass(component);

        componentMap.put(clazz, component);
    }

    /**
     * Dagger generates ComponentImpl, so we must obtain interface
     *
     * @return Component or Subcomponent class
     * @throws IllegalArgumentException if argument is not a dagger component
     */
    @NonNull
    private <T> Class<?> getComponentClass(T component) {
        Class<?> implClass = component.getClass();
        Class<?>[] interfaces = implClass.getInterfaces();
        if (interfaces.length < 1) {
            throw new IllegalArgumentException(
                    "Argument is not a component: " + implClass.getName());
        }

        Class<?> clazz = interfaces[0];
        if (!clazz.isAnnotationPresent(Subcomponent.class) &&
                !clazz.isAnnotationPresent(Component.class)) {
            throw new IllegalArgumentException("Argument is not a component: " + implClass.getName());
        }
        return clazz;
    }

    public boolean hasComponent(Class<?> clazz) {
        return componentMap.containsKey(clazz);
    }

    public <T> T getComponent(Class<T> clazz) {
        Object component = componentMap.get(clazz);
        if (component == null) {
            throw new IllegalStateException(
                    "Component " + clazz.getSimpleName() + " is not initialized");
        }

        return clazz.cast(component);
    }

    public void clear() {
        componentMap.clear();
    }

    public void remove(Class<?> clazz) {
        componentMap.remove(clazz);
    }
}