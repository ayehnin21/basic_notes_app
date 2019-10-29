package com.coder.mm.consoleapp.documentary

fun main(){
    val numbers = mutableListOf("one", "two", "three")
    with(numbers) {
        println("'with' is called with argument $this")
        println("It contains $size elements")
    }
    with(Demo()){
        name="Mg Mg"
        println(this.name)
    }
}
class Demo{
    var name=""
}