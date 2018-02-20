fun main(args:Array<String>){
    (1..readLine()!!.toInt()).forEach{val a= readLine()!!.split(' ').map {it.toInt()}
        val b=Array(a[1],{0}); var c=0
        (1..a[0]).forEach{val n= readLine()!!.toInt()-1
           if(b[n]==0)
               b[n]=1
           else
               c++
        }
        println(c)
    }
}