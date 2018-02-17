fun main(args:Array<String>){
    (0 until readLine()!!.toInt()).forEach {_->
        val s = readLine()!!
        var b = true
        (0..s.lastIndex/2).forEach {i->b=s[i]==s[s.lastIndex-i]}
        println(if(b) "Do-it" else "Do-it-Not")
    }
}