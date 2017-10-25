package com.wgt.lesson4

/**
  * Author:wgt
  * Description:特征
  */
class Study8 {


  //scala Trait(特征)，相当于java中的接口(更像抽象类),与接口不同的是，它可以定义属性和方法的实现

  //单继承父类，特征可以继承多个
}

/*
特征也可以有构造器，由字段的初始化和其他特征体中的语句构成。这些语句在任何混入该特征的对象在构造是都会被执行。

  构造器的执行顺序：

  调用超类的构造器；
  特征构造器在超类构造器之后、类构造器之前执行；
  特征由左到右被构造；
  每个特征当中，父特征先被构造；
  如果多个特征共有一个父特征，父特征不会被重复构造
  所有特征被构造完毕，子类被构造。
*/

trait Equal {
  def isEqual(x: Any): Boolean
  def isNotEqual(x: Any): Boolean = !isEqual(x)
}

class Point(xc: Int, yc: Int) extends Equal {
  var x: Int = xc
  var y: Int = yc
  def isEqual(obj: Any) =
    obj.isInstanceOf[Point] &&
      obj.asInstanceOf[Point].x == x
}