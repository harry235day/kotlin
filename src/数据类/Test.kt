package 数据类

/**
 * Created by fangmaster on 2018/4/17.
 */
fun main(args:Array<String>){
    val b = Bean("hello",100)
    println("${b.name} == ${b.age}")


    val p1 = User("p1")
    val p2 = User("p2")
    p1.age = 1;
    p2.age = 2;
    val oldP = p1.copy("oldP")
    println("person1 == person2: ${p1 == p2}")
    println("person1 with age ${p1.age}: ${p1}")
    println("person2 with age ${p2.age}: ${p2}")
    println("person2 with age ${oldP.age}: ${oldP}")
}

/**
 *定义一个model
 */

 class Bean(var name:String,var age:Int)

data class User(var name: String){
    var age:Int = 0
}