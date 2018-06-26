package Kotlin操作符.操作符02

/**
 * Created by fangmaster on 2018/5/14.
 */
fun main(args:Array<String>){
    elvis()
    //notnull()
    asnull()
    filternotnull()
}


/**
 *  Elvis 操作符   ?: == else
 */
fun elvis(){
    val b:String? = null
    val length = b?.length ?: -1
    println(length) // -1
}

/**
 *  !! 非空断言操作符
 */
fun notnull(){
    val b:String? = null
    val length = b!!.length
    println(length)
}

/**
 *  as? 安全类型转换
 */
fun asnull(){
    val a:String = ""
    val aInt:Int? = a as? Int
    println(aInt)
}

/**
 * filterNotNull 可空类型的集合
 */

fun filternotnull(){
    val list:List<Int?> = listOf(1,2,null,3)
    val iList:List<Int> = list.filterNotNull()
    println(iList)
}