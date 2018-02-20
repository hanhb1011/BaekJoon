import kotlin.math.*
fun main(args:Array<String>){
    (1..readLine()!!.toInt()).forEach{
        val a=readLine()!!.split(' ').map{it.toInt()}.filterIndexed{i,_->i>0}.sortedDescending()
        println("Class $it\nMax ${a.max()}, Min ${a.min()}, Largest gap ${a.foldRightIndexed(0,{i,n,ac->if(i+1<a.size && abs(n-a[i+1])>ac) abs(n-a[i+1]) else ac})}")
    }
}