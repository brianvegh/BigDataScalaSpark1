package com.Revature
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

class ForThreading {

  def job(n: Int) = Future[Int] {
    Thread.sleep(1000)
    println(n) // for demo only as this is side-effecting
    n + 1
  }
}
