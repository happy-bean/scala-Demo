package com.wgt.lesson6

import scala.io.Source

/**
  * Author:wgt
  * Description:读文件
  */
object Study2 {

  def main(args: Array[String]) {
    val source = Source.fromFile("/opt/scala.txt", "UTF-8")
    //第一个参数可以是字符串或是java.io.File，第二个是编码格式

    val lineIterator = source.getLines()
    //结果是个迭代器

    for (line <- lineIterator) {
      println(line)
      //...
    }

    //对迭代器应用toArray或toBuffer方法，将这些行放到数组或数组缓冲当中
    val lines = source.getLines().toArray

    //把整个文件读取成一个字符串
    val contents = source.mkString

    //用完source后关闭
    source.close()

    //foreach方法读取
    Source.fromFile("/opt/scala.txt").foreach {
      print
    }
  }
}