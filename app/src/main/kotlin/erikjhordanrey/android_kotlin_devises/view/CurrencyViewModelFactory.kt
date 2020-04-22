package erikjhordanrey.android_kotlin_devises.view

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import erikjhordanrey.android_kotlin_devises.data.repository.CurrencyRepository
import javax.inject.Inject

@Suppress("UNCHECKED_CAST")
class CurrencyViewModelFactory @Inject constructor(private val currencyRepository: CurrencyRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CurrencyViewModel::class.java)) {
            return CurrencyViewModel(currencyRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
