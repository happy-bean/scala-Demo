package com.wgt.lesson1

/**
  * Author:wgt
  * Description:类型转换
  */
object Study3 {
  //Scala 与 Java有着相同的数据类型

  var number = 99.99
  var string1 = "99"
  var string2 = "99.99"

  def main(args: Array[String]): Unit = {
    println(number.toInt)
    println(number.toChar)
    println(number.toDouble)
    println(number.toString)

    println(string1.toInt)
    println(string2.toDouble)
  }
}
