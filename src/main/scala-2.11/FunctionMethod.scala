/**
 * Created by hastimal on 10/2/2015.
 */
object MainMethod {
  def main(args: Array[String]) {
    println("Sum of number 13 and 12 is "+AddMethod.addInt(13,12))
    Hello.greet("Hastimal")
  }
}
object AddMethod{
  def addInt( a:Int, b:Int ) : Int = {
    var sum:Int = 0
    sum = a + b

    return sum
  }
}
object Hello{
  def greet(name:String):Unit={
  println("Hello Mr "+name)
  }
}
