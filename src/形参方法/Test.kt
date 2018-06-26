package 形参方法

/**
 * Created by fangmaster on 2018/4/18.
 */

fun main(any: Array<String>){
    print(p("hello ",::say))

    for (i in 4 downTo 1 step 4) print(i)

}


fun p(string: String,say:(s:String)->String):String{
   return say(string)
}

 fun say(string: String):String{
    return string+" say"
}