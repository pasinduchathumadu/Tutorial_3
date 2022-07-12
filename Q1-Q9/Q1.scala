import scala.io.StdIn.readInt
object Q1{
    def main(args: Array[String]):Unit = {
        println("Enter the number:")
        val num=readInt()
        println("The absolute value:"+absolute(num))
    }
    def absolute(num:Int):Int={
    if(num<0){
      return -num
    }
    else{
      return num
    }
  }
}