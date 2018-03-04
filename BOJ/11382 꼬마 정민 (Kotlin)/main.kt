fun main(args:Array<String>){
    print(readLine()!!.split(' ').map{it.toLong()}.reduce{a,i->a+i})
}