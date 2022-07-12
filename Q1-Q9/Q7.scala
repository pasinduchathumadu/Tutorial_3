import scala.io.StdIn.readInt
object Q7{
    def main(args: Array[String]):Unit = {
        println("Enter the particular number related to the month:")
        val month_num=readInt()
        println("Season:"+month(month_num))
    }
    def month(x:Int):String={
        if(x==1||x==2||x==12){
            return "Winter"
        }
        else if(x==3||x==4||x==5){
            return "Spring"
        }
        else if(x==6||x==7||x==8){
            return "Summer"
        }
        else if(x==9||x==10||x==11){
            return "Autumn"
        }
        else{
            return "Bogus month"
        }
    }
}