package ilya.mihailenko.myapplication.di.app

import android.content.Context
import dagger.Module
import dagger.Provides
import ilya.mihailenko.myapplication.common.gps.GpsConnectionManager
import ilya.mihailenko.myapplication.common.gps.GpsConnectionManagerImpl
import ilya.mihailenko.myapplication.common.resources.ResourcesManager
import javax.inject.Singleton


@Module
class CommonAppModule {

    @Provides
    @Singleton
    fun provideResourceManager(context: Context): ResourcesManager {
        return ResourcesManager(context)
    }

    @Provides
    @Singleton
    fun provideLocationConnectionManager(context: Context): GpsConnectionManager {
        return GpsConnectionManagerImpl(context)
    }

}