package com.coder.mm.consoleapp.documentary

fun main(){

    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }//avocado,apple
        .sortedBy { it }//apple,avocado
        .map { it.toUpperCase() }//APPLE,AVOCADO
        .forEach { println(it) }//APPLE,AVOCADO
}