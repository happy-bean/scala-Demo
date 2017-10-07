package com.wgt.lesson3

/**
  * Author:wgt
  * Description: Set
  */
object Study5 {
  def main(args: Array[String]): Unit = {

    /* Scala Set(集)是没有重复的对象集合，所有的元素都是唯一的。
       Scala 集合分为可变的和不可变的集合。
       默认情况下，Scala 使用的是不可变集合，如果想使用可变集合，需引用 scala.collection.mutable.Set 包。
       默认引用 scala.collection.immutable.Set。*/
    /*不可变集合*/
    val set = Set(1, 2, 3)
    println(set.getClass.getName) //

    println(set.exists(_ % 2 == 0)) //true
    println(set.drop(1)) //Set(2,3)

    /*可变集合*/
    import scala.collection.mutable.Set // 可以在任何地方引入 可变集合
    val mutableSet = Set(1, 2, 3)
    println(mutableSet.getClass.getName) // scala.collection.mutable.HashSet
    //往集合内添加元素4
    mutableSet.add(4)
    //删除值为1的元素
    mutableSet.remove(1)
    //添加元素5
    mutableSet += 5
    //删除值为3的元素
    mutableSet -= 3

    println(mutableSet) // Set(5, 3, 4)

    val another = mutableSet.toSet
    println(another.getClass.getName) // scala.collection.immutable.Set

    /*Scala Set集合有三个基本操作：
      1.head 返回集合第一个元素
      2.tail 返回一个集合，包含除了第一元素之外的其他元素
      3.isEmpty 在集合为空时返回true*/
    val site = Set("Sina", "Google", "Baidu")
    val nums: Set[Int] = Set()

    println("head : " + site.head)
    println("tail : " + site.tail)
    println("isEmpty : " + site.isEmpty)
    println("isEmpty : " + nums.isEmpty)

    //你可以使用 ++ 运算符或 Set.++() 方法来连接两个集合。如果元素有重复的就会移除重复的元素
    val site1 = Set("Sina", "Google", "Baidu")
    val site2 = Set("Faceboook", "Taobao")

    // ++ 作为运算符使用
    var site3 = site1 ++ site2
    println( "site1 ++ site2 : " + site3 )

    //  ++ 作为方法使用
    site3 = site1.++(site2)
    println( "site1.++(site2) : " + site3 )

    //可以使用 Set.min 方法来查找集合中的最小元素，使用 Set.max 方法查找集合中的最大元素
    val num = Set(5,6,9,20,30,45)

    // 查找集合中最大与最小元素
    println( "Set(5,6,9,20,30,45)  最小元素是 : " + num.min )
    println( "Set(5,6,9,20,30,45)  最大元素是 : " + num.max )

    //你可以使用 Set.& 方法或 Set.intersect 方法来查看两个集合的交集元素
    val num1 = Set(5,6,9,20,30,45)
    val num2 = Set(50,60,9,20,35,55)

    // 交集
    println( "num1.&(num2) : " + num1.&(num2) )
    println( "num1.intersect(num2) : " + num1.intersect(num2) )

    //余下不在一一详解
  }
}
