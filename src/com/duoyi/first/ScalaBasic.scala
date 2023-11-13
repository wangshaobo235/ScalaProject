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

  var i:Int=_
  var j:Int=_
  // val k:Int=_ val修饰不能给默认值，必须进行赋值
  // static的方法
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

    /*
    所有都是基本数据类型：byte,short,int,long 0
     float,double 0.0
     char\u0000
     boolean false
     */

    /*
    if else
    分支只有一行，大括号可以省略
     */
    if(age>10){
      println(1)
    }else{
      println(2)
    }

    if(age>10) println(1) else println(2)

    if(age>10){
      println(1)
      println(3)
    }else{
      println(2)
    }

    if(age>10){
      println(1)
      println(3)
    }else if(age<10){
      println(2)
    }else{
      println(4)
    }

    // 最后一行默认return
    val test = if(age>10){
      1
      2
    }else if(age<10){
      3
      4
    }else{
      5
      6
    }

    val ij: Int = if (1 > 2) 1 else -1

    val ji=if(1>2) 1 else "test"

    val jitest=if(1>2) 1 else ()

    println("===============================================")

    /*
    循环

     */

    val str="wanglixin"
    println(str(0))
    // 字符串循环
    for(s<-str){
      println(s)
    }

    /*
    a  until b [a,b)
    a   to   b [a,b]
    */

    for(i<- 0 until  str.length){
      println(str(i))
    }

    for(i<- 0 to  str.length-1){
      println(str(i))
    }

    println(str.charAt(0))

    val arr=Array(1,2,3,4,5,6,7,8,9,10)
    for(s<- arr){
      println(s)
    }

    for(i<- 0 until arr.size){
      println(arr(i))
    }


    var flag = true
    var ijk=0
    while(flag){
      println(arr(ijk))
      ijk+=1
      if(ijk==arr.size) flag=false
    }

    for(i<- 1 to 3 ;j<- 1 to 3 if i!=j){
      println(i + " " + j)
    }


    /*
    yield
     */
    val r = for(x<- 0 until arr.length if x%2==0) yield arr(x)*100
    for(x<-0 until  r.length){
      println(r(x))
    }

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