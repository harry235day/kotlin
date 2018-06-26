package 构造函数

/**
 * Created by fangmaster on 2018/4/16.
 */

/**
 * var 可变参数  val 不可变
 */
class Person(var name: String){
    private  var desc :String? = null
    init {
        name="init 构造函数"
        println("1")
    }

     constructor(name: String,desc:String):this(name){
        this.desc = desc
         println("2")
    }

    internal fun say(){
        println("$name")
    }
}