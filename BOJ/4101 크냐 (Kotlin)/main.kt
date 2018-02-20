fun main(args:Array<String>){
    while(true){
        val a= readLine()!!.split(' ').map {it.toInt()}
        if(a[0]==0&&a[1]==0)
            break
        println(if(a[0]>a[1])"Yes" else "No")
    }
}