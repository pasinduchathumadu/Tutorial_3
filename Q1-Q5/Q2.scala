import scala.io.StdIn.readInt
object Q2{
    def main(args: Array[String]):Unit ={
        val celsius:Double=35.0
        println("Fahrenheit temperature :"+convert(celsius))
    }
    def convert(temp:Double):Double={
        return temp*1.8000+32.00
    }
}