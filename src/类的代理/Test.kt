package 类的代理

import 类的代理.伪多继承.Animal
import 类的代理.伪多继承.Cat
import 类的代理.伪多继承.DeleGate
import 类的代理.伪多继承.Food
import 类的代理.监听属性.User

/**
 * Created by fangmaster on 2018/4/16.
 */
fun main(array: Array<String>) {
    //代理
    val bas = BaseImp()
    BaseProxy(bas).say()
    BaseProxy(bas).talk()

    //懒加载
    val lazy = LazySample()
    println(lazy.l)
    println(lazy.l)

    //监听属性的变化
    val user = User()
    println(user.age)
    user.age = 2
    println(user.age)
    println(user.name)
    user.name = "newName"
    println("------")
    println(user.address)
    user.address = "newAdress"
    println(user.address)
    println("------")

    // 属性非空强校验
    val example = Example()
    example.name = "属性非空强校验"
    println(example.name)
    println("------")
//    Map值 映射到类属性

    val mapImp = MapImp(mapOf(
            "name" to "XM",
            "age"  to 12
    ))

    println("name= ${mapImp.name},age= ${mapImp.age}")

    println("------")

//    伪多继承

    val d :DeleGate = DeleGate()

    Cat(d, d).bark()
    Cat(d,d).eat()

}


