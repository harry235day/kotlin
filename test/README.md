
	:
kotlin:
	变量
	数组
	when 
	:: (把一个方法当做一个参数，传递到另一个方法中进行使用)
	循环(for)
	集合
	集合泛型
	函数
	高阶函数
	static函数
	lambda表达式
	model数据类
	类的代理
	类的半生对象
	单例（半生对象）
	类的扩展（实现和继承  伪继承）
	协程
	
	
	
	变量 
		定义初始变量为空的话 必须类型后加 ? 说明有空指针的可能
		var abc:String? = null
		var ab :Int?    = null
		
	
			fun main(args:Array<String>){
				val a: Int = 1  // 立即初始化
				val b	   = 2  // 自动推导出Int型
				val c: Int  	// 当没有初始化值时必须声明类型
				c          = 3  // 赋值
				
				println("a = $a, b = $b, c = $c")
			}
		
		
		//  Java 中是一样的，在范围是 [-128, 127]
				val a :Int = 10000
				val b :Int? = a
				val c :Int? = a
				
				println(b == c)  true == 值
				println(b === c) false     ===地址值 
				
				如果 a = [-128,127]
				bc 就不会重新创建对象
				b ===c  true
	
		字符串
			val txt ="   abc def "
			println(txt)
			println(txt.trimStart())
			println(txt.trimEnd())
			println(txt.trim())
		
		字符串模板
			使用 $ 取值
				val name:String? = "xxx"
				println("$.name")
			可以在模板里运算
				println("${1+2}...")
			如果想打印 "$99.9"
				println("${'$'}99.9")	

	
	数组
		
			val l = Array(3,{x -> x+1}) 1,2,3
			val l = arrayOf(1,2,3)
	
	when
		与 java 中的 swtich 一样
		
			when(i){
				1    -> s = "一"
				2    -> s = "二"
				is String -> s = "是个字符串" 
				in 1..5 -> s = "在1-5之间"
				!in 1..5 -> s = "不在1-5之间"
				1,2,3 -> i==1或 i==2 满足一个 true
				else -> s = "haha"
			}
			
	::
		: 表示把一个方法当做一个参数，传递到另一个方法中进行使用，通俗的来讲就是引用一个方法
		fun main(any: Array<String>){
			print(p("hello ",::say)) hello  say
		}


		fun p(string: String,say:(s:String)->String):String{
		   return say(string)
		}

		 fun say(string: String):String{
			return string+" say"
		}
	
	
	循环
		downTo 倒叙 step 步数
		for (i in 4 downTo 1 step 4) print(i)  4	
		for (i in 4 downTo 1 step 1) print(i)  4321	
		for (i in 4 downTo 1 step 2) print(i)  42	
		//遍历索引 
		val l = arrayListOf(1,2,3,4,"hello")
		for(i in l.indices){
			println("index: $i --- ${l[i]}")
		}
	
	
	集合
		List
		
			val l = listOf(1,2,3,4)
			val l = setOf(1,2)
			//正序遍历
			for(x in l){print(x)}  1,2
			
			//倒叙遍历
			for(x in l.size downTo 0){print(x)} 2,1
			
			//forEach it 表示 集合里的元素
			l.forEach{print(it)}
			
			//区间 全部包含
			for(x in 1..5){print(x)}  1,2,3,4,5 
			
		Map
			
			val map = mapOf<Any?,Any?>(
				"a"  to  "1",
				"a"  to  1,
				1    to  "a",
				1    to  1,
				null to  null
			)
			
			key == a  value == b 
			for((a,b) in map1){
				println("$a=$b")
			}
			
			for(x in map1.keys){
				println(x)
			}
			for(x in map1.values){
				println("v:$x ")
			}
		
		
		
	
	协程
	//Android 工程使用
	implementation "org.jetbrains.kotlinx:kotlinx-coroutines-android:x.x.x"  
	//Java 工程使用
	implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core:x.x.x'
	
	用户态线程：自己代码手动去管理线程的调度 （不可剥夺）
	
	协程：让进程调度自己
	
	如果一个用户线程发生堵塞，导致进程阻塞，就可以将 用户态线程 的控制权交给 进程自己调度  这就是协程的用途
	
	切没有用到 ，请自行百度学习 只做简单介绍
	launch() async()
	
	launch() ：
		1.接收三个参数
			※1.上下文  .传递数据 ..用于表明协程运行与恢复时的上下文环境.
			fun launch(
				contest:ConoutineContext,
				start: CoroutineStart = CoroutineStart.DEFAULT,
				block: suspend CoroutineScope.() -> Unit
			):la {
			}
		
		2.在Android 中传递一个
				UI          UI线程启动协程
				CommonPool	异步启动协程
				Unconfined  不指定，在哪个线程调用就在哪个线程恢复
				
		fun launch():l
			l.start() 开始
			l.join()  切到当前线程
			l.cancel() 取消
			
			start() 
				val la = launch(UI,CoroutineStart.LAZY)
				CoroutineStart.LAZY 启动 必须使用 start()才会启动
 			
			join() 只能在协程内部使用 是一个suspend方法  suspend修饰的方法和闭包只能被suspend修饰的方法和闭包调用
			
			
	async()：
		返回一个   launch()返回对象的子类
		
		await() 可以返回 当前对象的执行结果
		
			举个栗子：
				val d1 = async(CommonPool){
					"我是异步线程的数据"
				}
				
				val d  = async(UI){
					println("UI线程的数据")
					println(d1.await()
				}
	
	
	
	
	
	