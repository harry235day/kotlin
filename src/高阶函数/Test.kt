package 高阶函数

/**
 * Created by fangmaster on 2018/4/17.
 */
fun main(args:Array<String>){
    log("hello",printMsg)
    test()

}

// 定义一个lambda 闭包
val printMsg = {
    str:String ->
        println(str)
}

//unit 返回一个  空函数
val log ={
    str:String,prinlog:(String) -> Unit ->
        prinlog(str)
}

//使用 lambda 表达式来过滤（filter）和映射（map）集合

fun test(){
    var fliter = listOf("banana", "avocado", "apple", "kiwifruit")

    fliter.filter{ it.startsWith("a") }
          .sortedBy { it }
          .map { it.toUpperCase() }
          .forEach { println(it) }
}