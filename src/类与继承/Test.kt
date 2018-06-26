package 类与继承

import java.util.*

/**
 * Created by fangmaster on 2018/4/19.
 */
fun main(args:Array<String>){
    val c = C()
    c.f()

}
open class A(){
    open fun f(){
        println("A：f()")
    }
    fun a(){println("a")}
}

interface B{
    fun f(){
        println("B:f()")
    }
    fun b(){println("b")}
}

class C() :A(),B{
    override fun f() {
        super<A>.f()
        super<B>.f()
    }

}