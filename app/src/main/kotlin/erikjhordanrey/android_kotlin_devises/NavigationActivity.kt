package erikjhordanrey.android_kotlin_devises

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class NavigationActivity : AppCompatActivity() {

  private var message: TextView? = null

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    message = findViewById(R.id.message) as TextView
    val navigation = findViewById(R.id.navigation) as BottomNavigationView
    navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
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
