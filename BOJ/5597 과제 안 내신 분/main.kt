fun main(args:Array<String>){
    val a =Array(30,{_->0})
    (0..1).forEach {i->(0..if(i==0)27 else 29).forEach {j->if(i==0)a[readLine()!!.toInt()-1]=1 else{if(a[j]==0) println("${j+1}")}}}
}