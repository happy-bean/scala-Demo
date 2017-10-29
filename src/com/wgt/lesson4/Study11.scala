package com.wgt.lesson4

/**
  * Author:wgt
  * Description:this关键字
  */
class Study11 {

  //用于调用实例变量和主构造函数

  var id: Int = 0

  var name: String = ""

  def this(id: Int, name: String) {
    this()
    this.id = id
    this.name = name
  }
}
