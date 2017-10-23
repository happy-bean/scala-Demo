package com.wgt.lesson4

import java.io.FileReader
import java.util.Properties

import scala.reflect.io.File

/**
  * Author:wgt
  * Description:辅助构造器
  */
/*
* 1.辅助构造器的名称为this
* 2.辅助构造器都必须以一个对先前已定义的其他辅助构造器或主构造器的调用开始
* */
class Study3 {
  private var name = ""
  private var age = 0

  def this(name: String) {
    this() //调用主构造器
    this.name = name
  }

  def this(name: String, age: Int) {
    this(name)
    this.age = age
  }

  val test1 = new Study3()
  val tset2 = new Study3("scala")
  val test3 = new Study3("scala", 10)
}

//主构造器：scala中每个类都有主构造器，不是以this方法定义的，而是与类定义交织在一起
class Person1(val name:String,val age:Int){
  //...
}

//主构造器会执行类中定义的所有语句
class MyPro{
  private val props=new Properties

  props.load(new FileReader("/test"))

  //.....
  //上述语句属于主构造器的一部分
}

//如果类名无参数，则该类具备一个无参数的主构造器

//将主构造器定义为私有

class Student private(val name:Int){
  //...
  //此时必须通过辅助构造器声明对象
}
