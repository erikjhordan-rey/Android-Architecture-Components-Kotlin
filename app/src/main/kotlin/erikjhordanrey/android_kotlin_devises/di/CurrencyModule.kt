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

package erikjhordanrey.android_kotlin_devises.di

import android.app.Application
import android.content.Context
import androidx.lifecycle.ViewModelProvider
import dagger.Module
import dagger.Provides
import erikjhordanrey.android_kotlin_devises.data.remote.RemoteCurrencyDataSource
import erikjhordanrey.android_kotlin_devises.data.remote.RemoteCurrencyService
import erikjhordanrey.android_kotlin_devises.data.repository.CurrencyRepository
import erikjhordanrey.android_kotlin_devises.data.room.CurrencyDatabase
import erikjhordanrey.android_kotlin_devises.data.room.LocalCurrencyDataSource
import erikjhordanrey.android_kotlin_devises.view.CurrencyFragment
import erikjhordanrey.android_kotlin_devises.view.CurrencyViewModel
import erikjhordanrey.android_kotlin_devises.view.CurrencyViewModelFactory
import retrofit2.Retrofit

@Module
class CurrencyModule {

    @Provides
    @FeatureScope
    fun provideCurrencyDatabase(application: Application) = CurrencyDatabase.buildPersistentCurrency(application)

    @Provides
    @FeatureScope
    fun provideLocalCurrencyDataSource(currencyDatabase: CurrencyDatabase) =
            LocalCurrencyDataSource(currencyDatabase)

    @Provides
    @FeatureScope
    fun provideRemoteCurrencyService(retrofit: Retrofit): RemoteCurrencyService =
            retrofit.create(RemoteCurrencyService::class.java)

    @Provides
    @FeatureScope
    fun provideRemoteCurrencyDataSource(remoteCurrencyService: RemoteCurrencyService) =
            RemoteCurrencyDataSource(remoteCurrencyService)

    @Provides
    @FeatureScope
    fun provideCurrencyRepository(localCurrencyDataSource: LocalCurrencyDataSource,
                                  remoteCurrencyDataSource: RemoteCurrencyDataSource) =
            CurrencyRepository(localCurrencyDataSource, remoteCurrencyDataSource)

    @Provides
    fun provideCurrencyViewModel(currencyFragment: CurrencyFragment, currencyViewModelFactory: CurrencyViewModelFactory):
            CurrencyViewModel = ViewModelProvider(currencyFragment, currencyViewModelFactory).get(CurrencyViewModel::class.java)
}
