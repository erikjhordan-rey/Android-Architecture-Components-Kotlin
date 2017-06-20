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

package erikjhordanrey.android_kotlin_devises.view

import android.arch.lifecycle.LifecycleActivity
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.widget.TextView
import android.widget.Toast
import erikjhordanrey.android_kotlin_devises.R


class NavigationActivity : LifecycleActivity() {

  private var message: TextView? = null

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    message = findViewById(R.id.message) as TextView
    val navigation = findViewById(R.id.navigation) as BottomNavigationView
    navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
  }


  override fun onResume() {
    super.onResume()

    val currencyViewModel = ViewModelProviders.of(this).get(CurrencyViewModel::class.java)
    currencyViewModel.getCurrencyList()?.observe(this, Observer { currencyList ->
      currencyList!!.forEach {
        println(" Code " + it.code + " Country " + it.country)
      }
    })

    val exchangeViewModel = ViewModelProviders.of(this).get(ExchangeViewModel::class.java)
    exchangeViewModel.getAvailableExchange("AUD,EUR")?.observe(this, Observer { availableExchange ->
      availableExchange?.availableExchangesMap?.forEach { key, value ->
        Toast.makeText(this, key + " " + value, 0).show()
      }
    })
  }


  private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
    when (item.itemId) {
      R.id.navigation_home -> {
        message!!.setText(R.string.title_home)
        return@OnNavigationItemSelectedListener true
      }
      R.id.navigation_dashboard -> {
        message!!.setText(R.string.title_dashboard)
        return@OnNavigationItemSelectedListener true
      }
    }
    false
  }

}
