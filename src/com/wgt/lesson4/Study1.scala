package com.wgt.lesson4

/**
  * Author:wgt
  * Description: 类
  */

//Scala中的类不声明为public，一个Scala源文件中可以有多个类
class Study1(xc: Int, yc: Int) {
  var x: Int = xc
  var y: Int = yc

  val study1 = new Study1(1, 2) //构造对象
  study1.move(2, 2) //调用方法，无参的方法可不写()

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
    println("x 的坐标点: " + x)
    println("y 的坐标点: " + y)
  }
}
