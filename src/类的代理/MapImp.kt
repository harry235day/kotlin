package 类的代理

import kotlin.properties.getValue

/**
 * Created by fangmaster on 2018/4/16.
 */
class MapImp(map:Map<String,Any?>){
    val name:String by map
    val age :Int by map
}