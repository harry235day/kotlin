package 集合.过滤操作符

/**
 * Created by fangmaster on 2018/4/26.
 */
fun main(array: Array<String>){
    val l = listOf<Int>(9,0,1,2,3,4,5,6,7,8,1)

    // drop 返回包含去掉前n个元素的所有元素的列表
    val dropf = l.drop(2)
    println("drop: $dropf")

    // dropwhile 根据特定的函数 从第一项开始 直到   不满足条件后 返回 列表
    val dropwhilef = l.dropWhile { it>-1 }
    println("dropwhile: $dropwhilef")

    val dropLastWhilef = l.dropLastWhile { it<10 }
    println("dropLastWhile: $dropLastWhilef")


    // filter 返回所有符合给定函数条件的元素。
    val filterf = l.filter { it>5 }
    println("filter: $filterf")

    //filterNot 返回所有不符合给定函数条件的元素
    val filterNotf = l.filterNot { it>5 }
    println("filterNot: $filterNotf")

    // filterNotNull 返回非null元素

    val filterNOtNullf = l.filterNotNull()
    println("filterNOtNull: $filterNOtNullf")

    // slice 返回在ranger 范围内的元素  range  必须是集合被的元素
    val slicef = l.slice(8..0)  // []
    println("slice: $slicef") //2..6 [2, 3, 4, 5, 6]

    // 返回  l集合中 索引是 9 8 7 6 的元素
    val slicef1 = l.slice(listOf(9,8,7,6))
    println("slice: $slicef1")

    // take 返回前 n 项
    val takef = l.take(l.size-3)
    println("take: $takef")

    // takeLast 返回后n 项
    val takelastf = l.takeLast(2)
    println("takelast: $takelastf")


    // takeWhile 从第一项开始判断，直到不符合就返回，返回符合的前几项数据
    val takeWhilef = l.takeWhile { it>6 }
    println("takewhile: $takeWhilef") //  [9]
}