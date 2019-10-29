package com.coder.mm.consoleapp.documentary

fun main(){
    val numbers = mutableListOf("one", "two", "three", "four", "five")
    val n=numbers.map { it.length }.filter { it > 3 }.let(::println)
    //println(n)
}