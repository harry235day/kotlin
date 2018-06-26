package 类的半生对象

/**
 * Created by fangmaster on 2018/4/16.
 */


class Util{
    // companion 为util的半生对象
    companion object{
        fun isEmpty(str: String?=null):Boolean{
            return "".equals(str)||null==str
        }
    }

}