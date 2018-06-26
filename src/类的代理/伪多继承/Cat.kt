package 类的代理.伪多继承

/**
 * Created by fangmaster on 2018/4/16.
 */
class Cat(animal:Animal,food: Food) :Animal by  animal,Food by food{}