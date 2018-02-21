import kotlin.math.*
fun main(args:Array<String>){
    print(Array(readLine()!!.toInt(),{readLine()!!.toInt()}).fold(0,{a,n->a+(n/10).toDouble().pow(n%10).toInt()}))
}