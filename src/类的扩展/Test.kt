package 类的扩展

import 单例.Single

/**
 * Created by fangmaster on 2018/4/16.
 */


//如果智能转换的对象是一个全局变量，这个变量可能在别的地方被改变赋值，所以你必须手动判断与转换它的类型。
fun main(args: Array<String>) {
    if (animal is Dog) {
        (animal as Dog).say()
    }else{
        println("dog")
    }

   val single =  Single.getSingle()
    single.say()
}

var animal: Animal? = null

open class Animal {

}

class Dog : Animal() {
    fun say() {
        println("animal")
    }
}