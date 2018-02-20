fun main(args:Array<String>){
    (1..readLine()!!.toInt()).forEach {val a= readLine()!!.split(' ')
        var s="Distances: "
        (0 until a[0].length).forEach {i-> s+="${if(a[0][i]>a[1][i]) 26-(a[0][i]-a[1][i]) else (a[1][i]-a[0][i])} "}
        println(s)
    }
}