package com.coder.mm.consoleapp.lambda

//Type.lambdaName(arguments)
fun main(){
    var result=extendString("Hello",5)
    println("Result is $result")
    extendInt(10.5,10)
}

fun extendString(arg: String, num: Int) : String {
    val another : String.(Int) -> String = { this + it }
    return arg.another(num)
}

fun extendInt(arg:Double,num:Int){
    val another:Int.(Double)->Unit={ print((this+it).toString())}
     num.another(arg)
}