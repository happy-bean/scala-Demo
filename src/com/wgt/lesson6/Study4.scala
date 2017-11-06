package com.wgt.lesson6

/**
  * Author:wgt
  * Description:从控制台上读取
  */
object Study4 {
  def main(args: Array[String]): Unit = {

    println("请输入...")

    val line=Console.readLine() //readDouble() readInt() ...
    //或　val line=readLine()

    println(line)

  }
}