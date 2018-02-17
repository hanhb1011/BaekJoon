import kotlin.math.*
fun main(args:Array<String>){
    var n =Array(5,{_->readLine()!!.toDouble()})
    println((n[0]-maxOf(ceil(n[1]/n[3]),ceil(n[2]/n[4]))).toInt())
}
