package erikjhordanrey.android_kotlin_devises.view

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import erikjhordanrey.android_kotlin_devises.data.repository.CurrencyRepository
import erikjhordanrey.android_kotlin_devises.di.CurrencyApplication
import erikjhordanrey.android_kotlin_devises.domain.Currency
import javax.inject.Inject

class CurrencyViewModel : ViewModel() {

  @Inject lateinit var currencyRepository: CurrencyRepository

  private var liveCurrencyData: LiveData<List<Currency>>? = null

  init {
    initializeDagger()
    loadCurrencyList()
  }

  fun getCurrencyList(): LiveData<List<Currency>>? {
    return liveCurrencyData
  }


  private fun loadCurrencyList() {
    if (liveCurrencyData == null) {
      liveCurrencyData = MutableLiveData<List<Currency>>()
      liveCurrencyData = currencyRepository.getCurrencyList()
    }
  }

  private fun initializeDagger() = CurrencyApplication.appComponent.inject(this)

}


