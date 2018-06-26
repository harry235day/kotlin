package 类的扩展.a

/**
 * Created by fangmaster on 2018/4/23.
 */
fun main(a:Array<String>){
    pr(D())



}
open class C(){
    open  fun foo(){
        println("C")
    }
}
class D :C(){
    override fun foo(){
        println("D")
    }
}

fun pr(a:C){
    println(a.foo())
}

