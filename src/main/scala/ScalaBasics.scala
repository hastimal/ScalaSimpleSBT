/**
 * Created by hastimal on 10/10/2015.
 */
import scala.collection.immutable.Map
object ScalaBasics {
  def main(args: Array[String]) {
    val numbersList = List(1, 2, 3, 4)
    print("numbers in List are :")
    numbersList.foreach(i=>print(" "+i))

    print("\nsquaresby map are :")
    val squares = numbersList.map(x=>x*x)
    squares.foreach(i=>print(" "+i))

//Sets :Sets have no duplicates
    val numbersSet =Set(1, 1, 2)
    print("\nnumbers in Set are :")
    numbersSet.foreach(i=>print(" "+i))

    //Tuple    A tuple groups together simple logical collections
    // of items without using a class.

    val tuple = ("localhost", 80)
    print("\nnumbers in Tuple are :")
    print("hostname is "+tuple._1+" and port number is "+tuple._2)
  //Tuples fit with pattern matching nicely.

//    tuple match {
//      case ("localhost", port) =>("LAN",60)
//      case (host, port) =>("WAN",90)
//    }
    println()
    println(tuple)

    //Maps
//    It can hold basic datatypes.
//
//      Map(1 -> 2)
//    Map("foo" -> "bar")
//    This looks like special syntax but remember back to our discussion
    // of Tuple that -> can be use to create Tuples
    var numbersMap = Map("one" -> 1, "two" -> 2)
    println(numbersMap.get("one"))
    println(numbersMap.get("two"))
    // We want to multiply the number by two, otherwise return 0.
   // Pattern matching fits naturally with Option.

    val votes = Seq(("scala", 1), ("java", 4), ("scala", 10), ("scala", 1), ("python", 10))
    val orderedVotes = votes
      .groupBy(_._1)
      .map { case (which, counts) =>
        (which, counts.foldLeft(0)(_ + _._2))
      }.toSeq
      .sortBy(_._2)
      .reverse


    println(orderedVotes)



    val votes1 = Seq(("scala", 1), ("java", 4), ("scala", 10), ("scala", 1), ("python", 10))
    val orderedVotes1 = votes1
      .groupBy(_._1)
      .map { case (name,total)=>(name,total.foldLeft(0)(_+_._2))}.toSeq.sortBy(_._1)

    println(orderedVotes1)


    val votes2 = Map("scala"->1, "java"->4,"scala"-> 10,"scala"-> 1,"python"->10)
    val orderedVotes2 = votes2
      .groupBy(_._1)
      .map { case (name,total)=>(name,total.foldLeft(0)(_+_._2))}.toSeq.sortBy(_._1)

    println(orderedVotes2)

  }
}
