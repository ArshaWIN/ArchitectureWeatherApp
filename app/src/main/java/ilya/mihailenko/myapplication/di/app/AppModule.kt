package ilya.mihailenko.myapplication.di.app

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import ilya.mihailenko.myapplication.common.activityprovider.ActivityProvider
import javax.inject.Singleton

@Module
class AppModule(private val application: Application) {

    @Provides
    @Singleton
    internal fun provideApplication(): Application {
        return application
    }

    @Provides
    @Singleton
    internal fun provideActivityProvider(): ActivityProvider {
        return ActivityProvider()
    }

    @Provides
    @Singleton
    internal fun provideContext(): Context {
        return application
    }
}