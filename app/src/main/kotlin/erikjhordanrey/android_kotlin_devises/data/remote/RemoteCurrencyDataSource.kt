package erikjhordanrey.android_kotlin_devises.data.remote

import javax.inject.Inject

class RemoteCurrencyDataSource @Inject constructor(private val remoteCurrencyService: RemoteCurrencyService) {

  fun requestAvailableExchange(currencies: String) =
      remoteCurrencyService.requestAvailableExchange(
          RemoteContract.ACCESS_KEY_API_LAYER, currencies, RemoteContract.FORMAT_TYPE)
}

