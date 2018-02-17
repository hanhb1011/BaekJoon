fun main(args: Array<String>){
    val n =Array(4,{i->readLine()!!.toInt()}).reduce({a,b->a+b})
    println("${n/60}\n${n%60}")
}
