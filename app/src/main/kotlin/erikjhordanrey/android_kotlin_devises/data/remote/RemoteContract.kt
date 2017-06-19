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


