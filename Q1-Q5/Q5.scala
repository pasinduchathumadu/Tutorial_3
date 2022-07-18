object Q5{
    def main(args: Array[String]): Unit ={
        val time:Int=easy_pace(2)+easy_pace(2)+tempo(3)
        println("The total running time:"+time+" min")
    }
    def easy_pace(x:Int):Int={
        return x*8
    }
    def tempo(y:Int):Int={
        return y*7
    }
}