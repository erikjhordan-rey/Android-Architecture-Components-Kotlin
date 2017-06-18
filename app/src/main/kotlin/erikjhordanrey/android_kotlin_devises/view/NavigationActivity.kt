package erikjhordanrey.android_kotlin_devises.view

import android.arch.lifecycle.LifecycleActivity
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.widget.TextView
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
      currencyList!!.forEach { //println(" Code " + it.code + " Country " + it.country)
         }
    })

    val exchangeViewModel = ViewModelProviders.of(this).get(ExchangeViewModel::class.java)
    exchangeViewModel.getAvailableExchange("AUD,EUR").observe(this, Observer {
      availableExchange ->
      print(availableExchange?.currencyFrom)
      print(availableExchange?.currencyTo)
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
