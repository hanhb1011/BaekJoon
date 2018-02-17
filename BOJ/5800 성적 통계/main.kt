import kotlin.math.*
fun main(args:Array<String>){
    (1..readLine()!!.toInt()).forEach{it->
        var a =readLine()!!.split(' ').map{n->n.toInt()}
        a = a.subList(1,a.size).sortedDescending()
        println("Class $it\nMax ${a.max()}, Min ${a.min()}, Largest gap ${a.foldRightIndexed(0,{i,n,acc -> if(i+1<a.size && abs(n-a[i+1])>acc) abs(n-a[i+1]) else acc })}")
    }
}