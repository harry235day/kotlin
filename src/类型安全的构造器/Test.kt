package 类型安全的构造器

import javax.swing.text.html.HTML


/**
 * Created by fangmaster on 2018/5/14.
 */
fun main(args: Array<String>){
   val a =  StringBuilder("")
    println(a.toString())
}






fun html(init: HTML.() -> Unit): HTML {
    val html = HTML()
    html.init()
    return html
}

