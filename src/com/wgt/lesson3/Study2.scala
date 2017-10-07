package com.wgt.lesson3

/**
  * Author:wgt
  * Description:集合
  */
class Study2 {
  /*
   Scala 集合分为可变的和不可变的集合。可变集合可以在适当的地方被更新或扩展。这意味着你可以修改，添加，移除一个集合的元素。
   Scala 使用的是不可变集合，如果想使用可变集合，需引用 scala.collection.mutable 包
   */

  /*不可变映射*/
  // 定义整型 List
  var a = List(1, 2, 3, 4)

  // 定义 Set
  var b = Set(1, 3, 5, 7)
  // 定义 Map
  var c = Map("one" -> 1, "two" -> 2, "three" -> 3)
  // 创建两个不同类型元素的元组
  var d = (10, "Runoob")
  // 定义 Option
  var e: Option[Int] = Some(5)

  /*可变映射*/
  var f = scala.collection.mutable.Map("china" -> 1)

  //虽然可变集合和不可变集合都有添加或删除元素的操作，但是有一个非常大的差别。对不可变集合进行操作，会产生一个新的集合，原来的集合并没有改变
}
