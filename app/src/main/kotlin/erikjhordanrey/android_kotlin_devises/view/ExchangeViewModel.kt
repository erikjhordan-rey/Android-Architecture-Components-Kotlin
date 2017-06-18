package erikjhordanrey.android_kotlin_devises.view

import android.arch.lifecycle.ViewModel
import erikjhordanrey.android_kotlin_devises.data.repository.CurrencyRepository
import erikjhordanrey.android_kotlin_devises.di.CurrencyApplication
import javax.inject.Inject

class ExchangeViewModel : ViewModel() {

  @Inject lateinit var currencyRepository: CurrencyRepository

  init {
    initializeDagger()
  }

  fun getAvailableExchange(currencies: String) =
      currencyRepository.getAvailableExchange(currencies)

  private fun initializeDagger() = CurrencyApplication.appComponent.inject(this)

}


