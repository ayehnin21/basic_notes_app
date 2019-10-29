package com.coder.mm.consoleapp.lambda

//val lambdaName : Type = { argumentList -> codeBody }

fun main(){
    val result=square(20)
    println("Result is $result")
   val res= cube(10)
    println(res)

}

var square={x:Int->x*x}

var cube={x:Int->x*x*x}