package com.coder.mm.consoleapp.documentary

fun main(){
    val p=Customer("Mg Mg",21).let{
        println(it)
        println(it.age)
        println(it.name)
    }
    val p1=Customer("Su Su",13).apply {
        println(this)
        println(this.name)
        println(this.age)

    }.showName()
}

data class Customer(var name:String,var age:Int){
    fun showName(){
        println("Name is $name and age $age")
    }
}