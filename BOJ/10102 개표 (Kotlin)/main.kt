fun main(args:Array<String>){
    var (a,b)=Pair(0,0)
    readLine();readLine()!!.forEach {if(it=='A') a++ else b++}
    println(if(a>b) "A" else if(a<b) "B" else "Tie")
}