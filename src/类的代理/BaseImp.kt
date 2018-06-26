package 类的代理

/**
 * Created by fangmaster on 2018/4/16.
 */
 class BaseImp : Base{
    override fun say() {
        println("baseimp :: say")
    }

    override fun talk() {
        println("baseimp :: talk")
    }
}