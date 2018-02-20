fun main(args:Array<String>){
    val a= readLine()!!.split(' ').map{it.toInt()}
    var res=0
    var b=(a[0]+a[1])
    while(b>=a[2]){
        val t=b/a[2]
        res+=t
        b%=a[2]
        b+=t
    }
    println("$res")
}