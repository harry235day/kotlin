package 委托



/**
 * Created by fangmaster on 2018/4/25.
 */
fun main(array: Array<String>){
    var b = BaseImpl(11)
    Derived(b).printMessgae()
}
interface Base{
    fun printMessgae()
}
class BaseImpl(var x:Int) :Base {
    override fun printMessgae() {
        println(x)
    }
}

class Derived(b:Base):Base by b{
    override fun printMessgae() {
       println("aaa")
    }
}

