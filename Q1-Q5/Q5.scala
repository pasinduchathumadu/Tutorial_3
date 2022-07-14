object Q5{
    def main(args: Array[String]): Unit ={
        val time:Double=easy_pace(2)+easy_pace(2)+tempo(3)
        println("The total running time:"+time+" min")
    }
    def easy_pace(x:Int):Double={
        return x/8.0
    }
    def tempo(y:Int):Double={
        return y/7.0
    }
}