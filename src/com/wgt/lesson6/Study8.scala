package com.wgt.lesson6


/**
  * Author:wgt
  * Description:序列化
  */
class Study8 {
  //在java中，我们用序列化来传输到其他虚拟机或临时存储
}

@SerialVersionUID(42L) class Test extends Serializable{
  val fred=new Test

  import java.io._
  val out=new ObjectOutputStream(new FileOutputStream("scala.txt"))
  out.close()

  val in=new ObjectInputStream(new FileInputStream("scala.txt"))
  val saveFred= in.readObject().asInstanceOf[Test]
}
