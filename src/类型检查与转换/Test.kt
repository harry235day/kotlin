package 类型检查与转换

/**
 * Created by fangmaster on 2018/4/28.
 */
fun main(agrs:Array<String>){
    val x:Any = 1
    if(x !is String || x.length==0) return

}