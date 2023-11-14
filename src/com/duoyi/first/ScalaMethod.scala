package com.duoyi.first

/**
 * ClassName: ScalaMethod
 * Package: com.duoyi.first
 * Description: 
 *
 * @Author 王少波
 * @Create 2023/11/14 8:38 
 * @Version 1.0   
 */

object ScalaMethod {
  def main(args: Array[String]): Unit = {
      var result = add(2,3)
      println(add3(1, 23))
      add4 // 声明方法的时候不指定(),调用的时候不能加（）
      add5 // 声明无参方法,调用的时候可加可不加（）
      add6("12","23","34")
    println(add2(12, 23))
  }

  /*
  方法的定义和使用
  调用方法
  object里的方法：类名.方法名
  同一个object李的方法：直接调用
  class里的方法：对象名.方法名
   */

  def add(a:Int,b:Int):Double={
      a+b
  }

  def add1(a:Int,b:Double):Double={
      a+b
  }

  def add2(a:Int,b:Double):Double={
       a+b
  }
  // Unit相当于java的void,没有返回值
  def add3(a:Int,b:Double):Unit={
    println("test")
  }

  def add4:Unit={
    println("test")
  }

  def add5():Unit={
    println("test")
  }

  def add6(str:String*):Unit={
    for (elem <- str) {
      println(elem)
    }
  }

}
