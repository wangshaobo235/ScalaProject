package com.duoyi.first

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.Set

/**
 * ClassName: ScalaArray
 * Package: com.duoyi.first
 * Description: 
 *
 * @Author 王少波
 * @Create 2023/11/14 10:48 
 * @Version 1.0   
 */
object ScalaArray {
  def main(args: Array[String]): Unit = {
      val arr = Array[Any](12,3,4,56,"test")
      // val arr1 = Array[Int](12,3,4,56,"test") Array[泛型] 限制类型约束
      val arr1 = new Array[String](5);
      val arr2 = Array[String]("test");

    val arr3 = new ArrayBuffer[String]()

    /* set
    可变：
    不可变：set
     */
    var ints = Set(12,34,56)  //一旦定义，内容不可变，长度不可变，只能读取，不能变更
    val bool: Boolean = ints.contains(12) // 判断元素是否存在 等同于 ints(12)
    ints=ints+129
    for(x<- ints){
      println(x)
    }

    val ints1: mutable.Set[Int] = mutable.Set[Int](12, 23, 45)


  }





}
