package Kotlin操作符.一元操作符

/**
 * Created by fangmaster on 2018/5/14.
 */

fun main(args:Array<String>){
    val a = A(-1,-2)
    println(a)
}

/**
 * 表达式 翻译为
 *  +a a.unaryPlus()
 *  -a a.unaryMinus()
 *  !a a.not
 */
data class A(val x:Int,val y:Int)
operator fun  A.unaryMinus() = A(-x,-y)