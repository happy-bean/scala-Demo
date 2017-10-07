package com.wgt.lesson2

/**
  * Author:wgt
  * Description:函数
  */
object Study3 {
  def main(args: Array[String]): Unit = {
    /*
  * 结构：函数名称，参数和函数体
  * */
    def test(number: Int) = if (number == 0) 1 else 0

    /*
  * 需要給出參數的类型，只要函数不是递归，就不需要指定返回类型，可通过=推断出返回类型
  * */
    def fouc(n: Int): Int = if (n <= 0) 1 else n * fouc(n - 1)

    //也可以使用默认参数
    def decorate(str: String, left: String = "[", right: String = "]") = left + str + right

    var str = decorate(" hello ")
    str = decorate("hello", "<<", ">>")
    //也可以指定参数赋值使用
    str = decorate(str = "hello", left = "(", right = ")")
    //混合使用
    str = decorate("hello", left = "(", right = ")")

    //变长参数
    def sum(args: Int*) = {
      var result = 0
      for (arg <- args) result += arg
      result
    }

    var sum1 = sum(1, 2, 3, 4, 5)
    //sum1=sum(1 to 5) 错误，但可写作如下形式
    sum1 = sum(1 to 5: _*) //将1 to 5当做参数处理，用:_*将它转换成参数序列

    //对于不包含返回值的函数表示法：函数体在花括号内，前面没有=，返回值就是Unit，这种函数叫做过程
    def box(str: String) {
      println("hello")
    }

    def box1(str: String): Unit = {
      println("hello")
    }

    //懒值：初始化将被推迟，知道首次使用时对他取值
    lazy val words = scala.io.Source.fromFile("/test").mkString //不访问words时不打开文件

  }
}