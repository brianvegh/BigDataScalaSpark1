package com.extraPack

import scala.collection.mutable.ListBuffer
import scala.io.StdIn
import java.util.Scanner
import com.test1._




class ReadInp() {
  val x:Int=60
}
object ReadInp extends App{

  val LB1:ListBuffer[String]=ListBuffer()
  var line = ""
  while ({line = StdIn.readLine(); line != ":quit"}) {
    println(line)
    LB1+=line
  }
  println(LB1)
  var g = new ReadInp()
  println(g.x)

  val output:String={s"$LB1"+" great"}
  println(output)

  val iterator = new IntIterator(10)
  val LB2:ListBuffer[Int]=ListBuffer()
  LB2+=iterator.next()
  //println(iterator)// returns 0
  LB2+=iterator.next()
  //println(iterator)// returns 1
  println(LB2)



}
