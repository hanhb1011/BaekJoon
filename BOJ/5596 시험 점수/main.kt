fun main(args:Array<String>){
    println(Array(2,{readLine()!!.split(' ').map {it.toInt()}.reduce {a,s->a+s}}).reduce {a,i->if(a<i)i else a})
}