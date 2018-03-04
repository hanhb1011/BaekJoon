fun main(args:Array<String>){
    readLine()!!
    var a=0
    readLine()!!.split(' ').forEachIndexed {i,s-> if(i+1!=s.toInt())a++}
    print(a)
}