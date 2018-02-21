fun main(args:Array<String>){
    val a=readLine()!!.split(' ').map {it.toInt()}
    println(Array(a[1],{0}).mapIndexed {idx,_->((idx+1)*a[0]).toString().reversed().toInt()}.max())
}