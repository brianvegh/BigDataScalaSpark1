Variables are nothing but reserved memory locations to store values. This means that when you create a variable you reserve some space in memory.

Based on the data type of a variable, the compiler allocates memory and decides what can be stored in the reserved memory. Therefore, by assigning different data types to variables, you can store integers, decimals, or characters in these variables.

## Variable Declaration
Scala has the different syntax for the declaration of variables and they can be defined as a value, i.e., constant or a variable. Following is the syntax to define a variable using var keyword:
```Scala
var myVar : String = "Foo"
```
Here, myVar is declared using the keyword var. This means that it is a variable that can change value and this is called a mutable variable. Following is the syntax to define a variable using val keyword:
```Scala
val myVal : String = "Foo"
```
Here, myVal is declared using the keyword val. This means that it is a variable that can not be changed and this is called immutable variable.

 

## Variable Data Types:
The type of a variable is specified after the variable name, and before equals sign. You can define any type of Scala variable by mentioning its data type as follows:

val or val VariableName : DataType [=  Initial Value]
If you do not assign any initial value to a variable, then it is valid as follows:
```Scala
var myVar :Int;
val myVal :String;
``` 

## Variable Type Inference:
When you assign an initial value to a variable, the Scala compiler can figure out the type of the variable based on the value assigned to it. This is called variable type inference. Therefore, you could write these variable declarations like this:
```Scala
var myVar = 10;
val myVal = "Hello, Scala!";
```
Hereby default myVar will be Int type and myVal will become String type variable.

 

## Multiple assignments:
Scala supports multiple assignments. If a code block or method returns a Tuple, the Tuple can be assigned to a val variable. [ Note: We will study Tuple in subsequent chapters.]
```Scala
val (myVar1: Int, myVar2: String) = Pair(40, "Foo")
```
And the type inference gets it right:
```Scala
val (myVar1, myVar2) = Pair(40, "Foo")
``` 

## Variable Types:
Variables in Scala can have three different scopes depending on the place where they are being used. They can exist as fields, as method parameters, and as local variables. Below are the details about each type of scope:

## Fields:
Fields are variables that belong to an object. The fields are accessible from inside every method in the object. Fields can also be accessible outside the object depending on what access modifiers the field is declared with. Object fields can be both mutable or immutable types and can be defined using either var or val.

## Method Parameters:
Method parameters are variables, which are used to pass the value inside a method when the method is called. Method parameters are only accessible from inside the method but the objects passed in may be accessible from the outside, if you have a reference to the object from outside the method. Method parameters are always mutable and defined by var keyword.

## Local Variables:
Local variables are variables declared inside a method. Local variables are only accessible from inside the method, but the objects you create may escape the method if you return them from the method. Local variables can be both mutable or immutable types and can be defined using either var or val.