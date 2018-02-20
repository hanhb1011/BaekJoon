fun main(args:Array<String>){
    val r=readLine()!!.split(' ').map {it.toInt()}
    var s=0; var c=0;
    (1..45).forEach {i->(1..i).forEach {c++;s+=if(r[0]<=c&&c<=r[1]) i else 0}}
    println(s)
}