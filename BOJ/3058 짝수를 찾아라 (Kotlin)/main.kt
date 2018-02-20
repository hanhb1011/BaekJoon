fun main(args:Array<String>){
    (1..readLine()!!.toInt()).forEach {val a=readLine()!!.split(' ').map{it.toInt()}.filter{it%2==0};
        println("${a.reduce {a,i->a+i}} ${a.min()}")}
}