import scala.io.StdIn.readInt
object Q3{
    def main(args: Array[String]): Unit = {
        println("Enter the three values:")
        val num1=readInt()
        val num2=readInt()
        val num3=readInt()
        println("The largest number is:"+find_large_number(num1,num2,num3))
    }
    def find_large_number(x:Int,y:Int,z:Int):Int={
        if(x>y && x>z){
            return x
        }
        else if(y>x && y>z){
            return y
        }
        else{
            return z
        }
    }
}