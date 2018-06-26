package 空安全

/**
 * Created by fangmaster on 2018/5/14.
 */
fun main(args:Array<String>){
    val listwithnull:List<String?> = listOf("aaa",null)
    //自动打印
    listwithnull.forEach {
        println(it) //  aaa  null
    }
    println("----------")

    for(item in listwithnull){
        // 输出 aaa  并忽略 null
       item?.let {
           println(it)  // aaa
       }
    }

}

/**
 * A?.B?.C?.name
 *
 */