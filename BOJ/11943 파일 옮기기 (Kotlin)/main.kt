fun main(args:Array<String>){
    val a=Array(2,{readLine()!!.split(' ').map {it.toInt()}})
    println(Math.min(a[0][0]+a[1][1],a[0][1]+a[1][0]))
}