fun main(args:Array<String>){
    Array(readLine()!!.toInt(), {readLine()!!}).forEach {println(Integer.parseInt(it,2))}
}