package com.wgt.lesson4

/**
  * Author:wgt
  * Description:枚举
  */
class Study9 {
  //scala没有枚举类型，但标准库中提供了一个Enumeration助手类，用于产出枚举
  var red = TrafficLightColor(0)

  var green = TrafficLightColor.withName("green")
}

//定义Enumeration扩展类，调用Value方法来初始化枚举中的可能值。
object TrafficLightColor extends Enumeration {
  type TrafficLightColor = Value

  val red, yellow, green = Value
}
