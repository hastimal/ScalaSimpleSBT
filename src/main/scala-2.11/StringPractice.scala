/**
 * Created by hastimal on 10/2/2015.
 */
object StringPractice {
  def main(args: Array[String]) {
    println(BasicTasks.printMethod)
    println("Size of the string as length is "+BasicTasks.LengthMeasure)
    println(BasicTasks.ConCatenating)
    BasicTasks.AddString
    BasicTasks.SplitString
  }
}
/*In Scala, as in Java, a string is an immutable object, that is, an object that
cannot be modified. On the other hand, objects that can be modified, like arrays,
are called mutable objects. Since strings are very useful objects, in the rest of
this section, we present the most important methods class java.lang.String defines.*/
object BasicTasks {
  def printMethod: String ={
    val greeting: String = "Hello, world!"
    greeting+" I am here"
  }
  def LengthMeasure: Int ={
    val greeting: String = "Hello, world!"
    val len =greeting.length
    len
  }
  def ConCatenating:String={
  //string1.concat(string2);
  val str="My name is ".concat("Hastimal")
    str
  }
  def AddString:Unit={
    val str1 = "Dot saw I was "
    val str2 =  "Tod"
    println("Dot " + str1 + str2)
  }
  def SplitString:Unit={
    val str="My name is ".concat("Hastimal")
    for(i<- 0 until str.length)
      println("Character at " + i + "th position is " + str.charAt(i) +" or ASCII "+str.charAt(i).toInt)
  }
  def CreateString:Unit={
    val floatVar = 12.456
    val intVar = 2000
    val stringVar = "Hello, Scala!"
    val fs = printf("The value of the float variable is " +
      "%f, while the value of the integer " +
      "variable is %d, and the string " +
      "is %s", floatVar, intVar, stringVar)
    println(fs)
  }


}