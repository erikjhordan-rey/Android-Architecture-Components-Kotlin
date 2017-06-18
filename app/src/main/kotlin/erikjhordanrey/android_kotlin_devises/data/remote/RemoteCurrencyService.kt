package erikjhordanrey.android_kotlin_devises.data.remote

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface RemoteCurrencyService {

  @GET(RemoteContract.LIVE)
  fun requestAvailableExchange(
      @Query(RemoteContract.ACCESS_KEY) accessKey: String,
      @Query(RemoteContract.CURRENCIES) currencies: String,
      @Query(RemoteContract.FORMAT) format: String
  ): Observable<CurrencyResponse>

}


