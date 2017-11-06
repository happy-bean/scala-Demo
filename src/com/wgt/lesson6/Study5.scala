package com.wgt.lesson6

import scala.io.Source

/**
  * Author:wgt
  * Description:从url或其他资源读取
  */
object Study5 {
  def main(args: Array[String]): Unit = {
    val source1=Source.fromURL("www.baidu.com","UTF-8")
    //从url读取时要事先知道字符集
    val source2=Source.fromString("hello word!")

    val source3=Source.stdin
  }
}
