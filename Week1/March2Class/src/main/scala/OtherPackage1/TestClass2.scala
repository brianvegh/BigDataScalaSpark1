package OtherPackage1
import com._

import scala.collection.mutable.ListBuffer
import scala.io.StdIn
import java.util.Scanner


class TestClass2{
  var y:Int=7
}
object TestClass2 extends App{
  lazy val x:Int=6
  println(x)

  lazy val tc2 = new TestClass2
  println(tc2.y)

  val LB1:ListBuffer[String]=ListBuffer()

  var line=""

//  val sc = new Scanner(System.in)
//  println("What's your name?\n")
//  val name = sc.nextLine
//  println(name)
  while({line=StdIn.readLine();line!="quit:"}){
    println(line)
    LB1+=line
  }
  println(LB1)
}
