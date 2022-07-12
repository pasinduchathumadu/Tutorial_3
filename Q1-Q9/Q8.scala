import scala.io.StdIn.readDouble
import scala.io.StdIn.readLine
object Q8{
    def main(args: Array[String]):Unit ={
        println("Enter the celsius temperature:")
        val scale=readDouble()
        println("The fahrenheit temperature:"+celsius_convert(scale))
        println("Enter the Fahrenheit temperature:")
        val temp=readDouble()
        println("The Celsius temperature:"+fahrenheit_convert(temp))

    }
    def celsius_convert(scale:Double):Double={
        val temp:Double=(9.0/5.0)*scale+32
        return temp
    }
    def fahrenheit_convert(temp:Double):Double={
        val scale:Double=(5.0/9.0)*(temp-32)
        return scale
    }
}