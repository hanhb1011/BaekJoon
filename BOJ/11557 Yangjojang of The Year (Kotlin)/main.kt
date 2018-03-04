fun main(args:Array<String>){
    (1..readLine()!!.toInt()).forEach{println(Array(readLine()!!.toInt(), {readLine()!!.split(' ')}).reduce { a,l -> if(a[1].toInt() > l[1].toInt()) a else l}[0])}
}