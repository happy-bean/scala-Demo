package com.wgt.lesson3

import scala.collection.mutable.ListBuffer

/**
  * Author:wgt
  * Description: List
  */
object Study3 {
  def main(args: Array[String]): Unit = {
    // 字符串列表
    val site: List[String] = List("Sina", "Google", "Baidu")

    // 整型列表
    val nums: List[Int] = List(1, 2, 3, 4)

    // 空列表
    val empty: List[Nothing] = List()

    // 二维列表
    val dim: List[List[Int]] =
      List(
        List(1, 0, 0),
        List(0, 1, 0),
        List(0, 0, 1)
      )

    /*  构造列表的两个基本单位是 Nil 和 ::
    Nil 也可以表示为一个空列表。
    以上实例我们可以写成如下所示：（::）符号连接顺序是从右到左*/

    // 字符串列表
    val site1 = "Sina" :: ("Google" :: ("Baidu" :: Nil))

    // 整型列表
    val nums1 = 1 :: (2 :: (3 :: (4 :: Nil)))

    // 空列表
    val empty1 = Nil

    // 二维列表
    val dim1 = (1 :: (0 :: (0 :: Nil))) ::
      (0 :: (1 :: (0 :: Nil))) ::
      (0 :: (0 :: (1 :: Nil))) :: Nil

    /*
    Scala列表有三个基本操作：
     1.head 返回列表第一个元素
     2.tail 返回一个列表，包含除了第一元素之外的其他元素：（是一个列表或者Nil）
     3.isEmpty 在列表为空时返回true
     */

    println(site.head)
    println(site.tail)
    println(site.isEmpty)
    println(nums.isEmpty)

    /*你可以使用  :::  、 List.:::()  或  List.concat()  方法来连接两个或多个列表。*/
    // 使用 ::: 运算符
    var combine = site ::: site1
    println("site1 ::: site2 : " + combine)

    // 使用 list.:::() 方法，注意：结果为site2列表元素在前，site1在后
    combine = site.:::(site1)
    println("site1.:::(site2) : " + combine)

    // 使用 concat 方法
    combine = List.concat(site, site1)
    println("List.concat(site1, site2) : " + combine)

    val site2 = List.fill(3)("Baidu") // 重复 Runoob 3次
    println( "site2 : " + site2  )

    val num2 = List.fill(10)(2)         // 重复元素 2, 10 次
    println( "num2 : " + num2  )

   /* List.tabulate() 方法是通过给定的函数来创建列表。
    方法的第一个参数为元素的数量，可以是二维的，第二个参数为指定的函数，我们通过指定的函数计算结果并返回值插入到列表中，起始值为 0，实例如下：*/
   // 通过给定的函数创建 5 个元素
   val squares = List.tabulate(6)(n => n * n)
    println( "一维 : " + squares  )

    // 创建二维列表
    val mul = List.tabulate( 4,5 )( _ * _ )
    println( "二维 : " + mul  )

    //List.reverse 用于将列表的顺序反转，实例如下：
    val site3 = "Sina" :: ("Google" :: ("Baidu" :: Nil))
    println( "反转前 : " + site3 )
    println( "反转前 : " + site3.reverse )

    /*列表缓存(ListBuffer)
        List类能够提供对列表头部，而非尾部的快速访问。如果需要向结尾添加对象，则需要先对表头前缀元素方式反向构造列表，完成之后再调用reverse。
        上述问题另一种解决方式就是使用ListBuffer，这可以避免reverse操作。ListBuffer是可变对象，它可以更高效的通过添加元素来构建列表。
        使用ListBuffer替代List另一个理由是避免栈溢出风险。*/
    val buf: ListBuffer[Int] = new ListBuffer[Int]
    //往后添加
    buf += 1
    buf += 2
    //前缀添加
    val buf2 = 3 +: buf
    println(buf2.toString())
    //ListBuffer转List
    println(buf2.toList.toString())

    //余下不在一一详解
  }
}