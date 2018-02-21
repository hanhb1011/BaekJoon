fun main(args:Array<String>){
    val n=readLine()!!.toInt()
    var b=false
    (0..30).forEach {if(1.shl(it)==n) b=true}
    print(if(b) "1" else "0")
}