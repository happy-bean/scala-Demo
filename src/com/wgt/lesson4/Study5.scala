package com.wgt.lesson4

/**
  * Author:wgt
  * Description:单例对象
  */
class Study5 {
  //scala没有静态方法或静态字段，可用object 这个语法构造单例对象
  //Scala 中使用单例模式时，除了定义的类之外，还要定义一个同名的 object 对象，它和类的区别是，object对象不能带参数。

  /*
  * d对象的构造器在对象第一次被调用时调用，在本例中　Study5　的构造器在Study5.newUniqueNumber()的首次使用时执行，如果一个对象从未使用,
  * 那么构造器也不会执行
  *
  * scala单例模式：
  *   1.作为存放工具函数或常亮的地方
  *   2.高效的共享某个不可变实例
  *   3.需要单个实例来协调某个服务时
  * */
}

object Study5{
  private var lastNumber=0
  def newUniqueNumber()={
    lastNumber+=1
    lastNumber
  }
}

class Test{
  Study5.newUniqueNumber()
}