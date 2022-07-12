import scala.io.StdIn.readInt
object Q2{
    def main(args: Array[String]):Unit ={
        println("Enter the number:")
        val number1=readInt()
        println("Enter the number:")
        val number2=readInt()
        println("The largest number:"+larger_number(number1,number2))
    }
    def larger_number(x:Int,y:Int):Int={
        if(x>y){
             return x
        }
        else{
              return y
        }
    }
}