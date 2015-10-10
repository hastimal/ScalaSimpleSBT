/**
 * Created by hastimal on 10/2/2015.
 */
/*Collections are containers of things. Those containers can be sequenced,
 linear sets of items like List, Tuple, Option, Map, etc.
 The collections may have an arbitrary number of elements or be
 bounded to zero or one element (e.g., Option).*/
object CollectionPractice {

  /*Collections may be strict or lazy. Lazy collections have elements
  that may not consume memory until they are accessed, like Ranges.
  Additionally, collections may be mutable (the contents of the reference
   can change) or immutable (the thing that a reference refers to is never
    changed). Note that immutable collections may contain mutable items.*/
  def main(args: Array[String]) {
    ListPtactice.ListAccess
    ListPtactice.CheckList
  }


}
object ListPtactice {
  def ListAccess: Unit = {

    // List of Strings
    val fruit: List[String] = List("apples", "oranges", "pears")
    println("printed direct list")
    println(fruit)
    for (i<- 0 to fruit.length-1){
      println((i+1)+"th member in List is "+fruit(i))
    }

    // List of Integers
    val nums: List[Int] = List(1, 2, 3, 4)

    // Empty List.
    val empty: List[Nothing] = List()

    // Two dimensional list
    val dim: List[List[Int]] =
      List(
        List(1, 0, 0),
        List(0, 1, 0),
        List(0, 0, 1)
      )
  }
  def CheckList: Unit ={
    val fruit = "apples" :: ("oranges" :: ("pears" :: Nil))
    val nums = Nil

    println( "Head of fruit : " + fruit.head )
    println( "Tail of fruit : " + fruit.tail )
    println( "Check if fruit is empty : " + fruit.isEmpty )
    println( "Check if nums is empty : " + nums.isEmpty )
  }

}