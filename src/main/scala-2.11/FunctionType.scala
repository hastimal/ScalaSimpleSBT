import java.util.Date

/**
 * Created by hastimal on 10/2/2015.
 */
object FunctionType {
  def main(args: Array[String]) {
    FunctionCallByName.callFunction
    FunctionCallByNamedArgument.callFunction
    FunctionCallByVariableArgument.callFunction
    FunctionCallByDefaultParameter.callFunction
    FunctionCallRecursive.callFunction
    FunctionCallAnonymous.callFunction
    FunctionCallDate.callFunction
    ScalaClosures.callFunction
    FunctionCurry.callFunction

  }
}
/*parameters to functions are by-value parameters;
that is, the value of the parameter is determined before
it is passed to the function. But what if we need to write
a function that accepts as a parameter an expression that
we don't want evaluated until it's called within our
function? For this circumstance, Scala offers call-by-name
parameters.
A call-by-name mechanism passes a code block to the callee
and each time the callee accesses the parameter, the code
block is executed and the value is calculated.*/
object FunctionCallByName{
  def callFunction: Unit ={
    delayed(time())
  }
  def time() = {
    println("Getting time in milli and  nano seconds")
   // System.currentTimeMillis()
    System.nanoTime()
  }
  /*=> is syntactic sugar for creating instances of functions.
  Recall that every function in scala is an instance of a class.
For example, the type Int => String, is equivalent to the type
Function1[Int,String] i.e. a function that takes an argument of type Int and returns a String.*/
  def delayed(t: => Long){
    println("In delayed method")
    println("Param: " + t)
    t
  }

}
object FunctionCallByNamedArgument{
  def callFunction: Unit ={
    printValue(3,5)
  }
  def printValue(a:Int,b:Int): Unit ={
    println("Value of a : " + a )
    println("Value of b : " + b )
    println("Value of b+a : " +(b+a) )
  }
}
/*Scala allows you to indicate that the last parameter to a
function may be repeated. This allows clients to pass variable
length argument lists to the function.*/
object FunctionCallByVariableArgument{
  def callFunction: Unit ={
    printStrings("hello","I am here","new in scala")
  }
  def printStrings(args:String*): Unit = {//Here, the type of args inside the printStrings function, which is declared as type "String*" is actually Array[String].
    var i: Int = 0
    for (j<-args) {
      println("Arg value[" + i + "] = " + j )
      i = i + 1
    }

  }
}
object FunctionCallByDefaultParameter{
  def callFunction: Unit ={
    println("Sum of 8 and 9 is "+printSum(8,9))
  }
  def printSum(a:Int,b:Int): Int = {
    //Here, the type of args inside the printStrings function, which is declared as
    // type "String*" is actually Array[String].
    var sum :Int=0
    sum = a+b
    sum
  }
}
object FunctionCallRecursive{
  def callFunction: Unit ={
    for (i <- 1 to 5)
      println( "Factorial of " + i + ": = " + factorialCalculation(i) )
  }
  def factorialCalculation(n:BigInt): BigInt = {
    //Here, the type of args inside the printStrings function, which is declared as type "String*" is actually Array[String].
   if (n<1)
     1
   else
     n*factorialCalculation(n-1)
  }
}
object FunctionCallAnonymous{
  /*Anonymous functions in source code are called function literals and at
  run time, function literals are instantiated into objects called function values.
Scala supports first-class functions, which means you can express functions
in function literal syntax, i.e., (x: Int) => x + 1, and that functions
can be represented by objects, which are called function values.*/
  def callFunction: Unit ={
    val inc = (x:Int) => x+1
    println("Increament value of 5 by function is "+inc(5))
    val mul = (x: Int, y: Int) => x*y
    println("Multiplication 3 with 5 by function is "+mul(5,3))
    // It is also possible to define functions with no parameter as follows:
    //    val userDir = () => { System.getProperty("user.dir") }
    //    println( userDir )

  }

}
object FunctionCallDate{

    def callFunction: Unit ={
      val date = new Date
      log(date, "message1" )
      Thread.sleep(1000)
      log(date, "message2" )
      Thread.sleep(1000)
      log(date, "message3" )
  }
  def log(date:Date,message:String): Unit ={
    println(date+"-----"+message)
  }
}/*A closure is a function, whose return value depends on the value of one
or more variables declared outside this function*/
object ScalaClosures{
  def callFunction: Unit ={
    println( "muliplierFun(1) value = " +  multiplierFun(1) )
    println( "muliplierFun(2) value = " +  multiplierFun(2) )
  }
  var factor =3
  val multiplierFun=(i:Int)=>i*factor
  /*Function references factor and reads its
   current value each time. If a function has no external references, then it is
    trivially closed over itself. No external context is required.*/
  }
object FunctionCurry{
  def callFunction: Unit = {
    /*Currying transforms a function that takes multiple parameters into a chain of functions, each taking a single parameter. Curried functions are defined with multiple parameter lists, as follows:

def strcat(s1: String)(s2: String) = s1 + s2*/
    val str1:String="Hello, "
    val str2:String ="World!"
    println("By calling function str1+str2 = "+strCat(str1)(str2))

  }
  def strCat(s1:String)(s2:String): String ={
    s1+s2
  }
}
