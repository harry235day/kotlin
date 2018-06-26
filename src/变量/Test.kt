package 变量

/**
 * Created by fangmaster on 2018/4/18.
 */
fun main(args:Array<String>){
//    val a: Int = 1  // 立即初始化
//    val b = 2   // 自动推导出Int型
//    val c: Int  // 当没有初始化值时必须声明类型
//    c = 3       // 赋值
//    println("a = $a, b = $b, c = $c")


   /* var a = 1
    // 使用变量名作为模板:
    val s1 = "a is $a"
    println(s1)
    val r = s1.replace("is", "was")
    println(r)
    a = 2
//    println("$a")
    // 使用表达式作为模板:
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)*/

/*
    //  Java 中是一样的，在范围是 [-128, 127]
    val a :Int = 10000
    val b :Int? = a
    val c :Int? = a

    println(b == c)  == 值
    println(b === c) ===地址值
*/

   /* val b = Array(3, { i -> (i * 2) })
    val c = Array(3,{i -> i})
    for(x in b){
        print(x)
    }
    for(x in c){
        print(x)
    }*/

    /*val text1 = """多行字符串 多行字符串
    """
    println(text1)   // 输出有一些前置空格

    val text = """
    |多行字符串
    |菜鸟教程
    |多行字符串
    |Runoob
    """.trimMargin()
    println(text)    // 前置空格删除了*/

    println("${'$'}999")

//    val txt =""" abc def """
   /* val txt ="   abc def "
    println(txt)
    println(txt.trimStart())
    println(txt.trimEnd())
    println(txt.trim())*/

    println(1L + 3)


    var abc:String? = null
    var ab :Int? = null
}