Scala is open to making use of any Java objects and **java.io.File** is one of the objects which can be used in Scala programming to read and write files. Following is an example of writing to a file:
```Scala
import java.io._
object Test {
   def main(args: Array[String]) {
      val writer = new PrintWriter(new File("test.txt" ))
      writer.write("Hello Scala")
      writer.close()
   }
}
```
When the above code is compiled and executed, it creates a file with "Hello Scala" content which you can check yourself.
```Scala
C:/>scalac Test.scala
C:/>scala Test
C:/>
```
## Reading a line from Screen:
Sometimes you need to read user input from the screen and then proceed for some further processing. Following example shows you how to read input from the screen:
```Scala
object Test {
   def main(args: Array[String]) {
      print("Please enter your input : " )
      val line = Console.readLine
      
      println("Thanks, you just typed: " + line)
   }
}
```
When the above code is compiled and executed, it prompts you to enter your input and it continues until you press ENTER key.
```Scala
C:/>scalac Test.scala
C:/>scala Test
scala Test
Please enter your input : Scala is great
Thanks, you just typed: Scala is great
C:/>
```
 

## Reading File Content:
Reading from files is really simple. You can use Scala's **Source class** and its companion object to read files. Following is the example which shows you how to read from "test.txt" file which we created earlier:
```Scala
import scala.io.Source
object Test {
   def main(args: Array[String]) {
      println("Following is the content read:" )
      Source.fromFile("test.txt" ).foreach{ 
         print 
      }
   }
}
```
When the above code is compiled and executed, it will read test.txt file and display the content on the screen:
```Scala
C:/>scalac Test.scala
C:/>scala Test
scala Test
Following is the content read:
Hello Scala
C:/>
```