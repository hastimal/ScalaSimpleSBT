/**
 * Created by hastimal on 10/9/2015.
 */
/**
 * 1 Scala Lists
Scala's List[T] is a linked list of type T.

2	Scala Sets
A set is a collection of pairwise different elements of the same type.

3	Scala Maps
A Map is a collection of key/value pairs. Any value can be retrieved based on its key.

4	Scala Tuples
Unlike an array or list, a tuple can hold objects with different types.

5	Scala Options
Option[T] provides a container for zero or one element of a given type.

6	Scala Iterators
An iterator is not a collection, but rather a way to access the elements of a collection one by one.*/
object ScalaCollections {
  def main(args: Array[String]) {
/**Collections may be strict or lazy. Lazy collections have elements
  * that may not consume memory until they are accessed, like Ranges.
  * Additionally, collections may be mutable (the contents of the reference
  * can change) or immutable (the thing that a reference refers to is never changed).
  * Note that immutable collections may contain mutable items.*/
 ListCollection.ListAccess
    SetsCollection.SetAccess
    SetsCollection.SetAdd
    MapCollection.MapAccess
    MapCollection.MapAdd
    TupleCollection.TupleAccess
    TupleCollection.TupleAdd
    IteratorIsNotCollection.IteratorAccess
  }
}
/**Scala Lists are quite similar to arrays which means,
  * all the elements of a list have the same type but there are
  * two important differences. First, lists are immutable,
  * which means elements of a list cannot be changed by
  * assignment. Second, lists represent a linked list whereas
  * arrays are flat.*/
object ListCollection{
  def ListAccess: Unit ={
    // List of Strings
    val fruit: List[String] = List("apples", "oranges", "pears")
    // List of Integers
    val nums: List[Int] = List(1, 2, 3, 4)

    println("Fruit :" +fruit)
    println( "Before reverse fruit : " + fruit )

    println( "After reverse fruit : " + fruit.reverse )
    println( "After reverse fruit with upper letter using Map  : " + fruit.map(x=>x.toUpperCase).reverse )
    println( "fruit with upper letter using flatMap : " + fruit.flatMap(x=>x.toUpperCase) )
    println("Numbers :"+nums)

    //val squares = List.tabulate(6)(n => n*n)//// Creates 5 elements using the given function.
    val squares =nums.map(x => x*x)
    println("Squares :"+squares)
    println( "sqquares using flatMap : " + squares.flatMap(x=>x.toString.toUpperCase) )
    println( "sqquares using Map : " + squares.map(x=>x.toString.toUpperCase) )

    println( "fruits using flatMap : " + fruit.flatMap(x=>x.toUpperCase) )
    println( "fruits using Map : " + fruit.map(x=>x.toUpperCase) )

    println( "fruits using flatMap : " + fruit.flatMap(x=>x) )
    println( "fruits using Map : " + fruit.map(x=>x) )

//    println( "nums using flatMap : " + nums.flatMap() )
//    println( "nums using Map : " + nums.map(x=>x) )


  }
}

object SetsCollection{
  def SetAccess: Unit ={
    /**Scala Set is a collection of pairwise different elements of the same
      * type. In other words, a Set is a collection that contains no duplicate elements. There are two kinds of Sets, the immutable and the mutable. The difference between mutable and immutable objects is that when an object is immutable, the object itself can't be changed.

By default, Scala uses the immutable Set. If you want to use the mutable Set, you'll have to import scala.collection.mutable.Set class explicitly. If you want to use both mutable and immutable sets in the same, then you can continue to refer to the immutable Set as Set but you can refer to the mutable Set as mutable.Set. Following is the example to declare immutable Sets as follows:

// Empty set of integer type
var s : Set[Int] = Set()

// Set of integer type
var s : Set[Int] = Set(1,3,5,7)

or

var s = Set(1,3,5,7)*/

    val fruit = Set("apples", "oranges", "pears")
    val nums: Set[Int] = Set()

    println( "Head of fruit : " + fruit.head )
    println( "Tail of fruit : " + fruit.tail )
    println( "Check if fruit is empty : " + fruit.isEmpty )
    println( "Check if nums is empty : " + nums.isEmpty )
  }
  def SetAdd: Unit ={

    val fruit1 = Set("apples", "oranges", "pears")
    val fruit2 = Set("mangoes", "banana")

    // use two or more sets with ++ as operator
    var fruit = fruit1 ++ fruit2
    println( "fruit1 ++ fruit2 : " + fruit )

    // use two sets with ++ as method
    fruit = fruit1.++(fruit2)
    println( "fruit1.++(fruit2) : " + fruit )


    val num = Set(5,6,9,20,48,45)

    // find min and max of the elements
    println( "Min element in Set(5,6,9,20,48,45) : " + num.min )
    println( "Max element in Set(5,6,9,20,48,45) : " + num.max )
    // find common elements between two sets
    val num1 = Set(5,6,9,20,30,45)
    val num2 = Set(50,60,9,20,35,55)
    println( "common elements between two sets Set(5,6,9,20,30,45) and Set(50,60,9,20,35,55)" )
    println( "num1.&(num2) : " + num1.&(num2) )
    println( "num1.intersect(num2) : " + num1.intersect(num2) )
  }
}
/**Scala map is a collection of key/value pairs. Any value can be
  * retrieved based on its key. Keys are unique in the Map, but values need
  * not be unique. Maps are also called Hash tables. There are two kinds of
  * Maps, the immutable and the mutable. The difference between mutable and
  * immutable objects is that when an object is immutable, the object itself
  * can't be changed.

By default, Scala uses the immutable Map. */
object MapCollection{
  def MapAccess: Unit ={
    // A map with keys and values.
    val colors = Map("red" -> "#FF0000",
      "azure" -> "#F0FFFF",
      "peru" -> "#CD853F")

    val nums: Map[Int, Int] = Map()
/*keys	This method returns an iterable containing each key in the map.
values	This method returns an iterable containing each value in the map.*/
    println( "Keys in colors : " + colors.keys )
    println( "Values in colors : " + colors.values )
    println( "Keys-Values in colors : " + colors )
    println( "Keys-Values in colors seq : " + colors.seq )

    println( "Check if colors is empty : " + colors.isEmpty )
    println( "Check if nums is empty : " + nums.isEmpty )
  }

  def MapAdd: Unit = {
    val colors1 = Map("red" -> "#FF0000",
      "azure" -> "#F0FFFF",
      "peru" -> "#CD853F")
    val colors2 = Map("blue" -> "#0033FF",
      "yellow" -> "#FFFF00",
      "red" -> "#FF0000")

    // use two or more Maps with ++ as operator
    var colors = colors1 ++ colors2
    println( "colors1 ++ colors2 : " + colors )

    // use two maps with ++ as method
    colors = colors1.++(colors2)
    println( "colors1.++(colors2)) : " + colors )

    colors.keys.foreach{ i =>
      print( "Key = " + i )
      println(" Value = " + colors(i) )}

    if( colors.contains( "red" )){
      println("Red key exists with value :"  + colors("red"))
    }else{
      println("Red key does not exist")
    }
    if( colors.contains( "maroon" )){
      println("Maroon key exists with value :"  + colors("maroon"))
    }else{
      println("Maroon key does not exist")
    }


  }
}
/**Scala tuple combines a fixed number of items together so that they
  * can be passed around as a whole. Unlike an array or list, a tuple can
  * hold objects with different types but they are also immutable.*/

object TupleCollection{
  def TupleAccess: Unit ={
    //val t = (1, "hello", Console)
    /**Scala defines a number of element-access methods. Given the following definition:

val t = (4,3,2,1)
To access elements of a tuple t, you can use method t._1 to access the first element, t._2 to access the second, and so on. For example, the following expression computes the sum of all elements of t:

val sum = t._1 + t._2 + t._3 + t._4*/
    val t = (4,3,2,1)

    val sum = t._1 + t._2 + t._3 + t._4

    println( "Sum of elements: "  + sum )

    val tp = (41,10,2,12)

    val sumTp = tp._1 + tp._2 + tp._3 + tp._4
    val sumTpChar=sumTp.toChar
    println( "Final tuple in ASCII: "  + sumTpChar+" and in numerical "+sumTp )
    //Iterate over the Tuple:
    tp.productIterator.foreach{ i =>println("Value = " + i )}

  }
  // Tuple.toString() method to concatenate all the elements of the tuple into a string
  def TupleAdd: Unit = {
    val t = new Tuple3(1, "hello", Console)

    println("Concatenated String: " + t.toString() )
    //Tuple.swap method to swap the elements of a Tuple2.
    val tp = new Tuple2("Scala", "hello")

    println("Swapped Tuple: " + tp.swap )
  }
}
object IteratorIsNotCollection{
  def IteratorAccess: Unit ={
    /**An iterator is not a collection, but rather a way to access the
      *  elements of a collection one by one. The two basic operations on an
      *  iterator it are next and hasNext. A call to it.next() will return
      *  the next element of the iterator and advance the state of the iterator.*/
    val it = Iterator("a", "number", "of", "words")

    while (it.hasNext){
      println(it.next())
    }

    val ita = Iterator(20,40,2,50,69, 90)
    val itb = Iterator(20,40,2,50,69, 90)

    println("Maximum valued element in Iterator(20,40,2,50,69, 90) : " + ita.max )
    println("Minimum valued element in Iterator(20,40,2,50,69, 90): " + itb.min )

  }
  // Tuple.toString() method to concatenate all the elements of the tuple into a string
  def TupleAdd: Unit = {
    val t = new Tuple3(1, "hello", Console)

    println("Concatenated String: " + t.toString() )
    //Tuple.swap method to swap the elements of a Tuple2.
    val tp = new Tuple2("Scala", "hello")

    println("Swapped Tuple: " + tp.swap )
  }
}
