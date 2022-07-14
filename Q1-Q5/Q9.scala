import scala.io.StdIn.readDouble
import scala.io.StdIn.readLine
object Q9{
    def main(args: Array[String]):Unit = {
        println("Smart calculator----------")
        println("Enter the first value:")
        val num1=readDouble()
        println("Enter the second value:")
        val num2=readDouble()
        println("Select option:")
        println("+,-*,/")
        println("Enter the option:")
        val option=readLine()
        println("Result is:"+calculator(num1,num2,option))
    }
    def calculator(x:Double,y:Double,z:String):Double=z match {
        case cal if z=="+"=>x+y
        case cal if z=="-"=>x-y
        case cal if z=="*"=>x*y
        case cal if z=="/"=>x/y
  }
}