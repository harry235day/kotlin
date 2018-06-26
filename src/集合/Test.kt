package 集合

import 函数的声明.say

/**
 * Created by fangmaster on 2018/4/17.
 */
fun saya(i:Int?):String{
    var s:String = ""
    when(i){
        1    -> s = "一"
        2    -> s = "二"
        else -> s = "haha"
    }
    return s
}

fun letgo(i: Int?){
    when(i){
        1    -> {
            println("11111")
        }
        2    -> {
            println("2222")
        }
        else -> {
            println("else")
        }
    }
}
/**
 *
 */
fun main(args:Array<String>){

    val l = listOf(null,2,3,4)
    val x = setOf(1,2)
    val a = arrayOf(1,2,3)
    val l1 = l.toList()
    for(x in l1){
        print(x)
    }
    println(l.first())
    println(l.last())
    println(l.isEmpty())

    println("---------")
    var eak = l.firstOrNull()?:"kkong"
    println(eak)

    letgo(1)
    letgo(2)
    for(x in l){
        print(saya(x))
    }


    val mapss = mapOf(
            "name" to "11",
            "name1" to "22"
    )





    for(x in 1..5){

    }

    for(x in l){
        print("$x ")
    }
    println("---------------")

    val map = mapOf<String,Any?>(
            "name1" to 1,
            "name2" to "111"
    )
    val map1 = mapOf<Any?,Any?>(
            "name1" to 1,
            "name2" to "111",
            1       to  2,
            null    to 1
    )

    for((a,b) in map1){
        println("$a=$b")
    }

    for(x in map1.keys){
        println(x)
    }
    for(x in map1.values){
        println("v:$x ")
    }
    println("---------------")
    for(x in (1..5).reversed()){
        print("$x ")
    }
    println("---------------")

    val la = listOf(1,2,3,4,5,6,7)
    for(x in 3..la.size-2){
        print("$x ")
    }
    println("---------------")
    /**
     * 倒叙遍历 downTo
     */
    for(x in la.size downTo 0){
        print("$x ")
    }
    println("---------------")
    /**
     * forEach
     */
    la.forEach {
        print("$it ")
    }
    println("---------------")


    /* val b = Array(3, { i -> (i * 2) })
    val c = Array(3,{i -> i})
    for(x in b){
        print(x)
    }
    for(x in c){
        print(x)
    }*/
}

