package LeetCode.Array

/**
 * Created by fangmaster on 2018/5/24.
 */
fun main(args: Array<String>) {
    var vlue:Array<Int> = arrayOf(1, 2, 2, 3, 2, 4, 2, 2, 5)
//    var length = removeElement(vlue, vlue.size, 7);
//    println(length)
    var array:Array<Int> = vlue.sortedArray()
    var size = removeSortElement(array);
    println(size)
}

/**
 *  在一个数组里面移除指定 value，并且返回新的数组长度。这题唯一需要注意的地方在于in place，不能新建另一个数组。
 *
方法很简单，使用两个游标i，j，遍历数组，如果碰到了value，使用j记录位置，同时递增i，
直到下一个非value出现，将此时i对应的值复制到j的位置上，增加j，重复上述过程直到遍历结束。
这时候j就是新的数组长度
 */
// 1 2 2 2 4 5

fun removeElement(A: Array<Int>, n: Int, value: Int): Int {
    var i = 0;
    var j = 0;
    for (i in A.indices) {
        if (A[i] == value) {
            continue
        }
        A[j] = A[i]
        //        println("$j +:"+A[j])
        j++
    }
    return j;
}




// 去除 数据中重复的元素

fun removeSortElement(A:Array<Int>): Int {
    var j = 0
    for (i in 1..A.size){
        if(A[j]!=A[i]){
            A[++j]=A[i]
        }
        println(A[j])
    }
    return j+1
}


