package 函数

/**
 * Created by fangmaster on 2018/4/16.
 */
 fun main(array: Array<String>){
    for(x in 2..100 step 20 ){
        print("$x ")
    }
    println("------------")
    for(x in 1.rangeTo(10)){
        print("$x ")
    }
    println("------------")

    /**
     *   闭包，
     */
    var text = {
        x:Int,y:Int ->
        println("${x+y}")

    }(1,3)
}