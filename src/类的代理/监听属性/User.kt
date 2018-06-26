package 类的代理.监听属性

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

/**
 * Created by fangmaster on 2018/4/16.
 */
class User{
    var name: String by Delegates.observable("oldName") {
        kProperty, old, new ->
        println("${kProperty.returnType}, $old -> $new")
    }
    var age:Int by Delegates.observable(0){
        KProperty,old,new  ->
        println("${KProperty.returnType},$old -> $new")
    }
    // 默认值不受 vetoable 影响
    var address: String by Delegates.vetoable("wan", {
        kProperty, oldValue, newValue ->
        println("oldValue：$oldValue | newValue：$newValue")
        newValue.contains("wang")
    })
}