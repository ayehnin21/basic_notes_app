package com.coder.mm.consoleapp.documentary

import kotlin.random.Random

fun main(){
    //val number = Random.nextInt(100)
    val number=50
    val evenOrNull = number.takeIf { it % 2 == 0 }
    val oddOrNull = number.takeUnless { it % 2 == 0 }
    println("even: $evenOrNull, odd: $oddOrNull")

    val str = "Hello"
    val caps = str.takeUnless { it.isNotEmpty() }?.toUpperCase()
    val low=str.takeIf { it.isNotEmpty()}?.toLowerCase()
    println("Upper case is $caps and Lower case is $low")

}