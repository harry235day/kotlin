package 集合.元素操作符

/**
 * Created by fangmaster on 2018/4/26.
 */
fun main(args:Array<String>){
    val l = listOf<Int>(1,2,3,4,5,6,7,0,1,2)

    // contais 如果指定元素可以在集合中找到，则返回true。
    val containsf = l.contains(2)
    println("contains: $containsf") //contains: true

    // elementAt() 返回给定index对应的元素，如果index数组越界则会 抛出IndexOutOfBoundsException
    val elementAtf = l.elementAt(6)
    println("elementAt: $elementAtf") //elementAt: 7

    // elementAtOrElse   返回给定index对应的元素，如果index数组越界则会根据给定函数返回默认值,第二个参数default，lamdba表达式

    val elementAtOrElsef = l.elementAtOrElse(100){"aaa"}
    println("elementAtOrElse: $elementAtOrElsef") // elementAtOrElse: aaa

    // elementAtOrNull 返回给定index对应的元素，如果index数组越界则会 返回null
    val elementAtOrNullf = l.elementAtOrNull(10)
    println("elementAtOrNull： $elementAtOrNullf") // elementAtOrNull： null

    // first 返回第一个元素
    val firstf = l.first()
    println("first: $firstf") // first: 1

    // first{}  返回符合给定函数条件的第一个元素,没有回抛异常
    val firstff = l.first { it>1 }
    println("first: $firstff") // first: 2

    // firstOrNull  返回符合给定函数条件的第一个元素，如果没有符合则返回null
    val firstOrNullf = l.firstOrNull()
    println("firstOrNull: $firstOrNullf") // firstOrNull: 1

    val firstOrNullff = l.firstOrNull{it>100}
    println("firstOrNull: $firstOrNullff") // firstOrNull: null

    // index() 返回指定元素的第一个index，如果不存在，则返回-1
    val indexf = l.indexOf(2)
    println("index: $indexf") // index: 1

    // indexOfFirst{} 返回第一个符合给定函数条件的元素的index，如果没有符合则返回-1
    val indexOfFirstf = l.indexOfFirst { it==2 }
    println("indexOfFirst: $indexOfFirstf") // indexOfFirst: 1

    // indexOfLast{} 返回最后一个符合给定函数条件的元素的index，如果没有符合则返回-1
    val indexOfLastf = l.indexOfLast { it==2 }
    println("indexOfLast: $indexOfLastf")  // indexOfLast: 9

    // last{} 返回指定函数条件的最后一个元素  没有 就抛异常
    val lastf = l.last { it==2 }
    println("last: $lastf")  // 2

    // lastIndexOf()返回指定元素的最后一个index，如果不存在，则返回-1
    val lastIndexOff = l.lastIndexOf(2)
    println("lastIndexOf: $lastIndexOff") //9

    // lastOrNull{} 返回符合给定函数条件的最后一个元素，如果没有符合则返回null
    val lastOrNullf = l.lastOrNull { it>11 }
    println("lastOrNull: $lastOrNullf") //null

    // sigle{} 返回符合给定函数的单个元素，如果没有符合或者超过一个，则抛出异常
    val siglef = l.single{it>6}
    println(siglef)   // 7

    // 返回符合给定函数的单个元素，如果没有符合或者超过一个，则返回null  sigleOrNull


}