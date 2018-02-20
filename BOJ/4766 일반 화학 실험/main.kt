fun main(args:Array<String>){
    var z=readLine()!!.toDouble()
    while(z!=999.0){
        val a= readLine()!!.toDouble()
        if(a==999.0)
            break
        println("%.2f".format(a-z))
        z=a
    }
}