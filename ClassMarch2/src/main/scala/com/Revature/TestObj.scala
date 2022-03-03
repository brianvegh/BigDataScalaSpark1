package com.Revature
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

class TestObj(var description: String) {
  private var _status: String = "pending"

  def status():String = _status
}

object TestObj {

  def main(args: Array[String]):Unit= {
    val task2 = TestObj.apply("do something")
    assert(task2.description == "do something")
    assert(task2.status == "pending")
    println(task2.status())
    println(TestObj.unapply(task2))

    val ft = new ForThreading()
    val f = for {
      f1 <- ft.job(1)
      f2 <- ft.job(f1)
      f3 <- ft.job(f2)
      f4 <- ft.job(f3)
      f5 <- ft.job(f4)
    } yield List(f1, f2, f3, f4, f5)
    f.map(z => println(s"Done. ${z.size} jobs run"))
    Thread.sleep(6000) // needed to prevent main thread from quitting
    // too early
    val g = for {
      g1 <- ft.job(1)
      g2 <- Future.sequence(List(ft.job(g1), ft.job(g1)))
      g3 <- ft.job(g2.head)
      g4 <- Future.sequence(List(ft.job(g3), ft.job(g3)))
      g5 <- ft.job(g4.head)
    } yield g2.size + g4.size
    g.foreach(z => println(s"Done. $z jobs run in parallel"))
    Thread.sleep(6000)

    var x:List[Int]=(1 to 10).toList
    x.map(z=>ft.job(z))
    Thread.sleep(6000)
  }

  def apply(description: String): TestObj = new TestObj(description)

  def apply(description: String, status: String): TestObj = {
    val task = new TestObj(description)
    task._status = status
    task
  }
  def unapply(task: TestObj): Tuple2[String, String] = (task.description, task.status())

}
