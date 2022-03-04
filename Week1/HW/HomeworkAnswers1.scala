import scala.io.StdIn.readLine
import Console.{BOLD, RESET,UNDERLINED}
import java.util.Scanner
import scala.collection.immutable.ListMap

class Customer(var firstName:String, var lastName:String, var favoriteMovie:String){
  def this(firstName:String, lastName:String)={
    this(firstName, lastName, "")
  }
  def this()={
    this("","","")
  }
  def movie():Unit={
    println("What is your favorite movie?")
    var sc = new Scanner(System.in);
    var movie = sc.nextLine();
    this.favoriteMovie=movie
  }

  def printInfo():Unit={

    println(s"First Name: ${this.firstName}")
    println(s"Last Name: ${this.lastName}")
    println(s"Favorite Movie: ${this.favoriteMovie}")
  }
}



class Donut (var donut_name:String, var quantity_purchased:Int, var price:Double){
  def this(){
    this("Vanilla Donut",10,2.25)
  }
  def createJson(): Unit ={
    println(s"""{\n"donut_name":"${donut_name}", \n"quantity_purchased":"${quantity_purchased}", \n"price":"${price}"\n}""")
  }
  def calPrice(): Unit ={
    val total = quantity_purchased * price
    println(f"The total is $$$total%2.2f")
  }
  def read(){
    println(s"${donut_name} ${quantity_purchased} ${price}")
  }
}
object Homework {
  def main(args:Array[String]){
    var out = true
    while(out!=false){
      println("What problem would you like to look at? Type in the number for the problem or type 0 to quit\n Problems Available:\n 1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n")
      print("Number: ")
      var ans = readLine().toInt
      out = questions(ans)
      print("Continue?(Y/N) ")
      if(out == true){
        var ex = readLine()
        if(ex.equals("Y")){
          out = true
        }else{
          out = false
        }
      }

    }
    def questions(a:Int):Boolean = a match{
      case 1 => {question1()
        true}
      case 2 => {question2()
        true}
      case 3 => {question3()
        true}
      case 4 => {question4()
        true}
      case 5 => {question5()
        true}
      case 6 => {question6()
        true}
      case 7 => {question7()
        true}
      case 8 => {question8()
        true}
      case 9 => {question9()
        true}
      case 10 => {question10()
        true}
      case _ => false

    }
    def question1(): Unit ={
      var don = new Donut
      don.createJson()

    }
    def question2(): Unit ={
      val sc = new Scanner(System.in);
      println("What's your name?\n");
      val name = sc.nextLine();
      println("How old are you?\n");
      val age = sc.nextInt();
      print(s"${BOLD}Name: ${RESET}");
      println(s"\u001B[4m$name${RESET}");
      print(s"${BOLD}Age: ${RESET}");
      println(age);

    }
    def question3(): Unit ={
      val s = "http://allaboutscala"
      if(s.length<8){
        println("String too short");
      }else{
        println(s.charAt(7))
      }

    }
    def question4(): Unit ={
      var don = new Donut
      don.calPrice()

    }
    def question5(): Unit ={
      var cust = new Customer("William","Terry")
      cust.movie()
      cust.printInfo()

    }
    def question6(): Unit ={
      var cust = new Customer("William","Terry")
      cust.movie()
      cust.printInfo()

    }
    def question7(): Unit ={
      var str = "Vanilla Donut 10 2.25"
      var elem = str.split(" ")
      var donut = new Donut((elem(0)+" "+elem(1)), elem(2).toInt, elem(3).toDouble)
      donut.read()

    }
    def question8(): Unit ={
      var people = Map("Bill" -> 9, "Johnny" -> 9, "Tommy" -> 11,  "Cindy" -> 13)

      var res = ListMap(people.toSeq.sortWith(_._1>_._1):_*)
      println(res)

    }
    def question9(): Unit ={
      val data = Array("Cake", "Milk", "Cheese", "Toilet Paper")
      val data2 = Array("Bread", "Water", "Juice", "Milk", "Cheese")
      var wordCount = scala.collection.mutable.HashMap[String, Int]().withDefaultValue(0)

      data.foreach(word => wordCount(word) += 1)
      data2.foreach(word => wordCount(word) += 1)


      println(wordCount)

    }
    def question10(): Unit ={
      val start = 100
      val end = 110
      val s = Seq.range(start, end+1, 1)

      s.foreach(s => print(s"$s "))
      println("")

    }
  }


}
