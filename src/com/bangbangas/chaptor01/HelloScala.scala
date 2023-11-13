package com.bangbangas.chaptor01

/**
 * ClassName: HelloScala
 * Package: com.bangbangas.chaptor01
 * Description: 
 *
 * @Author 王少波
 * @Create 2023/11/7 9:07 
 * @Version 1.0
 */
/*
object 静态对象，定义的方法是静态的，定义的变量也是静态的
val :用val修饰的变量相当于用final修饰的变量，不能改变内存地址值
     可以改变内存中的存储的数据内容
var :可以重新赋值 可变类型

常用数据类型
byte short int long float double boolean char

 */
object HelloScala {
  var name:String=_
  var age:Integer=_
  val id=20
  def main(args:Array[String]):Unit={
      val age= 12
      var name = if(age>15) {
        100
        12.0
      } else {
        "test01"
        "data"
      }
      println(name)


    /*

    */
    var str="123421342421342"
    for(s<- str){
      println(s)
    }

    val ints: Array[Int] = Array(1, 2, 3, 4, 5)
    for(x<- ints){
      println(x)
    }
    for(x <- 0 to str.length-1) println(str(x))

    for(x<- 0.until(ints.size))  println(ints(x))


    def add(x:Int,y:Int):Int={
        x+y
    }

    def add1(x:Int):Int={
      x
    }

    add(12,34)

  }
}
