package com.wgt.lesson5

import java.awt.Color
import java.awt._  //引入某个包全部成员
import java.awt.Color._  //引入类或对象的所有成员
/**
  * Author:wgt
  * Description:引入
  */
class Study3 {

  //引入语句可以使用更短的名称而不是原来较长的名称
  var cd=RED
  var cr=decode("#ff0000")

  //任何地方都可以声明引入，不仅限于文件顶部
  import scala.collection.mutable._
  var subscriber=new ArrayBuffer[Study3]()
}
