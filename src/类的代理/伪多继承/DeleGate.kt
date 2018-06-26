package 类的代理.伪多继承

/**
 * Created by fangmaster on 2018/4/16.
 */
class DeleGate :Animal,Food, Water() {
    override fun bark() {
        println("miao")
    }

    override fun eat() {
        println("mouse")
    }
}