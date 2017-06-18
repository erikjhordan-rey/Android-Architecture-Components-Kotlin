package erikjhordanrey.android_kotlin_devises.di

import android.content.Context
import dagger.Module
import dagger.Provides
import erikjhordanrey.android_kotlin_devises.data.room.RoomCurrencyDataSource
import javax.inject.Singleton

@Module
class RoomModule {

  @Provides @Singleton fun provideRoomCurrencyDataSource(context: Context) =
      RoomCurrencyDataSource.buildPersistentCurrency(context)
}


