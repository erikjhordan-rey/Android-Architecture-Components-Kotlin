package erikjhordanrey.android_kotlin_devises.data.remote

import com.google.gson.annotations.SerializedName

data class CurrencyResponse(
    @SerializedName(RemoteContract.SUCCESS) val isSuccess: Boolean,
    @SerializedName(RemoteContract.QUOTES) val currencyQuotes: CurrencyQuotes
)

