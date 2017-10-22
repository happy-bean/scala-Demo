package com.wgt.lesson4

/**
  * Author:wgt
  * Description:
  */
class Study2 {
  var age=0
  private [this] var name=""
  //scala中的setter,getter默认存在，分别叫做.age_= age

  //1.字段是私有的，setter getter 也是私有的
  //2.字段是val 只有getter 方法生成
  //3.如果不需要setter　getter 方法，可将字段声明为private [this]
}

object Tset{
  def main(args: Array[String]): Unit = {
    var study2=new Study2
    study2.age_=(21)
    println(study2.age)
  }
}

//重新定义setter getter
class Person{

  private var privateAge=0 //私有

  def age=privateAge
  def age_=(pram:Int){
    //..
  }
}
