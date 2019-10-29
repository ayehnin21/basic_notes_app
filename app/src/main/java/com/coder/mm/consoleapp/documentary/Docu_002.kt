package com.coder.mm.consoleapp.documentary

fun main(){
    val asc = Array(5) { i -> (i * i).toString() }
    asc.forEach { println(it) }

    var numAry=Array(5){j->(j-1).toString()}
    numAry.forEach {
        println(it)
    }
}