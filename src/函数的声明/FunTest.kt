package 函数的声明

import Static函数.StringUtils
import java.util.concurrent.locks.Lock

/**
 * Created by fangmaster on 2018/4/16.
 */
fun main(agrs :Array<String>){
    println(say("hello kotlin"))
    println(say())
    say("hello","wold")
    StringUtils.say()
    StringUtils.say("aaa")
}

fun `is`(){

}

//函数的声明
/*
fun say(str:String):String{
    return str
}*/

//fun say(str:String):String = str

fun say(str: String="hello"):String = str

//可变参数
fun say(vararg strArray:String){
    for(x in strArray){
        print(x+"  ")
    }
}

//函数作为参数

fun lock<T>(lock: Lock, body: () -> T ) : T {
    lock.lock()
    try {
        return body()
    }
    finally {
        lock.unlock()
    }
}