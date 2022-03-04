package com
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

object Futures1 extends App{
  def job(n:Int):Future[Int] = Future[Int]{
    Thread.sleep(1000)
    println(n)
    n+1
  }
  val f = for {
    f1 <- job(1)
    f2 <- job(f1)
    f3 <- job(f2)
    f4 <- job(f3)
    f5 <- job(f4)
  } yield List(f1,f2,f3,f4,f5)
    f.map(z=> println(s"Done. ${z.size} jobs run"))
  Thread.sleep(6000)

  val g = for{
    g1<-job(1)
    g2<-Future.sequence(List(job(g1),job(g1)))
    g3<-job(g2.head)
    g4<-Future.sequence(List(job(g3),job(g3)))
    g5<-job(g4.head)
  } yield g2.size + g4.size
  g.foreach(z => println(s"Done. $z jobs run in parallel"))
  Thread.sleep(6000)
}
