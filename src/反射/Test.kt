package 反射

/**
 * Created by fangmaster on 2018/5/14.
 */
fun main(args:Array<String>){
    // 类引用
    val mc = MyClass::class
    println(mc)

    numF()
    heavload()
    filedM()

    findProty()

    regex()


}
class MyClass(val a:Int){

}

/**
 * 函数引用  ::
 */

fun isOdd (x:Int) = x%2 !=0

fun numF(){
    val nums = listOf(1,2,4,3)
    val c = nums.filter ( ::isOdd )
    println(c)
}

//重载
fun heavload(){
    fun isOdd(x: Int) = x % 2 != 0
    fun isOdd(s: String) = s == "brillig" || s == "slithy" || s == "tove"
    val numbers = listOf("tove")

    val prideict:(String) -> Boolean = ::isOdd

    println(numbers.filter(prideict)) // 引用到 isOdd(x: Int)
}

fun <A, B, C> compose(f: (B) -> C, g: (A) -> B): (A) -> C {
    return { x -> f(g(x)) }
}

//s属性引用
val x = 1
var y = 1
fun filedM(){

    println(::x.get())
    println(::x.name)

    ::y.set(2)
    println(y)

    val l = listOf("a","11","222")
}

// 访问类的成员
fun findProty(){

    val prop = MyClass::a

    val a = prop.get(MyClass(111))
    println(a)

}

// 正则

fun regex(){
    val numberRegex = "\\d+".toRegex()
    val a = numberRegex.matches("1111111111111111111")
    println(a)
}