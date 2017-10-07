package com.wgt.lesson3

/**
  * Author:wgt
  * Description: Map
  */
object Study6 {
  /* Map(映射)是一种可迭代的键值对（key/value）结构。
     所有的值都可以通过键来获取。
     Map 中的键都是唯一的。
     Map 也叫哈希表（Hash tables）。
     Map 有两种类型，可变与不可变，区别在于可变对象可以修改它，而不可变对象不可以。
     默认情况下 Scala 使用不可变 Map。如果你需要使用可变集合，你需要显式的引入 import scala.collection.mutable.Map 类
     在 Scala 中 你可以同时使用可变与不可变 Map，不可变的直接使用 Map，可变的使用 mutable.Map。*/
  def main(args: Array[String]): Unit = {
    /*不可变 Map*/
    // 空哈希表，键为字符串，值为整型
    var A: Map[Char, Int] = Map()

    // Map 键值对演示
    val lang1 = Map("Java" -> "Oracle", "C#" -> "Microsoft")
    //或者
    val lang2 = Map(("Java", "Oracle"), ("C#", "Microsoft"))
    //如果需要添加 key-value 对，可以使用 + 号
    A += ('t' -> 10)

    //Scala Map 几种基本操作：keys、values、isEmpty、赋值（可变映射）
    val lang = Map("Java" -> "Oracle",
      "C#" -> "Microsoft",
      "Swift" -> "Apple")
    //Values:
    val nums: Map[Int, Int] = Map()
    println("lang 中的键为 : " + lang.keys)
    println("lang 中的值为 : " + lang.values)

    println("lang 是否为空 : " + lang.isEmpty)
    println("nums 是否为空 : " + nums.isEmpty)

    var lang3 = scala.collection.mutable.Map("Java" -> "Oracle", "C#" -> "Microsoft")
    lang3("Java") = "sun"
    println(lang3)

    //可以使用 ++ 运算符或 Map.++() 方法来连接两个 Map，Map 合并时会移除重复的 key。
    val lang4 = Map("Java" -> "Oracle",
      "C#" -> "Microsoft",
      "Swift" -> "Apple")
    val color = Map("blue" -> "#0033FF",
      "yellow" -> "#FFFF00",
      "red" -> "#FF0000")

    //  ++ 作为运算符
    var colors = lang4 ++ color
    println("lang ++ colors : " + colors)

    //  ++ 作为方法
    colors = lang4.++(colors)
    println("lang.++(colors)) : " + colors)

    //以下通过 foreach 循环输出 Map 中的 keys 和 values：
    val lang5 = Map("Java" -> "Oracle",
      "C#" -> "Microsoft",
      "Swift" -> "Apple")

    lang5.keys.foreach { i =>
      print("Key = " + i)
      println("\tValue = " + lang5(i))
    }

    //可以使用 Map.contains 方法来查看 Map 中是否存在指定的 Key
    val lang6 = Map("Java" -> "Oracle",
      "C#" -> "Microsoft",
      "Swift" -> "Apple")

    if (lang6.contains("Swift")) {
      println(lang6("Swift") + "创造了 Swift 语言")
    }

    //迭代映射
    for ((k, v) <- lang) {
      println(k + "  :  " + v)
    }
    //映射中K，V反转
    val lang7 = for ((k, v) <- lang) yield (v, k)
    for ((k, v) <- lang7) {
      println(k + " : " + v)
    }

    //已排序映射
    //按照key的字典顺序排序。
    val scores = scala.collection.immutable.SortedMap(("Bob", 8), ("Alice", 21), ("Fred", 17), ("Cindy", 15))
    scores.foreach(person => println(person._1 + " : " + person._2))
  }
}
