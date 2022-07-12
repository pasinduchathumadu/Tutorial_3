import scala.io.StdIn.readInt
import scala.io.StdIn.readLine
object Q8{
    def main(args: Array[String]):Unit ={


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