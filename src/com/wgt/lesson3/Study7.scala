package com.wgt.lesson3

/**
  * Author:wgt
  * Description: Tuple(元组)
  */
object Study7 {

  /*与列表一样，元组也是不可变的，但与列表不同的是元组可以包含不同类型的元素。
  元组的值是通过将单个的值包含在圆括号中构成的*/

  def main(args: Array[String]): Unit = {
    //元组中定义了三个元素，对应的类型分别为[Int, Double, java.lang.String]。
    val tuple1 = (1, 5.20, "Spark")
    //或者
    val tuple2 = new Tuple3(1,5.20,"Spark")
    //可以使用 tuple1._1 访问第一个元素， tuple1._2 访问第二个元素
    println(tuple1._1 + " : " + tuple1._2 + " : " + tuple1._3)

    //可以使用 Tuple.productIterator() 方法来迭代输出元组的所有元素
    tuple1.productIterator.foreach{i => println("value : " + i)}

    //使用 Tuple.toString() 方法将元组的所有元素组合成一个字符串
    println(tuple1.toString())

    //使用 Tuple.swap 方法来交换元组的元素
    //注意：swap函数只能用于两个元素元组
    val tuple3 = (1, "Spark")
    println(tuple3.swap)

    //使用模式匹配获取元组
    val t = (1, 3.14, "Fred")
    val (first, second, third) = t
    println(first + " : " + second + " : " + third)

    //拉链操作
    val num = Array(1, 2, 3)
    val str = Array("first", "second", "third")
    val com = num.zip(str).toMap
    println(com(1)+" : "+com(2)+" : "+com(3))
  }
}
