package Static函数

/**
 * Created by fangmaster on 2018/4/16.
 */
object  StringUtils {
   @JvmStatic fun say(){
        println("say")
    }
    fun say(str:String){
        println(str)
    }
}