fun main(args:Array<String>){
    val a = Array(5,{ readLine()!!.toInt()})
    val c = if(a[4]<a[2])a[1] else a[1]+(a[4]-a[2])*a[3]
    println(if(a[0]*a[4] < c) a[0]*a[4] else c)
}