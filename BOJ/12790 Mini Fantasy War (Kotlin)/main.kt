fun main(args:Array<String>){
    (1..readLine()!!.toInt()).forEach {
        val a=readLine()!!.split(' ').map {it.toInt()}
        println((if(a[0]+a[4]<1) 1 else a[0]+a[4]) + (if(a[1]+a[5]<1) 5 else 5*(a[1]+a[5])) + (if(a[2]+a[6]<0) 0 else 2*(a[2]+a[6])) + 2*(a[3]+a[7]))
    }
}