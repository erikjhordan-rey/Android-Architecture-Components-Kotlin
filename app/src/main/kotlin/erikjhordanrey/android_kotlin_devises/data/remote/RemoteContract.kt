package erikjhordanrey.android_kotlin_devises.data.remote

class RemoteContract {

  companion object {

    const val BASE_API_LAYER = "http://apilayer.net/api/"

    const val LIVE = "live"

    const val ACCESS_KEY = "access_key"
    const val CURRENCIES = "currencies"
    const val FORMAT = "format"

    const val SUCCESS = "success"
    const val QUOTES = "quotes"

    // I should't expose the access key but it is to didactic use
    const val ACCESS_KEY_API_LAYER = "be4554e86f3a5670b287ccc40f5bead8"
    const val FORMAT_TYPE = "1"
  }

}


