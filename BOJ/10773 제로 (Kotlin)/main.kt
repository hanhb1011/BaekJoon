import java.util.*
fun main(args:Array<String>){
    var s=Stack<Int>()
    (1..readLine()!!.toInt()).forEach {
        var a= readLine()!!.toInt()
        if(a==0) s.pop() else s.push(a)}
    println(s.fold(0,{a,i->a+i}))
}