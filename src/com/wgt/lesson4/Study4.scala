package com.wgt.lesson4

/**
  * Author:wgt
  * Description:嵌套类(内部类)
  */
class Study4 {
  val chatter = new NetWork("out1")
  val myFace = new NetWork("out2")

  val mem1 = new chatter.Member("inner1")
  val mem2 = new myFace.Member("inner2")

  // chatter.Member 和　myFace.Member是两个不同的类

  //可理解为构造一个新的内部对象
}

//在嵌套类中可以通过外部类.this方式访问外部类的this引用

class NetWork(val name: String) {

  class Member(val name: String) {
    def descrption ="Outer name :" + NetWork.this.name + ",Inner Name :" + name
  }

}

object NetWork{

  def main(args: Array[String]): Unit = {
    val chatter = new NetWork("out")
    val myFace=new chatter.Member("inner")
    println(myFace.descrption)
  }
}
