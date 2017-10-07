package com.wgt.lesson2

import java.io.IOException
import java.net.URL
import javax.naming.MalformedLinkException


/**
  * Author:wgt
  * Description:异常
  */
class Study4 {
    //throw Scala 抛出异常的方法和 Java一样，使用 throw 方法
    throw new IllegalStateException(" ... not ...") //throw 表达式有特殊类型 Nothing

    var x = 0
    if (x >= 0) {
      scala.math.sqrt(x)
    } else throw new InterruptedException("arg not less than 0")

    /*
    异常捕捉的机制与其他语言中一样，如果有异常发生，catch字句是按次序捕捉的。因此，在catch字句中，越具体的异常越要靠前，越普遍的异常越靠后。 如果抛出的异常不在catch字句中，该异常则无法处理，会被升级到调用者处。
    捕捉异常的catch子句，语法与其他语言中不太一样。在Scala里，借用了模式匹配的思想来做异常的匹配，因此，在catch的代码里，是一系列case字句
    */

    //try/catch/finally
    var url: URL = null
    try {
      url = new URL("https://www.baidu.com")
    } catch {
      case _: MalformedLinkException => println(" error1 ")
      case ex: IOException => println(" error2 ")
    } finally {
      //...
    }
  /*try/catch 语句处理异常　try/finally通常是清理工作*/
}