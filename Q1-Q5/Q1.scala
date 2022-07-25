object Q1{
   def main(args: Array[String]):Unit = {
       val r:Int=5//initialize the radius
       println("Area of disk:"+area(r)) //The answer is:78.53981633974483
   }
   def area(r:Int):Double={
      return math.Pi*r*r  //This is the formula to compute the area
   }
}