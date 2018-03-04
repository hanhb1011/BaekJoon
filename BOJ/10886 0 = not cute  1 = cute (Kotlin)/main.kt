fun main(args:Array<String>){
    var a=0
    var b=0
    Array(readLine()!!.toInt(),{readLine()!!}).forEach {if(it=="0")a++ else b++}
    print(if(a>b)"Junhee is not cute!" else "Junhee is cute!")
}