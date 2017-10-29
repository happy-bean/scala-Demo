package com.wgt.lesson5

/**
  * Author:wgt
  * Description:重命名和隐藏方法
  */
class Study4 {
  //如果想要引入包中的几个成员，可以使用选取器slector
  import java.awt.{Color, Font}

  //选取器语法还允许重命名选到的成员
  import java.util.{HashMap => JavaHashMap}//JavaHashMap相当于HashMap

  var hashMap = new JavaHashMap[Int, Int]()
  hashMap.put(1,1)

  //选取器HashMap=>_　将隐藏某个成员而不是重命名它
  import java.util.{HashMap=>_,_}
  //HashMap指向scala scala.collection.mutable.HashMap 因为java.util.HashMap被隐藏了

}
