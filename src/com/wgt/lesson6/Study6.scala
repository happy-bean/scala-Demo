package com.wgt.lesson6

import java.io.{File, FileInputStream}

/**
  * Author:wgt
  * Description:读取二进制文件
  */
class Study6 {
  //scala并没有提供读取二进制文件的方法

  val fileName = "scala.txt"

  val file = new File(fileName)

  val in = new FileInputStream(file)

  val bytes = new Array[Byte](file.length().toInt)

  in.read(bytes)
  in.close()
}
