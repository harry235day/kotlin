package zll.com.test

import android.content.Context
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * Created by fangmaster on 2018/4/19.
 *	委托代理模式  监听属性的变化  Delegates .observable .vetobale
 * ReadWriteProperty   具体请看关键字章节
 */
 
 
 
 class Preference<T>(val context:Context,val name:String,val default:T):ReadWriteProperty<Any?,T> {
    val prefs by lazy {
        context.getSharedPreferences("default", Context.MODE_PRIVATE)
    }

    override fun getValue(thisRef: Any?, property: KProperty<*>): T {
        return findPreference(name, default)
    }


    override fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        putPreference(name, value)
    }


    private fun findPreference(name: String, default: T): T = with(prefs) {
        val res: Any = when (default) {
            is Long -> getLong(name, default)
            is String -> getString(name, default)
            is Int -> getInt(name, default)
            is Boolean -> getBoolean(name, default)
            is Float -> getFloat(name, default)
            else -> throw IllegalArgumentException("this type can be saved int Prefernece")
        }
        res as T
    }

    private fun putPreference(name: String, value: T) = with(prefs.edit()) {
        when(value){
            is Long -> putLong(name, value)
            is String -> putString(name, value)
            is Int -> putInt(name, value)
            is Boolean -> putBoolean(name, value)
            is Float -> putFloat(name, value)
            else -> throw IllegalArgumentException("this type can be saved int Prefernece")
        }.apply()
    }
}