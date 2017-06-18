package erikjhordanrey.android_kotlin_devises.di

import dagger.Component
import erikjhordanrey.android_kotlin_devises.view.CurrencyViewModel
import javax.inject.Singleton

@Component(modules = arrayOf(AppModule::class, DataModule::class))
@Singleton interface AppComponent {

  fun inject(currencyViewModel: CurrencyViewModel)

}


