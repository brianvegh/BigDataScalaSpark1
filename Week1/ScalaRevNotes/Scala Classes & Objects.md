A class is a blueprint for objects. Once you define a class, you can create objects from the class blueprint with the keyword new. Following is a simple syntax to define a class in Scala:
```Scala
class Point(xc: Int, yc: Int) {
   var x: Int = xc
   var y: Int = yc
   def move(dx: Int, dy: Int) {
      x = x + dx
      y = y + dy
      println ("Point x location : " + x);
      println ("Point y location : " + y);
   }
}
```
This class defines two variables **x** and **y** and a method: **move**, which does not return a value. Class variables are called, fields of the class and methods are called class methods.

The class name works as a class constructor which can take a number of parameters. The above code defines two constructor arguments, **xc**, and **yc**; they are both visible in the whole body of the class.

As mentioned earlier, you can create objects using a keyword **new** and then you can access class fields and methods as shown below in the example:
```Scala
import java.io._
class Point(val xc: Int, val yc: Int) {
   var x: Int = xc
   var y: Int = yc
   def move(dx: Int, dy: Int) {
      x = x + dx
      y = y + dy
      println ("Point x location : " + x);
      println ("Point y location : " + y);
   }
}
object Test {
   def main(args: Array[String]) {
      val pt = new Point(10, 20);
      // Move to a new location
      pt.move(10, 10);
   }
}
```
When the above code is compiled and executed, it produces the following result:
```Scala
C:/>scalac Test.scala
C:/>scala Test
Point x location : 20
Point y location : 30
C:/>
```
## Extending a Class:
You can extend a base scala class in the similar way you can do it in Java but there are two restrictions: method overriding requires the **override** keyword, and only the **primary** constructor can pass parameters to the base constructor. Let us extend our above class and add one more class method:
```Scala
class Point(val xc: Int, val yc: Int) {
   var x: Int = xc
   var y: Int = yc
   def move(dx: Int, dy: Int) {
      x = x + dx
      y = y + dy
      println ("Point x location : " + x);
      println ("Point y location : " + y);
   }
}
class Location(override val xc: Int, override val yc: Int,
   val zc :Int) extends Point(xc, yc){
   var z: Int = zc
   def move(dx: Int, dy: Int, dz: Int) {
      x = x + dx
      y = y + dy
      z = z + dz
      println ("Point x location : " + x);
      println ("Point y location : " + y);
      println ("Point z location : " + z);
   }
}
```
Such an **extends** clause has two effects: it makes class Location inherit all non-private members from class Point, and it makes the type Location a subtype of the type Point class. So here the Point class is called **superclass** and the class Location is called **subclass**. Extending a class and inheriting all the features of a parent class is called **inheritance** but scala allows the inheritance from just one class only. Let us take complete example showing inheritance:
```Scala
import java.io._
class Point(val xc: Int, val yc: Int) {
   var x: Int = xc
   var y: Int = yc
   def move(dx: Int, dy: Int) {
      x = x + dx
      y = y + dy
      println ("Point x location : " + x);
      println ("Point y location : " + y);
   }
}
class Location(override val xc: Int, override val yc: Int,
   val zc :Int) extends Point(xc, yc){
   var z: Int = zc
   def move(dx: Int, dy: Int, dz: Int) {
      x = x + dx
      y = y + dy
      z = z + dz
      println ("Point x location : " + x);
      println ("Point y location : " + y);
      println ("Point z location : " + z);
   }
}
object Test {
   def main(args: Array[String]) {
      val loc = new Location(10, 20, 15);
      // Move to a new location
      loc.move(10, 10, 5);
   }
}
```
Note that methods move and **move** do not override the corresponding definitions of the move since they are different definitions (for example, the former take two arguments while the latter take three arguments). When the above code is compiled and executed, it produces the following result:
```Scala
C:/>scalac Test.scala
C:/>scala Test
Point x location : 20
Point y location : 30
Point z location : 20
C:/>
``` 

## Singleton objects:
Scala is more object-oriented than Java because in Scala we cannot have static members. Instead, Scala has **singleton objects**. A singleton is a class that can have only one instance, i.e., object. You create singleton using the keyword **object** instead of class keyword. Since you can't instantiate a singleton object, you can't pass parameters to the primary constructor. You already have seen all the examples using singleton objects where you called Scala's main method. Following is the same example of showing singleton:
```Scala
import java.io._
class Point(val xc: Int, val yc: Int) {
   var x: Int = xc
   var y: Int = yc
   def move(dx: Int, dy: Int) {
      x = x + dx
      y = y + dy
   }
}
object Test {
   def main(args: Array[String]) {
      val point = new Point(10, 20)
      printPoint
      def printPoint{
         println ("Point x location : " + point.x);
         println ("Point y location : " + point.y);
      }
   }
}
```
When the above code is compiled and executed, it produces the following result:
```Scala
C:/>scalac Test.scala
C:/>scala Test
Point x location : 10
Point y location : 20
C:/>
```