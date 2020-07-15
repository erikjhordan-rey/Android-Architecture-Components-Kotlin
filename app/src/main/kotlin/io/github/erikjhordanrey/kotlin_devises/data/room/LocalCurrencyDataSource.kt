package io.github.erikjhordanrey.kotlin_devises.data.room

class LocalCurrencyDataSource(private val currencyDatabase: CurrencyDatabase) {

    fun getCurrenciesTotal() = currencyDatabase.currencyDao().getCurrenciesTotal()

    fun insertCurrencies() {
        currencyDatabase.currencyDao().insertAll(CurrencyDatabase.getAllCurrencies())
    }

    fun getAllCurrencies() = currencyDatabase.currencyDao().getAllCurrencies()
}
