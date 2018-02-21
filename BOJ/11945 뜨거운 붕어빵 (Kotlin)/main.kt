fun main(args:Array<String>){
    val a=readLine()!!.split(' ').map{it.toInt()}
    (1..a[0]).forEach {if(a[1]>0)println(readLine()!!.reversed())}
}