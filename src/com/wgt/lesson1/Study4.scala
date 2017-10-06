package com.wgt.lesson1

/**
  * Author:wgt
  * Description:运算符
  */
object Study4 {

  /*
  * + 加号 	- 减号 	* 乘号 	/ 除号  % 取余
  * == 等于  != 不等于  > 大于  < 小于 	 >= 大于等于 	 <= 小于等于
  * && 	逻辑与 	|| 逻辑或 	! 逻辑非
  * &	按位与运算符	 |	按位或运算符  ^	按位异或运算符 	~	按位取反运算符 	<<	左移动运算符  >>	右移动运算符	  >>> 无符号右移
  * = 	简单的赋值运算，指定右边操作数赋值给左边的操作数。
  * += 	相加后再赋值，将左右两边的操作数相加后再赋值给左边的操作数。
  * -= 	相减后再赋值，将左右两边的操作数相减后再赋值给左边的操作数。
  * *= 	相乘后再赋值，将左右两边的操作数相乘后再赋值给左边的操作数。
  * /= 	相除后再赋值，将左右两边的操作数相除后再赋值给左边的操作数。
  * %= 	求余后再赋值，将左右两边的操作数求余后再赋值给左边的操作数。
  * <<= 按位左移后再赋值
  * >>= 按位右移后再赋值
  * &= 	按位与运算后赋值
  * ^= 	按位异或运算符后再赋值
  * |= 	按位或运算后再赋值
  * */

  /*
  * a+b 相当于执行的a.+(b),别的运算符一样
  * scala 中没有++,--操作
  * 对于BigInt ,BigDecimal对象　可像数字一样使用运算符
  * scala允许自定义操作符
  * */
  def main(args: Array[String]) {

    var a = 10
    var b = 20
    var c = 25
    var d = 25
    println("a + b = " + (a + b))
    println("a - b = " + (a - b))
    println("a * b = " + (a * b))
    println("b / a = " + (b / a))
    println("b % a = " + (b % a))
    println("c % a = " + (c % a))

    println("a == b = " + (a == b))
    println("a != b = " + (a != b))
    println("a > b = " + (a > b))
    println("a < b = " + (a < b))
    println("b >= a = " + (b >= a))
    println("b <= a = " + (b <= a))

    val i = true
    val j = false

    println("i && j = " + (i && j))

    println("i || j = " + (i || j))

    println("!(i && j) = " + !(i && j))


    a = 10
    b = 20
    c = 0

    c = a & b
    println("a & b = " + c)

    c = a | b
    println("a | b = " + c)

    c = a ^ b
    println("a ^ b = " + c)

    c = ~a
    println("~a = " + c)

    c = a << 2
    println("a << 2 = " + c)

    c = a >> 2
    println("a >> 2  = " + c)

    c = a >>> 2
    println("a >>> 2 = " + c)

    c = a + b
    println("c = a + b  = " + c)

    c += a
    println("c += a  = " + c)

    c -= a
    println("c -= a = " + c)

    c *= a
    println("c *= a = " + c)

    a = 10
    c = 15
    c /= a
    println("c /= a  = " + c)

    a = 10
    c = 15
    c %= a
    println("c %= a  = " + c)

    c <<= 2
    println("c <<= 2  = " + c)

    c >>= 2
    println("c >>= 2  = " + c)

    c >>= 2
    println("c >>= a  = " + c)

    c &= a
    println("c &= 2  = " + c)

    c ^= a
    println("c ^= a  = " + c)

    c |= a
    println("c |= a  = " + c)

  }
}
