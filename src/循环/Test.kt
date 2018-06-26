package 循环

/**
 * Created by fangmaster on 2018/4/18.
 */

fun main(any: Array<String>){
    val l = arrayListOf(1,2,3,4,"hello")
    for(i in l.indices){
        println("index: $i --- ${l[i]}")
    }

    for((index,value) in l.withIndex()){
        println("$index,$value")
    }

}