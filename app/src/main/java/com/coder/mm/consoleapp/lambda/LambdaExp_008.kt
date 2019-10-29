package com.coder.mm.consoleapp.lambda

fun main() {

    callLambda { arg: Double ->
        arg == 10.0
    }
}

fun callLambda(lamb: (Double) -> Boolean){
    lamb(10.5)
}