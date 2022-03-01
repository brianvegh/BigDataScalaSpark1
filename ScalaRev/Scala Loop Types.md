There may be a situation when you need to execute a block of code several numbers of times. In general, statements are executed sequentially: The first statement in a function is executed first, followed by the second, and so on.

Programming languages provide various control structures that allow for more complicated execution paths.

A loop statement allows us to execute a statement or group of statements multiple times.

|Loop Type|	Description|
|----|----|
|while loop|	Repeats a statement or group of statements while a given condition is true. It tests the condition| before executing the loop body.
|do...while loop|	Like a while statement, except that it tests the condition at the end of the loop body|
|for loop|	Executes a sequence of statements multiple times and abbreviates the code that manages the loop variable.|
|||
## Loop Control Statements:
Loop control statements change execution from its normal sequence. When execution leaves a scope, all automatic objects that were created in that scope are destroyed. As such Scala does not support break or continue statement as Java does but starting from Scala version 2.8, there is a way to break the loops. Click the following links to check the detail.

|Control Statement|	Description|
|----|----|
|break statement|	Terminates the loop statement and transfers execution to the statement immediately following the loop.|
|||
 

## The Infinite Loop:
A loop becomes infinite loop if a condition never becomes false. If you are using Scala, the while loop is the best way to implement an infinite loop as follows
```Scala
object Test {
   def main(args: Array[String]) {
      var a = 10;
      // An infinite loop.
      while( true ){
         println( "Value of a: " + a );
      }
   }
}
```
If you will execute above code, it will go in infinite loop whcih you can terminate by pressing Ctrl + C keys.