package com.duoyi.first

/**
 * ClassName: ScalaBasic
 * Package: com.duoyi.first
 * Description: 
 *
 * @Author 王少波
 * @Create 2023/11/13 17:10 
 * @Version 1.0   
 */
object ScalaBasic {
  def main(args:Array[String]):Unit={
    /*
    var 修饰的变量可以被重新赋值
    val 修饰的变量属于常量，类似于java中的final修饰
     */
    var age:Int=10
    var score:Double=12
    age+=1
    score+=1

    val wangshao = new Person("wangshao", 30)
    // wangshao=null //修饰引用对象，地址值不能边，对应属性值可以重新赋值
    wangshao.name="wanglixin"
    println(wangshao.name)

  }

}

class Person{
  var name:String=_
  var age:Int=_

  def this(name:String,age:Int){
      this()
      this.name=name
      this.age=age
  }

}