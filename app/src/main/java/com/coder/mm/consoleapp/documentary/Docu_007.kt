package com.coder.mm.consoleapp.documentary

import kotlin.random.Random

fun main(){

    val ranNum= getRandomInt()
    println("Random number is $ranNum")
    println("***************************************")
    val ranNum1= getRandomInt1()
    println("Random number1 is $ranNum1")
}

fun getRandomInt(): Int {
    return Random.nextInt(100).also {
        println("getRandomInt() generated value ${it.minus(1)}")
    }
}

val i = getRandomInt()

fun getRandomInt1(): Int {
    return Random.nextInt(100).also { value ->
        println("getRandomInt() generated value $value")
    }
}

val i1 = getRandomInt1()