package 异常

/**
 * Created by fangmaster on 2018/5/14.
 */
fun main(args: Array<String>) {
    trynull()
    nothing()

}

/**
 *  try 可以有返回值
 */

fun trynull() {
    val a: String = ""
    val b: Int
            = try {
        Integer.parseInt(a)
    } catch(e: NumberFormatException) {
        -1
    }
    println(b) // -1
}

fun nothing(){
    val a:String? = null
    val s = a?.length ?:nothingnull()
    println(s)
}

/**
 *  Nothing 类型
 */

fun nothingnull(): Nothing {
    throw  IllegalArgumentException("空空如也")
}