package com.coder.mm.consoleapp.documentary

fun main(){
    say()
    val st=Street("Sakura")
    st.run {
        println(this)
    }
}
fun say() {
    val str = "Hello"
    str.run {
        println("The receiver string length: $length")
    }
    str.let {
        println("The receiver string's length is ${it.length}")
    }
}
data class Street(val name:String)