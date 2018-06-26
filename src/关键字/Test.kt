package 关键字

import java.util.*
import java.util.logging.Logger
import kotlin.properties.Delegates
import kotlin.properties.getValue
import kotlin.properties.setValue
import kotlin.reflect.KProperty

/**
 * Created by fangmaster on 2018/4/18.
 */

/**
 * object lazy when let apply with
 */
fun main(any: Array<String>){
    var b = 1
    println(b)
    println(a)

    println("$name")
    name="aaa"
    println("----------")
    println(na)
    na="bb"
    println(na)
    println("----------")
    var maps = mapOf(
            "name" to "zz",
            "age"  to  "12"
    )
    val users = Users(maps)
    print(users.name+"-"+users.age)
    println("----------")

    println(testfun())

    println("----------")

    testApply()

    println("----------")

   println( testWith())

}

//var类型属性不能设置为延迟加载属性，因为在lazy中并没有setValue(…)方法
val  a :String by lazy {
    "heoll"
}
//Delegates.observable() 函数接受两个参数: 第一个是初始化值, 第二个是属性值变化事件的响应器(handler)
var name:String by Delegates.observable("hello world",{
    KProperty,old,new ->
    println(KProperty.name+" | "+old+" | "+new )
})

//Delegates.vetoable()函数接受两个参数: 第一个是初始化值, 第二个是属性值变化事件的响应器(handler),是可观察属性(Observable)的一个特例，
//不同的是在响应器指定的自动执行执行的lambda表达式中在保存新值之前做一些条件判断，来决定是否将新值保存。
var na: String by Delegates.vetoable("hello", {
    KProperty, old, new ->
    println(KProperty.name + " | " + old + " | " + new)
    true
})

// 类的构造器接受一个map实例作为参数，将map实例本身作为属性的委托，
// 属性的名称与map中的key是一致的，也就是意味着我们可以很简单的从一个动态地map中创建一个对象实例

class Users(val map:Map<String,Any?>){
    val name :String by map
    val age  :String by map
}

/**
 * 委托属性将从这个 map中读取属性值(使用属性名称字符串作为 key 值)。
    如果不用只读的 Map , 而改用值可变的 MutableMap , 那么也可以用作 var 属性的委托。
 */

class User(val map:MutableMap<String,Any?>){
    var name:String by map
    var age :String by map
}


// let 默认当前这个对象作为闭包的it参数，返回值是函数里面最后一行，或者指定return
fun testfun() :String{
    "aa".let {
        println(it)
        return "let"
    }
}

// apply 调用某对象的apply函数，在函数范围内，可以任意调用该对象的任意方法，并返回该对象
fun testApply(){
    ArrayList<String>().apply {
        add("1")
        add("hello")
        forEach {
            println(it)
        }
    }.let {
        println(it)
    }
}

/**
 * with
 *  with函数是一个单独的函数，并不是Kotlin中的extension，
 *  所以调用方式有点不一样，返回是最后一行，然后可以直接调用对象的方法，感觉像是let和apply的结合。
 */
//with 对一个对象 要调用对象里的方法
fun testWith():String{
    with(ArrayList<String>()){
        add("with1")
        add("with2")
        forEach {
            println(it)
        }
    }.let{
       return "hello"
    }
}


/**
 * constructor  用于标识构造函数 没有修饰符时默认不写
 */

class Bean constructor(var names:String){// == class Bean(name: String)
    private var desc:String? = null
    init {
        names = "zz"
    }

    /// 二级 构造
    constructor(names:String,desc:String):this(names) {
        this.desc = desc
    }
    //内联函数
    internal fun say(){
        println(names)
    }
}


/**
  * open    修饰类可以被继承  修饰方法可以被重写
  *          在kotlin中 类是fianl 不可以被重写 方法不可以被重写
  */

open class Ba(){
    open fun say(){}
}

abstract class Bas :Ba(){
    abstract override fun say()
}

class Base :Bas(){
    override fun say() {

    }
}