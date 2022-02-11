package ilya.mihailenko.myapplication.di.activity

import android.content.Context
import com.android.therun.di.app.activity.PerActivity
import dagger.Module
import dagger.Provides
import ilya.mihailenko.myapplication.common.activityprovider.ActivityProvider
import ilya.mihailenko.myapplication.common.gps.GpsConnectionManager
import ilya.mihailenko.myapplication.common.gps.GpsConnectionManagerImpl
import ilya.mihailenko.myapplication.common.location.CurrentLocationTracker
import ilya.mihailenko.myapplication.common.location.LocationTracker


@Module
class CommonActivityModule {

    @Provides
    @PerActivity
    fun provideLocationTracker(activityProvider: ActivityProvider): LocationTracker {
        return LocationTracker(activityProvider)
    }

    @Provides
    @PerActivity
    fun provideCurrentLocationTracker(activityProvider: ActivityProvider): CurrentLocationTracker {
        return CurrentLocationTracker(activityProvider)
    }

    @Provides
    @PerActivity
    fun provideGpsConnectionManager(context: Context): GpsConnectionManager {
        return GpsConnectionManagerImpl(context)
    }

}