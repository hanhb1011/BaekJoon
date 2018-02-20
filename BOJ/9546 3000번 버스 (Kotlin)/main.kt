fun main(args:Array<String>){
    (1..readLine()!!.toInt()).forEach {var a=0.0;(1..readLine()!!.toInt()).forEach{a=(a+0.5)*2};println(a.toInt())}
}