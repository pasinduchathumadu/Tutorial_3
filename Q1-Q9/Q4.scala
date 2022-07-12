import scala.io.StdIn.readInt
object Q4{
    def main(args: Array[String]):Unit ={
        println("Enter the number:")
        val num=readInt()
        println("The given number is :"+check_number(num))
    }
    def check_number(i:Int):String= i%2 match{
        case 0=>"Even"
        case _=>"Odd"
  }
}