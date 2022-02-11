package ilya.mihailenko.myapplication.di.common

open class BaseManager<T>(private val clazz: Class<T>, private val createAndSave: () -> T) {

    private val isPresent: Boolean
        get() = ComponentManager.getInstance().hasComponent(clazz)

    private fun get(): T {
        return ComponentManager.getInstance().getComponent(clazz)
    }

    fun release() {
        ComponentManager.getInstance().removeComponent(clazz)
    }

    fun getComponent(): T {
        return if (isPresent) get() else createAndSave.invoke()
    }
}