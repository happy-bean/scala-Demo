package com.wgt.lesson3

import scala.collection.immutable.Queue

/**
  * Author:wgt
  * Description: 队列和栈
  */
object Study4 {
  def main(args: Array[String]): Unit = {
    /*如果你需要先进先出序列，你可以使用Queue(队列)。Scala集合提供了可变和不可变的Queue*/
    /*不可变Queue*/
    //使用伴生对象创建一个queue
    val que = Queue[Int]()

    //使用enqueue为不可变队列添加元素
    val que1 = que.enqueue(1)

    //往队列添加多个元素，把集合作为enqueue的参数
    val que2 = que1.enqueue(List(2, 3, 4, 5))

    //从队列头部移除元素，使用dequeue
    //第一个参数为头部移除的元素，第二个参数为剩下的队列
    val (elem1, que3) = que2.dequeue

    //打印移除的元素
    println(elem1)

    //打印剩下的队列
    println(que3)

    /*可变Queue*/
    //使用伴生对象创建一个可变queue
    var que4 = scala.collection.mutable.Queue[String]()

    //使用 += 符号添加单个元素
    que4 += "A"

    //使用 ++= 符号添加多个元素
    que4 ++= List("B","C","D")

    //使用dequeue移除头部元素
    val a = que4.dequeue

    //打印移除的元素
    println(a)

    //打印队列中剩下的元素
    print(que4)

    /*如果需要的是后进先出，你可以使用Stack，它同样在Scala的集合中有可变和不可变版本。元素的推入使用push，弹出用pop，只获取栈顶元素而不移除可以使用top。*/
    /*可变栈*/
    //使用Stack类的伴生对象创建Stack对象
    var stack = scala.collection.mutable.Stack[Int]()

    //往栈stack中压如元素
    stack.push(1)
    stack.push(2)
    stack.push(3)

    //打印查看栈内元素
    println(stack)

    //获取栈顶元素的值
    val tval = stack.top
    println("栈顶元素为 : " + tval)

    //移除栈顶元素
    val pval = stack.pop()
    println("移除的栈顶元素为 : " + pval)

    //打印移除栈顶元素后，剩下的栈内元素
    println(stack)

    //余下不在一一详解
  }
}