package 类的代理

/**
 * Created by fangmaster on 2018/4/16.
 */
class LazySample{
    val l :String by lazy {
        println("init lazy")
        "lazy"
    }
}