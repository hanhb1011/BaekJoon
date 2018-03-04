import java.lang.Math.*
fun main(args:Array<String>){
    (1..readLine()!!.toInt()).forEach {var a= readLine()!!.split(' ').map {it.toInt()}
    println("${(ceil(a[0]/a[1].toDouble())).toInt()}")}
}