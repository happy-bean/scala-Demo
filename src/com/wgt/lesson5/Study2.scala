

/**
  * Author:wgt
  * Description:包
  */

/*
* scala的包和java中的包或C++中的命名空间的木大是相同目的：管理大型程序的名称
*
* 源文件的目录和包之间并没有强制的关联关系
* */

package com {
  package wgt {
    package lesson5 {

      class Study2 {
      }

    }

  }

}

//串联包语句，这样的包语句限定了可见成员
package com.wgt.lesson5 {

  class Study2_1 {

  }

}

//文件顶部标记法
//package com.wgt.lesson5　直接写于文件顶部（最常见）

//包对象
/*
*包可以包含类，对象和特征，但不能包含函数或函数的定义
* 每一个包都可以有一个包对象需要在父包中定义它，且名称与包一样
* */
package com.wgt.lesson5 {

  package object people {
    var defaultName = "scala"
  }
  package people {

    class Person {

      //父包对象拿到的常量
      var name = defaultName
    }

  }

}

//包的可见性
/*
* java中没有被声明为public protected  private 的类成员在包含该类的包中可见，在scala中可以通过修饰符达到同样的效果
* */
package com.wgt.lesson5.test.people{
  class Student{
    private[people] var id=0

    //可以将可见度延伸到上层包
    private[test] var name="scala"
  }
}