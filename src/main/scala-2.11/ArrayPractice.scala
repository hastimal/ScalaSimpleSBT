import Array._
/**
 * Created by hastimal on 10/2/2015.
 */
object ArrayPractice {
  def main(args: Array[String]) {
   SingleDimension.ArrayProcess
    MultiDimension.callMethod
  }
}
object SingleDimension{
  def ArrayProcess: Unit ={
    val myArray = Array(1.9, 2.9, 3.4, 3.5)
    //Print all array elements
    println("All elements are ")
    for(i<- myArray)
      println(i)
    println("Counted entities are "+myArray.length)
    //sum all
/*var total = 0.0;
      for ( i <- 0 to (myList.length - 1)) {
         total += myList(i);
      }*/
    var sum:Double=0.0
    for(i<- myArray)
     sum+=i
    println("Sum of all element is "+sum)
//Avaerage
    var total = 0.0
    for ( i <- 0 to myArray.length-1) {
      total += myArray(i)
    }
    println("Mean is "+total/(myArray.length))

    //finding largest
    var max= myArray(0)
    for (i<-1 to (myArray.length-1)) {
      if (myArray(i) > max)
        max = myArray(i)
    }
    println("Max is "+max)
    //Concatenate arrays
    val myList1 = Array(1.9, 2.9, 3.4, 3.5)
    val myList2 = Array(8.9, 7.9, 0.4, 1.5)

    val myList3 = concat(myList1, myList2)

    // Print all the array elements
    println("After concatenating all ")
    for ( x <- myList3 ) {
      println( x )
    }
    println("Array builded with Range ")
    val myList11 = range(10, 20, 2)
    val myList22 = range(10,20)

    // Print all the array elements
    for ( x <- myList11 ) {
      print( " " + x )
    }
    println()
    for ( x <- myList22 ) {
      print( " " + x )
    }
    println()
   }
}
object MultiDimension{
  def callMethod: Unit ={
    val myMatrix = ofDim[Int](3,3)

    // build a matrix
    for (i <- 0 to 2) {
      for ( j <- 0 to 2) {
        myMatrix(i)(j) = i+j
      }
    }

    // Print two dimensional array
    println("2D array is  ")
    for (i <- 0 to 2) {
      for ( j <- 0 to 2) {
        print(" " + myMatrix(i)(j))
      }
      println()
    }

  }
}

