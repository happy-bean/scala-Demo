package com.wgt.lesson6

/**
  * Author:wgt
  * Description:模式匹配
  */
class Study1 {
  /*
  * 一个模式匹配包含一系列备选项，每个都开始与关键字case，每个备选项都包含了一个一个模式及一到多个表达式，箭头符号=>隔开了模式和表达式
  * */
}
object Test {
  def main(args: Array[String]) {
    println(matchTest(3))

  }
  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }
}

object Test1 {
  def main(args: Array[String]) {
    println(matchTest("two"))
    println(matchTest("test"))
    println(matchTest(1))
    println(matchTest(6))
  }

  def matchTest(x: Any): Any = x match {
    case 1 => "one"
    case "two" => 2
    case y: Int => "scala.Int"
    case _ => "many"
  }
}