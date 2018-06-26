package 尾递归函数

/**
 * Created by fangmaster on 2018/4/25.
 */
fun main(args:Array<String>){
    findPoint()
}
tailrec fun findPoint(x:Double = 1.0):Double{
    if(x==Math.cos(x)) {
        print(x)
        return x
    }else{
        findPoint(Math.cos(x))
    }
    return 0.0
}