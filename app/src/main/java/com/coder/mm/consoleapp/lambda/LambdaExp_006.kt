package com.coder.mm.consoleapp.lambda

fun main() {
    val ary = arrayOf(1, 2, 3, 4, 5)
    ary.forEach { item ->
        println(item * 100)
    }
    ary.forEach {
        println(it * 100)
    }
}