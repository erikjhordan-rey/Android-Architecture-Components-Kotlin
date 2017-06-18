/**
 * Copyright 2017 Erik Jhordan Rey.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package erikjhordanrey.android_kotlin_devises.data.room

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context

@Database(
    entities = arrayOf(CurrencyEntity::class),
    version = 1)
abstract class RoomCurrencyDataSource : RoomDatabase() {

  abstract fun currencyDao(): RoomCurrencyDao

  companion object {

    fun buildPersistentCurrency(context: Context): RoomCurrencyDataSource = Room.databaseBuilder(
        context.applicationContext,
        RoomCurrencyDataSource::class.java,
        RoomContract.DATABASE_CURRENCY
    ).build()


    fun getAllCurrencies(): List<CurrencyEntity> {
      val mutableCurrencyList = mutableListOf<CurrencyEntity>()
      mutableCurrencyList.add(createCurrencyEntity("AED", "United Arab Emirates Dirham"))
      mutableCurrencyList.add(createCurrencyEntity("AFN", "Afghan Afghani"))
      mutableCurrencyList.add(createCurrencyEntity("ALL", "Albanian Lek"))
      mutableCurrencyList.add(createCurrencyEntity("AMD", "Armenian Dram"))
      mutableCurrencyList.add(createCurrencyEntity("ANG", "Netherlands Antillean Guilder"))
      mutableCurrencyList.add(createCurrencyEntity("AOA", "Angolan Kwanza"))
      mutableCurrencyList.add(createCurrencyEntity("ARS", "Argentine Peso"))
      mutableCurrencyList.add(createCurrencyEntity("AUD", "Australian Dollar"))
      mutableCurrencyList.add(createCurrencyEntity("AWG", "Aruban Florin"))
      mutableCurrencyList.add(createCurrencyEntity("AZN", "Azerbaijani Manat"))
      mutableCurrencyList.add(createCurrencyEntity("BAM", "Bosnia-Herzegovina Convertible Mark"))
      mutableCurrencyList.add(createCurrencyEntity("BBD", "Barbadian Dollar"))
      mutableCurrencyList.add(createCurrencyEntity("BDT", "Bangladeshi Taka"))
      mutableCurrencyList.add(createCurrencyEntity("BGN", "Bulgarian Lev"))
      mutableCurrencyList.add(createCurrencyEntity("BHD", "Bahraini Dinar"))
      mutableCurrencyList.add(createCurrencyEntity("BIF", "Burundian Franc"))
      mutableCurrencyList.add(createCurrencyEntity("BMD", "Bermudan Dollar"))
      mutableCurrencyList.add(createCurrencyEntity("BND", "Brunei Dollar"))
      mutableCurrencyList.add(createCurrencyEntity("BOB", "Bolivian Boliviano"))
      mutableCurrencyList.add(createCurrencyEntity("BRL", "Brazilian Real"))
      mutableCurrencyList.add(createCurrencyEntity("BSD", "Bahamian Dollar"))
      mutableCurrencyList.add(createCurrencyEntity("BTC", "Bitcoin"))
      mutableCurrencyList.add(createCurrencyEntity("BTN", "Bhutanese Ngultrum"))
      mutableCurrencyList.add(createCurrencyEntity("BWP", "Botswanan Pula"))
      mutableCurrencyList.add(createCurrencyEntity("BYN", "New Belarusian Ruble"))
      mutableCurrencyList.add(createCurrencyEntity("BYR", "Belarusian Ruble"))
      mutableCurrencyList.add(createCurrencyEntity("BZD", "Belize Dollar"))
      mutableCurrencyList.add(createCurrencyEntity("CAD", "Canadian Dollar"))
      mutableCurrencyList.add(createCurrencyEntity("CDF", "Congolese Franc"))
      mutableCurrencyList.add(createCurrencyEntity("CHF", "Swiss Franc"))
      mutableCurrencyList.add(createCurrencyEntity("CLF", "Chilean Unit of Account (UF)"))
      mutableCurrencyList.add(createCurrencyEntity("CLP", "Chilean Peso"))
      mutableCurrencyList.add(createCurrencyEntity("CNY", "Chinese Yuan"))
      mutableCurrencyList.add(createCurrencyEntity("COP", "Colombian Peso"))
      mutableCurrencyList.add(createCurrencyEntity("CRC", "Costa Rican Colón"))
      mutableCurrencyList.add(createCurrencyEntity("CUC", "Cuban Convertible Peso"))
      mutableCurrencyList.add(createCurrencyEntity("CUP", "Cuban Peso"))
      mutableCurrencyList.add(createCurrencyEntity("CVE", "Cape Verdean Escudo"))
      mutableCurrencyList.add(createCurrencyEntity("CZK", "Czech Republic Koruna"))
      mutableCurrencyList.add(createCurrencyEntity("DJF", "Djiboutian Franc"))
      mutableCurrencyList.add(createCurrencyEntity("DKK", "Danish Krone"))
      mutableCurrencyList.add(createCurrencyEntity("DOP", "Dominican Peso"))
      mutableCurrencyList.add(createCurrencyEntity("DZD", "Algerian Dinar"))
      mutableCurrencyList.add(createCurrencyEntity("EEK", "Estonian Kroon"))
      mutableCurrencyList.add(createCurrencyEntity("EGP", "Egyptian Pound"))
      mutableCurrencyList.add(createCurrencyEntity("ERN", "Eritrean Nakfa"))
      mutableCurrencyList.add(createCurrencyEntity("ETB", "Ethiopian Birr"))
      mutableCurrencyList.add(createCurrencyEntity("EUR", "Euro"))
      mutableCurrencyList.add(createCurrencyEntity("FJD", "Fijian Dollar"))
      mutableCurrencyList.add(createCurrencyEntity("FKP", "Falkland Islands Pound"))
      mutableCurrencyList.add(createCurrencyEntity("GBP", "British Pound Sterling"))
      mutableCurrencyList.add(createCurrencyEntity("GEL", "Georgian Lari"))
      mutableCurrencyList.add(createCurrencyEntity("GGP", "Guernsey Pound"))
      mutableCurrencyList.add(createCurrencyEntity("GHS", "Ghanaian Cedi"))
      mutableCurrencyList.add(createCurrencyEntity("GIP", "Gibraltar Pound"))
      mutableCurrencyList.add(createCurrencyEntity("GMD", "Gambian Dalasi"))
      mutableCurrencyList.add(createCurrencyEntity("GNF", "Guinean Franc"))
      mutableCurrencyList.add(createCurrencyEntity("GTQ", "Guatemalan Quetzal"))
      mutableCurrencyList.add(createCurrencyEntity("GYD", "Guyanaese Dollar"))
      mutableCurrencyList.add(createCurrencyEntity("HKD", "Hong Kong Dollar"))
      mutableCurrencyList.add(createCurrencyEntity("HNL", "Honduran Lempira"))
      mutableCurrencyList.add(createCurrencyEntity("HRK", "Croatian Kuna"))
      mutableCurrencyList.add(createCurrencyEntity("HTG", "Haitian Gourde"))
      mutableCurrencyList.add(createCurrencyEntity("HUF", "Hungarian Forint"))
      mutableCurrencyList.add(createCurrencyEntity("IDR", "Indonesian Rupiah"))
      mutableCurrencyList.add(createCurrencyEntity("ILS", "Israeli New Sheqel"))
      mutableCurrencyList.add(createCurrencyEntity("IMP", "Manx pound"))
      mutableCurrencyList.add(createCurrencyEntity("INR", "Indian Rupee"))
      mutableCurrencyList.add(createCurrencyEntity("IQD", "Iraqi Dinar"))
      mutableCurrencyList.add(createCurrencyEntity("IRR", "Iranian Rial"))
      mutableCurrencyList.add(createCurrencyEntity("ISK", "Icelandic Krúna"))
      mutableCurrencyList.add(createCurrencyEntity("JEP", "Jersey Pound"))
      mutableCurrencyList.add(createCurrencyEntity("JMD", "Jamaican Dollar"))
      mutableCurrencyList.add(createCurrencyEntity("JOD", "Jordanian Dinar"))
      mutableCurrencyList.add(createCurrencyEntity("JPY", "Japanese Yen"))
      mutableCurrencyList.add(createCurrencyEntity("KES", "Kenyan Shilling"))
      mutableCurrencyList.add(createCurrencyEntity("KGS", "Kyrgystani Som"))
      mutableCurrencyList.add(createCurrencyEntity("KHR", "Cambodian Riel"))
      mutableCurrencyList.add(createCurrencyEntity("KMF", "Comorian Franc"))
      mutableCurrencyList.add(createCurrencyEntity("KPW", "North Korean Won"))
      mutableCurrencyList.add(createCurrencyEntity("KRW", "South Korean Won"))
      mutableCurrencyList.add(createCurrencyEntity("KWD", "Kuwaiti Dinar"))
      mutableCurrencyList.add(createCurrencyEntity("KYD", "Cayman Islands Dollar"))
      mutableCurrencyList.add(createCurrencyEntity("KZT", "Kazakhstani Tenge"))
      mutableCurrencyList.add(createCurrencyEntity("LAK", "Laotian Kip"))
      mutableCurrencyList.add(createCurrencyEntity("LBP", "Lebanese Pound"))
      mutableCurrencyList.add(createCurrencyEntity("LKR", "Sri Lankan Rupee"))
      mutableCurrencyList.add(createCurrencyEntity("LRD", "Liberian Dollar"))
      mutableCurrencyList.add(createCurrencyEntity("LSL", "Lesotho Loti"))
      mutableCurrencyList.add(createCurrencyEntity("LTL", "Lithuanian Litas"))
      mutableCurrencyList.add(createCurrencyEntity("LVL", "Latvian Lats"))
      mutableCurrencyList.add(createCurrencyEntity("LYD", "Libyan Dinar"))
      mutableCurrencyList.add(createCurrencyEntity("MAD", "Moroccan Dirham"))
      mutableCurrencyList.add(createCurrencyEntity("MDL", "Moldovan Leu"))
      mutableCurrencyList.add(createCurrencyEntity("MGA", "Malagasy Ariary"))
      mutableCurrencyList.add(createCurrencyEntity("MKD", "Macedonian Denar"))
      mutableCurrencyList.add(createCurrencyEntity("MMK", "Myanma Kyat"))
      mutableCurrencyList.add(createCurrencyEntity("MNT", "Mongolian Tugrik"))
      mutableCurrencyList.add(createCurrencyEntity("MOP", "Macanese Pataca"))
      mutableCurrencyList.add(createCurrencyEntity("MRO", "Mauritanian Ouguiya"))
      mutableCurrencyList.add(createCurrencyEntity("MUR", "Mauritian Rupee"))
      mutableCurrencyList.add(createCurrencyEntity("MVR", "Maldivian Rufiyaa"))
      mutableCurrencyList.add(createCurrencyEntity("MWK", "Malawian Kwacha"))
      mutableCurrencyList.add(createCurrencyEntity("MXN", "Mexican Peso"))
      mutableCurrencyList.add(createCurrencyEntity("MYR", "Malaysian Ringgit"))
      mutableCurrencyList.add(createCurrencyEntity("MZN", "Mozambican Metical"))
      mutableCurrencyList.add(createCurrencyEntity("NAD", "Namibian Dollar"))
      mutableCurrencyList.add(createCurrencyEntity("NGN", "Nigerian Naira"))
      mutableCurrencyList.add(createCurrencyEntity("NIO", "Nicaraguan Córdoba"))
      mutableCurrencyList.add(createCurrencyEntity("NOK", "Norwegian Krone"))
      mutableCurrencyList.add(createCurrencyEntity("NPR", "Nepalese Rupee"))
      mutableCurrencyList.add(createCurrencyEntity("NZD", "New Zealand Dollar"))
      mutableCurrencyList.add(createCurrencyEntity("OMR", "Omani Rial"))
      mutableCurrencyList.add(createCurrencyEntity("PAB", "Panamanian Balboa"))
      mutableCurrencyList.add(createCurrencyEntity("PEN", "Peruvian Nuevo Sol"))
      mutableCurrencyList.add(createCurrencyEntity("PGK", "Papua New Guinean Kina"))
      mutableCurrencyList.add(createCurrencyEntity("PHP", "Philippine Peso"))
      mutableCurrencyList.add(createCurrencyEntity("PKR", "Pakistani Rupee"))
      mutableCurrencyList.add(createCurrencyEntity("PLN", "Polish Zloty"))
      mutableCurrencyList.add(createCurrencyEntity("PYG", "Paraguayan Guarani"))
      mutableCurrencyList.add(createCurrencyEntity("QAR", "Qatari Rial"))
      mutableCurrencyList.add(createCurrencyEntity("RON", "Romanian Leu"))
      mutableCurrencyList.add(createCurrencyEntity("RSD", "Serbian Dinar"))
      mutableCurrencyList.add(createCurrencyEntity("RUB", "Russian Ruble"))
      mutableCurrencyList.add(createCurrencyEntity("RWF", "Rwandan Franc"))
      mutableCurrencyList.add(createCurrencyEntity("SAR", "Saudi Riyal"))
      mutableCurrencyList.add(createCurrencyEntity("SBD", "Solomon Islands Dollar"))
      mutableCurrencyList.add(createCurrencyEntity("SCR", "Seychellois Rupee"))
      mutableCurrencyList.add(createCurrencyEntity("SDG", "Sudanese Pound"))
      mutableCurrencyList.add(createCurrencyEntity("SEK", "Swedish Krona"))
      mutableCurrencyList.add(createCurrencyEntity("SGD", "Singapore Dollar"))
      mutableCurrencyList.add(createCurrencyEntity("SHP", "Saint Helena Pound"))
      mutableCurrencyList.add(createCurrencyEntity("SLL", "Sierra Leonean Leone"))
      mutableCurrencyList.add(createCurrencyEntity("SOS", "Somali Shilling"))
      mutableCurrencyList.add(createCurrencyEntity("SRD", "Surinamese Dollar"))
      mutableCurrencyList.add(createCurrencyEntity("STD", "São Tomé and Príncipe dobra"))
      mutableCurrencyList.add(createCurrencyEntity("SVC", "Salvadoran Colón"))
      mutableCurrencyList.add(createCurrencyEntity("SYP", "Syrian Pound"))
      mutableCurrencyList.add(createCurrencyEntity("SZL", "Swazi Lilangeni"))
      mutableCurrencyList.add(createCurrencyEntity("THB", "Thai Baht"))
      mutableCurrencyList.add(createCurrencyEntity("TJS", "Tajikistani Somoni"))
      mutableCurrencyList.add(createCurrencyEntity("TMT", "Turkmenistani Manat"))
      mutableCurrencyList.add(createCurrencyEntity("TND", "Tunisian Dinar"))
      mutableCurrencyList.add(createCurrencyEntity("TOP", "Tongan Pa'anga"))
      mutableCurrencyList.add(createCurrencyEntity("TRY", "Turkish Lira"))
      mutableCurrencyList.add(createCurrencyEntity("TTD", "Trinidad and Tobago Dollar"))
      mutableCurrencyList.add(createCurrencyEntity("TWD", "New Taiwan Dollar"))
      mutableCurrencyList.add(createCurrencyEntity("TZS", "Tanzanian Shilling"))
      mutableCurrencyList.add(createCurrencyEntity("UAH", "Ukrainian Hryvnia"))
      mutableCurrencyList.add(createCurrencyEntity("UGX", "Ugandan Shilling"))
      mutableCurrencyList.add(createCurrencyEntity("USD", "United States Dollar"))
      mutableCurrencyList.add(createCurrencyEntity("UYU", "Uruguayan Peso"))
      mutableCurrencyList.add(createCurrencyEntity("UZS", "Uzbekistan Som"))
      mutableCurrencyList.add(createCurrencyEntity("VEF", "Venezuelan Bolidvar Fuerte"))
      mutableCurrencyList.add(createCurrencyEntity("VND", "Vietnamese Dong"))
      mutableCurrencyList.add(createCurrencyEntity("VUV", "Vanuatu Vatu"))
      mutableCurrencyList.add(createCurrencyEntity("WST", "Samoan Tala"))
      mutableCurrencyList.add(createCurrencyEntity("XAF", "CFA Franc BEAC"))
      mutableCurrencyList.add(createCurrencyEntity("XAG", "Silver (troy ounce)"))
      mutableCurrencyList.add(createCurrencyEntity("XAU", "Gold (troy ounce)"))
      mutableCurrencyList.add(createCurrencyEntity("XCD", "East Caribbean Dollar"))
      mutableCurrencyList.add(createCurrencyEntity("XDR", "Special Drawing Rights"))
      mutableCurrencyList.add(createCurrencyEntity("XOF", "CFA Franc BCEAO"))
      mutableCurrencyList.add(createCurrencyEntity("XPF", "CFP Franc"))
      mutableCurrencyList.add(createCurrencyEntity("YER", "Yemeni Rial"))
      mutableCurrencyList.add(createCurrencyEntity("ZAR", "South African Rand"))
      mutableCurrencyList.add(createCurrencyEntity("ZMK", "Zambian Kwacha (pre-2013)"))
      mutableCurrencyList.add(createCurrencyEntity("ZWL", "Zimbabwean Dollar"))
      return mutableCurrencyList
    }

    private fun createCurrencyEntity(countryCode: String, countryName: String) =
        CurrencyEntity(0, countryCode, countryName)
  }

}

