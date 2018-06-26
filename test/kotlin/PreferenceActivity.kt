package zll.com.test

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

/**
 * Created by fangmaster on 2018/4/19.
 */
 class PreferenceActivity :AppCompatActivity(){
    var cityName:String by Preference(this,"cityname","北京")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("zz",cityName)
        cityName = "nanjing"
        Log.e("zz",cityName)
    }
}