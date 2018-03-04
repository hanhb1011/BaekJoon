fun main(args:Array<String>){
    print(readLine()!!.split(" ").filter{it.isNotEmpty()}.map{it.toInt()}.reduce{a,i->a+i})
}