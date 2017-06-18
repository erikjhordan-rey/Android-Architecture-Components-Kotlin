package erikjhordanrey.android_kotlin_devises.di

import dagger.Component
import erikjhordanrey.android_kotlin_devises.view.CurrencyViewModel
import erikjhordanrey.android_kotlin_devises.view.ExchangeViewModel
import javax.inject.Singleton

@Component(modules = arrayOf(AppModule::class, RoomModule::class, RemoteModule::class))
@Singleton interface AppComponent {

  fun inject(currencyViewModel: CurrencyViewModel)

  fun inject(exchangeViewModel: ExchangeViewModel)

}


