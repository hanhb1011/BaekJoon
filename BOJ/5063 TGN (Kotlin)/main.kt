fun main(args:Array<String>){
    (1..readLine()!!.toInt()).forEach {val a= readLine()!!.split(' ').map {it.toInt()}
        println(if(a[0]<a[1]-a[2]) "advertise" else if(a[0]>a[1]-a[2])"do not advertise" else "does not matter")}
}