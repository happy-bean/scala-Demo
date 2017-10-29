package com.wgt.lesson4

/**
  * Author:wgt
  * Description:重载,重写
  */
class Study10 {
  def add(a: Int, b: Int): Unit = {
    var sum = a + b;
  }

  //重载
  def add(a:Int,b:Int,c:Int): Unit ={
    var sum=a+b+c;
  }
}

class ChlidStudy10 extends Study10{

  //重写
  override def add(a: Int, b: Int): Unit = {
    val sum=a*a+b*b;
  }
}
