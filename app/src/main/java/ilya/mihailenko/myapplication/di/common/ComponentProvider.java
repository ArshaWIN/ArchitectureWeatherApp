package ilya.mihailenko.myapplication.di.common;

import androidx.annotation.NonNull;

public interface ComponentProvider {
    @NonNull
    <T> T getComponent(Class<T> clazz);
}
