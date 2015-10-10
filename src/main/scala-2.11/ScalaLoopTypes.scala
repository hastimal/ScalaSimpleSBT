import scala.util.control.Breaks

/**
 * Created by hastimal on 10/2/2015.
 */
object ScalaLoopMain {
  def main(args: Array[String]) {
    ForLoop.callForLoop
    WhileLoop1.callWhile
    DoWhile.callDoWhile
    BreakFunction.callBreakFun


  }
}
object ForLoop{
  //For loop
  def callForLoop : Unit ={
    for (a <- 1 to 10) {
      println("This is to be printed 10 times usint to")
    }

    for (b <- 1 until (10)) {
      println("This is to be printed 10 times using until")
    }

    // // for loop execution with a range
    for (c <- 1 to 5; d <- 4 to 5) {
      println("value of c is " + c + " and d is " + d)
    }

    val numList = List(4, 12, 53, 74, 57, 60)
    for (e <- numList) {
      println("Value of e: " + e)
    }
/*for( var x <- List
      if condition1; if condition2...
   ){
   statement(s);
}*/
    // for loop execution with a collection
    //var f = 0; not required
    val numListFil = List(11,22,33,41,52,61,7,8,9,10)

    // for loop execution with multiple filters
    for( element <- numListFil  if element != 8; if element < 10 ){
      println( "Value of element in List is: " + element )
    }

    val numListYield = List(11,12,131,14,15,16,17,81,91,110);

    // for loop execution with a yield
    val retVal = for{ ab <- numListYield  if ab != 14; if ab < 30
    }yield ab
    // Now print returned values using another loop.
    for( finalval <- retVal){
      println( "Value of finalval from numListYield is : " + finalval );
    }

  }
}

object WhileLoop1{
  def callWhile: Unit = {
    /*The syntax of a while loop in Scala is:

while(condition){
   statement(s);
}*/var num1 =10
    while (num1<20) {
      println("Value of Number inside while loop is :"+num1)
      num1+=1
    }


  }
}
/*
Unlike while loop, which tests the loop condition at the top of the loop,
the do...while loop checks its condition at the bottom of the loop.
A do...while loop is similar to a while loop, except that a do...while loop
is guaranteed to execute at least one time.

Syntax:
The syntax of a do...while loop in Scala is:

do{
   statement(s);
}while( condition );

*/
object DoWhile{
  def callDoWhile: Unit ={
    var dovar=10
    do{
       println("Value of variable in do while loop id "+dovar)
      dovar+=1
    }while(dovar<12)

  }
}
/*When the break statement is encountered inside a loop,
the loop is immediately terminated and program control resumes
 at the next statement following the loop.*/
/*The syntax of a break statement is bit unusual but it works:

// import following package
import scala.util.control._

// create a Breaks object as follows
val loop = new Breaks;

// Keep the loop inside breakable as follows
loop.breakable{
    // Loop will go here
    for(...){
       ....
       // Break will go here
       loop.break;
   }
}*/
object BreakFunction{
  def callBreakFun(): Unit ={
    val numList1 = List(1,2,3,4,5)
    val numList2 = List(11,12,13)

    val outer = new Breaks
    val inner = new Breaks

    outer.breakable {
      for( a <- numList1){
        println( "Value of a: " + a )
        inner.breakable {
          for( b <- numList2){
            println( "Value of b: " + b )
            if( b == 12 ){
              inner.break
            }
          }
        } // inner breakable
      }
    } // outer breakable.
  }
}
