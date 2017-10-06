package com.wgt.lesson2

import scala.math._
// import scala.math._等同与　import math._


/**
  * Author:wgt
  * Description:调用方法，函数
  *
  * Scala 有函数和方法，二者在语义上的区别很小。Scala 方法是类的一部分，而函数是一个对象可以赋值给一个变量。换句话来说在类中定义的函数即是方法。
  * 我们可以在任何地方定义函数，甚至可以在函数内定义函数（内嵌函数）。更重要的一点是 Scala 函数名可以有以下特殊字符：+, ++, ~, &,-, -- , \, /, : 等。
  */
object Study1 {
  def main(args: Array[String]): Unit = {
    /*
     * 使用数学函数时不需要使用某个类调用它的静态方法
     * */
    sqrt(2)
    pow(2, 4)
    min(2, 4)
    max(2, 4)

    /*
    * scala沒有静态方法或静态字段，可以用object这个语法结构来达到同样的目的，对象定义了某个类的单个实例，包含了你想要的特性。
    * */

    //当你在应用程序中需要一个新的唯一账号时，调用Account.newUniqueNumber()即可。
    Accounts.newUniqueNumber
    //不带参数的scala方法通常不使用圆括号，也就是没有参数且不改变当前对象的方法不带圆括号

    //apply方法
    println("hello"(4))
    //原理是调用了apply方法　def apply(n:Int):Char
    BigInt("123456789")
    //原理是调用的如下方法，这种方法不需要使用new
    BigInt.apply("123456789")
    /*
    * 像这样使用伴生对象的apply方法是scala构建对象的常用方法
    * 例如：Array(1,2,3,4,5,6)返回一个数组，用的就是Array伴生对象的apply方法
    * */
    var array=Array(1,2,3,4,5,6)
    println(array(0))//注意：scala中数组下标使用()，区别于java的[]
  }
}

object Accounts{

  private var lastNumber = 0

  def newUniqueNumber()={lastNumber+=1;lastNumber}


}