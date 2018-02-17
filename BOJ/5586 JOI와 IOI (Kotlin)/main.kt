fun main(args: Array<String>){
    val s = readLine()!!
    var (a,b) = Pair(0,0)
    for (i in 0..s.length-3) {
        val t = String(charArrayOf(s[i],s[i+1],s[i+2]))
        a+=if(t.equals("JOI")) 1 else 0
        b+=if(t.equals("IOI")) 1 else 0
    }
    println("$a\n$b")
}
