package 集合.总数操作符

/**
 * Created by fangmaster on 2018/4/26.
 */
fun main(args:Array<String>){
    val l = listOf<Int>(0,1,2,3,4,5,6,7,8,9)
    // any 只要有一个就返回 true
    val anyf = l.any { it>8 }
    println("any: $anyf") //any: true

    // all 所以条件符合返回 true
    val allf = l.all { it>0 }
    println("all: $allf")  //all: false

    // count 返回符合条件的个数
    val countf = l.count { it>5 }
    println("count: $countf") //count: 4

    // none 如果没有任何元素符合条件返回true
    val nonef = l.none { it>10 }
    println("none: $nonef") //none: true

    // fold 在初始值得基础上 从第一项到最后一项 通过函数操作  所有元素
    val foldf = l.fold(""){a,b -> a+b}
    println("fold: $foldf") //fold: 0123456789

    // foldright 从最后到第一个  *** 注意
    val foldrightf = l.foldRight(""){a ,b -> b + a }
    println("foldRight: $foldrightf") //foldRight: 9876543210

    // reduce  从第一项到最后一项 操作一个函数 没有初始值
    val reducef = l.reduce { a,b -> a+b }
    println("reduce: $reducef") //reduce: 45

    // forEach
    val foreachf = l.forEach {print(it) }
    println("------------")
    // forEachIndexed 与foreach相同，但是可以得到index
    val findex = l.forEachIndexed { index, value -> print("$index $value |") }
    println("")
    ////max 返回最大的值，如果没有则返回null min同
    val maxf = l.max()
    val minf = l.min()
    println("max:$maxf")
    println("min:$minf")

    //maxBy 根据 指定的函数  返回最大值 minBy同
    val maxbyf = l.maxBy { it -1 }
    println("maxbyf:$maxbyf")

    ////sumBy 每项经过函数转换后的和
    val sumbyf = l.sumBy { it }
    println("sumby:$sumbyf")
}


