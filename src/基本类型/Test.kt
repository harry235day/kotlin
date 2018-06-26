package 基本类型

/**
 * Created by fangmaster on 2018/4/19.
 */
fun main(args:Array<String>){
//    val millon = 1_000_000


    val x = (1 shl 1 )
    println(x)
    println(-0.0 == 0.0 ?:false)
    val s = "Hello, world!\n"
    println(s)
}



/**
 *  完整的位运算列表（只用于 Int 和 Long ）：
    shl(bits) – 有符号左移 (Java 的 << )
    shr(bits) – 有符号右移 (Java 的 >> )
    ushr(bits) – 无符号右移 (Java 的 >>> )
    and(bits) – 位与
    or(bits) – 位或
    xor(bits) – 位异或
    inv()     - 位非
 */