package com
class Task(var description: String){
  private var _status:String ="pending"

  def status():String = _status
}
object Task {
  def apply(description: String): Task = new Task(description)

  def main(args:Array[String]):Unit={
    val task2 = Task.apply("do something")
    assert(task2.description == "do something")
    assert(task2.status == "pending")
    println(task2.status())
    println(Task.unapply(task2))
  }
  def apply(description:String,status: String):Task = {
    val task = new Task(description)
    task._status =status
    task
  }
  def unapply(task:Task): Tuple2[String,String] = (task.description, task.status())
}
