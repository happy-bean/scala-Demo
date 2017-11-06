package com.wgt.lesson6

import scala.io.Source

/**
  * Author:wgt
  * Description:读取字符
  */
class Study3 {
  //要从文件中读取单个字符，你可以直接把source对象当做迭代器，因为source类扩展自Iterator[char]
  val source=Source.fromFile("/opt/scala.txt","UTF-8")

  for(ch<-source){
    //...
  }

  //如果想查看某个字符，但不处理，调用source对象的buffered方法，这样就可以用head方法查看下一个字符
  val iter=source.buffered
  while (iter.hasNext){
    //自定义条件
    if(iter.head==1){
      //...
    }
  }
  source.close()
}
