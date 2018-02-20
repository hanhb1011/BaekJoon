fun main(args:Array<String>){
    (1..readLine()!!.toInt()).forEach{val s=readLine()!!;println("${s[0]}${s[s.lastIndex]}")}
}