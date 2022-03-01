An extractor in Scala is an object that has a method called **unapply** as one of its members. The purpose of that unapply method is to match a value and take it apart. Often, the extractor object also defines a dual method **apply** for building values, but this is not required.

Following example shows an extractor object for email addresses:
```Scala
object Test {
   def main(args: Array[String]) {
      
      println ("Apply method : " + apply("Zara", "gmail.com"));
      println ("Unapply method : " + unapply("Zara@gmail.com"));
      println ("Unapply method : " + unapply("Zara Ali"));
   }
   // The injection method (optional)
   def apply(user: String, domain: String) = {
      user +"@"+ domain
   }
   // The extraction method (mandatory)
   def unapply(str: String): Option[(String, String)] = {
      val parts = str split "@"
      if (parts.length == 2){
         Some(parts(0), parts(1)) 
      }else{
         None
      }
   }
}
```
This object defines both **apply** and **unapply** methods. The apply method has the same meaning as always: it turns Test into an object that can be applied to arguments in parentheses in the same way a method is applied. So you can write Test("Zara", "gmail.com") to construct the string "Zara@gmail.com".

The **unapply** method is what turns Test class into an **extractor** and it reverses the construction process of **apply**. Where apply takes two strings and forms an email address string out of them, unapply takes an email address and returns potentially two strings: the **user** and the **domain** of the address.

The **unapply** must also handle the case where the given string is not an email address. That's why unapply returns an Option-type over pairs of strings. Its result is either **Some(user, domain)** if the string str is an email address with the given user and domain parts, or None if str is not an email address. Here are some examples:
```Scala
unapply("Zara@gmail.com") equals Some("Zara", "gmail.com")
unapply("Zara Ali") equals None
```
When the above code is compiled and executed, it produces the following result:
```Scala
C:/>scalac Test.scala
C:/>scala Test
Apply method : Zara@gmail.com
Unapply method : Some((Zara,gmail.com))
Unapply method : None
C:/>
```
## Pattern Matching with Extractors:
When an instance of a class is followed by parentheses with a list of zero or more parameters, the compiler invokes the **apply** method on that instance. We can define apply both in objects and in classes.

As mentioned above, the purpose of the **unapply** method is to extract a specific value we are looking for. It does the opposite operation **apply** does. When comparing an extractor object using the **match** statement the ****unapply** method will be automatically executed as shown below:
```Scala
object Test {
   def main(args: Array[String]) {
      
      val x = Test(5)
      println(x)
      x match
      {
         case Test(num) => println(x+" is bigger two times than "+num)
         //unapply is invoked
         case _ => println("i cannot calculate")
      }
   }
   def apply(x: Int) = x*2
   def unapply(z: Int): Option[Int] = if (z%2==0) Some(z/2) else None
}
```
When the above code is compiled and executed, it produces the following result:
```Scala
C:/>scalac Test.scala
C:/>scala Test
10
10 is bigger two times than 5
C:/>
```