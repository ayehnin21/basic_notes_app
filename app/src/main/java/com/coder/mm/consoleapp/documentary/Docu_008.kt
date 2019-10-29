package com.coder.mm.consoleapp.documentary

fun main(){

    val ae=AlsoExample().also {
        it.name="Hla Hla"
        var name=it.name
        println("Name is $name")
    }.showName()
}

class AlsoExample{
    var name=""
    fun showName(){
        println("Name is $name")
    }
}