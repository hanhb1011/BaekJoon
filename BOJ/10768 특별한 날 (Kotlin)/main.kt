fun main(args:Array<String>){
    val a=Array(2,{ readLine()!!.toInt()}).reduce { a,i->a*31+i}
    print(if(a==80)"Special" else if(a>80) "After" else "Before")
}