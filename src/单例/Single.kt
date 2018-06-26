package 单例

/**
 * Created by fangmaster on 2018/4/16.
 */
class Single private constructor(){
    //利用半生对象 返回一个 val 修饰的外部类对象
    companion object{
        fun getSingle():Single{
            return Holder.instance
        }
    }

    fun say(){
        println("aaa")
    }

    private object Holder{
        val instance = Single();
    }



}