package com.wgt.lesson4

/**
  * Author:wgt
  * Description:伴生对象
  */
class Study6(val color: String) {


  println("创建" + this)

  override def toString(): String = "颜色标记：" + color

  //伴生对象，与类共享名字，类可以访问其私有属性和方法
  Study6.privatePram = 1

  Study6.privateMethod
  //类的伴生对象可以被访问，但并不在作用域内，还是需要 类.属性（函数）调用
}

//伴生对象
object Study6 {
  private var privatePram = 0

  private def privateMethod: Int = {
    privatePram
  }

  private val markers: Map[String, Study6] = Map(
    "red" -> new Study6("red"),
    "blue" -> new Study6("blue"),
    "green" -> new Study6("green")
  )

  def apply(color: String) = {
    if (markers.contains(color)) markers(color) else null
  }


  def getMarker(color: String) = {
    if (markers.contains(color)) markers(color) else null
  }

  def main(args: Array[String]) {
    println(Study6("red"))
    // 单例函数调用，省略了.(点)符号
    println(Study6 getMarker "blue")
  }
}