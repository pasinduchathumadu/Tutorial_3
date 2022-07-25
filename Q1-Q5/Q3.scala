object Q3{
    def main(args: Array[String]): Unit = {
        val r:Int=5
        println("The volume of a sphere:"+volume(r))  //The answer is:523.5987755982
    }
    def volume(r:Int):Double={
        return math.Pi*r*r*r*(4.0/3.0); //This is the formula to evaluate the volume
    }
}