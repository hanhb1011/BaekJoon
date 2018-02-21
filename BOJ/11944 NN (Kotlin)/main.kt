fun main(args:Array<String>){
    val a=readLine()!!.split(' ')
    var s=""
    (1..a[0].toInt()).forEach{s+=a[0]}
    println(s.substring(0,Math.min(a[0].toInt()*a[0].length,a[1].toInt())))
}