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

import dagger.BindsInstance
import dagger.Component
import erikjhordanrey.android_kotlin_devises.view.CurrencyFragment

@Component(modules = [CurrencyModule::class], dependencies = [AppComponent::class])
@FeatureScope
interface CurrencyComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun currencyFragment(currencyFragment: CurrencyFragment): Builder

        fun appComponent(appComponent: AppComponent): Builder

        fun build(): CurrencyComponent
    }

    fun inject(currencyFragment: CurrencyFragment)
}
