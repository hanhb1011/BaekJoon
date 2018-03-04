fun main(args:Array<String>){
    var s =""
    var max = 0
    var sum=0
    (1..readLine()!!.toInt()).forEach {
        val a=readLine()!!
        var b=readLine()!!.split(' ').map{it.toInt()}.toMutableList()
        var c=0
        while(b[1]>=b[0]){
            c++
            b[1]-=b[0]
            b[1]+=2
        }
        if(max<c) {
            s = a
            max = c
        }
        sum+=c
    }
    println("$sum\n$s")
}