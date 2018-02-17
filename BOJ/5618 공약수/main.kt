fun main(args:Array<String>){
    readLine()
    var a = readLine()!!.split(' ').sorted()
    (1..a[0].toInt()).forEach {n-> var b=true;(0 until a.size).forEach { i->if(a[i].toInt()%n!=0) b=false;};if(b) println(n)}
}