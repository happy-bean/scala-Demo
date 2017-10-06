package com.wgt.lesson2

import scala.util.Random

/**
  * Author:wgt
  * Description:条件表达式
  */
class Study2 {

  /*
    if...else 的语法格式如下：

    if(布尔表达式){
      // 如果布尔表达式为 true 则执行该语句块
    }else{
      // 如果布尔表达式为 false 则执行该语句块
    }
    单句的话，可以不写{}

    */
  var x = 1
  if (x > 0) 1 else -1
  //scala的if/else语法是有值的，这个值就是在if或else之后的表达式的值
  x = if (x > 0) 1 else 1

  //混合型
  if (x > 0) "hello" else 1 //其中一个分支类型是String 另一个是 Int

  //在scala中每个表达式都应有某种值,所以引入Unit类，写作()可以理解为void
  if (x > 0) 1
  //等同于
  if (x > 0) 1 else ()
  //注意：由于赋值语句的值是Unit类型，所这种表达式 x=y=1错误　y=1的值是()所以x=()
  //scala中没有switch/case，但是有case
  val randomInt = new Random().nextInt(10)
  randomInt match {
    case 7 => println(" seven ")
    case otherNumber => println(" otherNumber : " + otherNumber)
  }

  /*循环*/
  while (true) {
    println(" while ");
  }

  do {
    println(" do/while ");
  } while (true);

  var a = 0;
  for (a <- 1 to 10) {
    println(" for ");
  }

  val numList = List(1,2,3,4,5,6);
  // foreach
  for( a <- numList ){
    println( " foreach : " + a );
  }

  //for 循环过滤
  for( a <- numList
       if a != 3; if a < 8 ){
    println( "or 循环过滤: " + a );
  }

  // for 循环中使用 yield，Scala中的yield的主要作用是记住每次迭代中的有关值，并逐一存入到一个数组中
  var retVal = for{ a <- numList
                    if a != 3; if a < 8
  }yield a

  // 输出返回值
  for( a <- retVal){
    println( "Value of a: " + a );
  }



}
