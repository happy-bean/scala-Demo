package com.wgt.lesson3

/**
  * Author:wgt
  * Description: Iterator（迭代器）
  */
object Study8 {
  def main(args: Array[String]): Unit = {

  /*Scala Iterator（迭代器）不是一个集合，它是一种用于访问集合的方法。
    迭代器 it 的两个基本操作是 next 和 hasNext。
    调用 it.next() 会返回迭代器的下一个元素，并且更新迭代器的状态。
    调用 it.hasNext() 用于检测集合中是否还有元素。*/

    //让迭代器 it 逐个返回所有元素最简单的方法是使用 while 循环：
    val it = Iterator("Baidu", "Google", "Runoob", "Taobao")
    while (it.hasNext){
      println(it.next())
    }

    //使用 it.min 和 it.max 方法从迭代器中查找最大与最小元素
    val ita = Iterator(20,40,2,50,69, 90)
    val itb = Iterator(20,40,2,50,69, 90)

    println("最大元素是：" + ita.max )
    println("最小元素是：" + itb.min )

    //使用 it.size 或 it.length 方法来查看迭代器中的元素个数
    println("ita.size 的值: " + ita.size )
    println("itb.length 的值: " + itb.length )

    //余下不在一一详解
  }
}
