fun main(args:Array<String>){
    var r=0
    val a=Array(6,{ readLine()!!.toInt()})
    (0..1).forEach {i->(i+1..3).forEach {j->(j+1..3).forEach {k->r=Math.max(r,a[i]+a[j]+a[k])}}}
    println(r+Math.max(a[4],a[5]))
}
