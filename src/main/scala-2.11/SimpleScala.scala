/**
 * Created by hastimal on 9/30/2015.
 */
object SimpleScala {
  /* This is my first java program.
   * This will print 'Hello World' as the output
   */
 //*In Scala we create variables either using the val keyword or the var keyword.
    //Using val we get a read-only variable that�s immutable.
   // In other words, once it�s value is assigned it can�t change.
    //If we on the other hand create a variable using the var keyword we get a mutable variable whose value we can later change.*/
  def main(args: Array[String]) {
  //simple variable print
    val  s = " hello I am in main" ;  println(s)
    println("Hello, world!") // prints Hello World

    //can print triple or pair  variables
    val (fname:String,lname:String,age:Int) = Triple("Kapil", "Sharma",29)
    println("Mr "+ fname +" "+ lname +"is a comedian and his age is "+age)

    //can call direct method
    IfElseMethod()
    WhileLoop.valueFun()

  }
  def IfElseMethod() {
    val x = 30
    if( x == 10 ){
      println("Value of X is 10")
    }else if( x == 20 ){
      println("Value of X is 20")
    }else if( x == 30 ){
      println("Value of X is 30")
    }else{
      println("This is else statement")
    }
  }

  val  s = " hello I am outside main" ;  println(s)

}
object WhileLoop {

  // An infinite loop.
  //    while (true) {
  //      println("Value of a: " + a);
  //    }
  def valueFun():Unit ={
  var a:Int =10
    while (a == 10) {
    println ("Value of a: " + a)
    a += 1
  }
  }
  /*object AddMethod{
  def addInt( a:Int, b:Int ) : Int = {
    var sum:Int = 0
    sum = a + b

    return sum
  }
}*/

}
