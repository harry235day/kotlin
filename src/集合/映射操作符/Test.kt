package 集合.映射操作符

/**
 * Created by fangmaster on 2018/4/26.
 */

fun main(args:Array<String>){
    val l = listOf<Int>(1,2,3,4,5,6,7,0,1,2)

    // map 返回 满足条件的集合
    val mapf = l.map { it>5 }
    println("map: $mapf") // [false, false, false, false, false, true, true, false, false, false]

    // 返回特定函数后的集合，参数是 Iterable 类型
    val flatmapf = l.flatMap { listOf(it,it+1) }
    println("flatmap: $flatmapf") //  [1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 0, 1, 1, 2, 2, 3]

    // groupBy 根据函数将集合分组，返回map类型对象
    val groupByf = l.groupBy { it>5 }
    println("groupBy: $groupByf") // {false=[1, 2, 3, 4, 5, 0, 1, 2], true=[6, 7]}
    for((a,b) in groupByf){
        println("key: $a,value: $b")
    }

    // mapIndexed 返回一个集合，通过 角标和值 来生成
    val mapindexedf = l.mapIndexed { l , v -> v }
    println("mapIndexed: $mapindexedf")

    // mapNotNull 回一个每一个非null元素根据给定的函数转换所组成的List
    val mapnotnullf = l.mapNotNull { it+1 }
    println("mapNotNull: $mapnotnullf")
}