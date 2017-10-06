package com.wgt.lesson2

import javax.naming.MalformedLinkException

import scala.sys.process.processInternal.{IOException, URL}

/**
  * Author:wgt
  * Description:异常
  */
class Study4 {
  //throw
  throw new IllegalStateException(" ... not ...") //throw 表达式有特殊类型 Nothing
  var x = 0
  if (x >= 0) {
    scala.math.sqrt(x)
  } else throw new InterruptedException("arg not less than 0")

  //try/catch/finally
  var url:URL=null
  try {
     url = new URL("https://www.baidu.com")
  } catch {
    case _: MalformedLinkException => println(" error1 ")
    case ex: IOException => println(" error2 ")
  } finally {
    url.finalize()
  }
  /*
  * try/catch 语句处理异常　try/finally通常是清理工作
  * */
}
