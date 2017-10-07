package com.wgt.lesson3

import scala.collection.mutable.ArrayBuffer

/**
  * Author:wgt
  * Description:数组
  */
object Study1 {
  def main(args: Array[String]): Unit = {
    //定长数组
    val nums = new Array[Int](10) //10个整数的数组，所有元组初始化值为0
    val strs = new Array[String](10) //所有元组初始化值为null
    val strs1 = Array("hello", "world") //长度为2，这种不需要new
    nums(0) = 100 //赋值，注意使用()而不是[]

    //变长数组
    var array1 = ArrayBuffer[Int]()
    array1 += 1 //使用+=向尾部添加元素
    array1 += (2, 3, 4, 5) //添加多个元素
    array1 ++= ArrayBuffer(6, 7, 8, 9) //使用++=追加集合
    array1.trimEnd(5) //移除后五个元素
    array1.insert(2, 6) //在下标2之前插入元素6
    array1.insert(2, 7, 8, 9) //在下标2之前插入任意多个元素
    array1.remove(2) //移除下标为2的元素
    array1.remove(2, 3) //移除下标为2后的3个元素
    //此处不在一一列举

    //遍历数组
    //输出所有数组元素
    for (x <- array1) {
      println(x)
    }

    //多维数组
    var matrix = Array.ofDim[Int](8, 8)
    matrix(0)(0) = 1

    for (i <- 0 to 7) {
      for (j <- 0 to 7) {
        print(" " + matrix(i)(j))
      }
      println()
    }

    //数组转换
    var array2 = for (elem <- array1) yield 2 * elem //对array1数组的每个元素翻倍赋值给array2

    //常用算法
    array2.sum //求和

    array2.max //最大值

    array2 = array2.sorted //使用sorted方法对数组或数组缓冲进行升序排序，这个过程不会修改原始数组

    array2 = array2.sortWith(_ > _) //降序排列

    scala.util.Sorting.quickSort(nums) //直接对 nums　排序 改变数组元素原有的顺序，不支持buffer缓冲

    array2.mkString(" and ") //显示时　1 and 2 and 3 ...

    array2.mkString("< ", " , ", " > ") //显示　< 1,2,3...>
  }
}