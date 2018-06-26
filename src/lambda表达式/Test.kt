package lambda表达式

import 关键字.a

/**
 * Created by fangmaster on 2018/4/17.
 */
fun main(args: Array<String>) {
    printMsg.invoke("hello")
    printMsg("wold")

    //    将当前累积值与每个集合元素连续接合起来代入累积值来构建返回值
    /**
     * 0+1 1+2 3+3 6+4 10+5
     */

    val items = arrayOf(1, 2, 3, 4, 5)
    val times = arrayOf("1","2","3")
    val re = items.fold(0, {
        a: Int, b: Int ->
        println("$a +$b")
        val res = a + b
        println(res)
        res
    })
    println(re)
    println("----------------")
    //等价 lambda
    val rs = items.fold(0,{
        a,b -> a+b
    } )
    println(rs)

    println("----------------")

    val reduct = items.fold(1,Int::times)
    println(reduct)
    println("----------------")

    val repeat: String.(Int) -> String = { times -> repeat(times) }

    fun runTransformation(f: (String, Int) -> String): String {
        return f("hello", 3)
    }
    val result = runTransformation(repeat) // OK
    //sampleEnd
    println("result = $result")

    println("----------------")


    val strs = arrayOf("aa","bbb","ccc",0)


}

//声明一个lambda
val printMsg = {
    msg: String ->
    println(msg)
}