package com.wgt.lesson5

/**
  * Author:wgt
  * Description:final关键字
  */
class Study1 {

  //不能覆盖父类的final变量和方法
  final var sum = 0

  final def add(a: Int, b: Int): Unit = {
    println(sum)
  }
}


class chlidStudy1 extends Study1{

 // override var sum=1

 //override def add(a:Int,b:Int): Unit ={}
}