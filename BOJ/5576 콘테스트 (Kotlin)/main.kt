fun main(args: Array<String>){
    var a =Array(2,{r->Array(10, {i-> readLine()!!.toInt()}).sortedArray().reversedArray()})
    println("${a[0][0]+a[0][1]+a[0][2]}\n${a[1][0]+a[1][1]+a[1][2]}")
}
