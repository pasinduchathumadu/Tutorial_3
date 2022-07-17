object Q2{
    def main(args: Array[String]):Unit ={
        val celsius:Double=35.0  //initialize the celsius as double
        println("Fahrenheit temperature :"+convert(celsius)) //calling the function
    }
    def convert(temp:Double):Double={
        return temp*1.8000+32.00  //return fahrenheit
    }
}