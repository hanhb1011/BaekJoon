fun main(args:Array<String>){
    val m=readLine()!!.split(' ').map{it.toInt()}.foldIndexed (0, { i,a,s->if(i==0) a+s*1440 else if(i==1) a+s*60 else a+s})-16511
    println(if(m<0) -1 else m)
}