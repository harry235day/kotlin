/**
 * Created by fangmaster on 2018/4/16.
 */
fun main(args:Array<String>){
    var quity = 5
    var price = 20.3
    var name  = "小米"

    println("单价:$price")
    println("数量:$quity")
    println("产品:$name 总价:${quity*price}")

    var x = 2
    var y = 10
    for(i in x until y){
        print(i)
    }
    if(x in 1..y){  // (x in i util y) [2,10) 不包括10
//        println("OK")
    }
    //定义数据
    var array = arrayOf(1,2,3,4,5,6,7,8,9)
    //遍历数组或者集合
    for (i in array){
        print(i)
    }

    if(x !in 0..array.lastIndex){
        println("NO")
    }else{
        println("oK")
    }
    //打印1-5
    for(i in 1..5){
        print(i)
    }

    //定义集合
    var names = arrayListOf(1,2,3,4,5,6,7,8)
    //判断 x 是否在names 中
    if(x in names){
        println("在")
    }
    case("hello");
    case("");
    println()
    //空指针
    var helloA = "Hello"
    var helloB:String? = null
    var l :Int = helloA?.length ?:0;
    var l1 :Int = helloB?.length ?:0;
    println(l)
    println(l1)

}

//when表达式 java 中的swtich
fun case(obj:Any){
    when(obj){
        1          -> print("int 1 ")
        "hello"    -> print("String hello ")
        is Long    -> print("Long ")
        !is String -> print("不是一个string ")
        else       -> print("default 语句 ")
    }
}

