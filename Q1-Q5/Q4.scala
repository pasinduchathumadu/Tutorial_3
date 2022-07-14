import scala.io.StdIn.readInt
object Q4{
    def main(args: Array[String]):Unit ={
        println("Total wholesale cost:"+total_wholesale_cost(60))
    }
    def bookprice(x:Int):Double={
        return x*24.95
    }
    def cost(x:Int):Double={
        return 3*x+(x-50)*0.75
    }
    def discount(amount:Double):Double={
        return amount*0.4
    }
    def total_wholesale_cost(x:Int):Double={
        return bookprice(x)+cost(x)-discount(bookprice(x))
    }
}