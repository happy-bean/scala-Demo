package com.wgt.lesson6

import java.io.{File, PrintWriter}

/**
  * Author:wgt
  * Description:写入文件
  */
class Study7 {
  //Scala 进行文件写操作，直接用的都是 java中 的 I/O 类 （java.io.File)：
  val writer = new PrintWriter(new File("scala.txt" ))

  writer.write("scala")

  //关闭
  writer.close()
}
