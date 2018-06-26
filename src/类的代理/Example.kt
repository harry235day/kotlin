package 类的代理

import kotlin.properties.Delegates

/**
 * Created by fangmaster on 2018/4/16.
 */
//属性非空强校验
class Example{
    var name:String by Delegates.notNull()

    fun init(name:String){
        this.name =name
    }
}