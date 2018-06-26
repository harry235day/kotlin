package 集合泛型

/**
 * Created by fangmaster on 2018/4/17.
 */
fun main(agrs:Array<String>){
    val mutableList :List<B> = listOf<B>(B(), B(), C())
    val list:List<A> = mutableList
    for(x in list){
        println(x.toString())
    }
}

open class A(string: String)
open class B : A("hello")
open class C : B()