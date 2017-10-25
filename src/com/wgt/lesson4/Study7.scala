package com.wgt.lesson4

/**
  * Author:wgt
  * Description:继承
  */
class Study7 {

}

class People {
  var name = ""

  def run(): Unit = {
    println("run...")
  }
}

class Student1 extends People {

  name = "peter"

  //scala 重写非抽象方法必须用override修饰符
  override def run(): Unit = {
    println(name + "run fast...")
  }
}