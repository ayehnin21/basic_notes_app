package com.coder.mm.consoleapp.documentary
fun main(){
    var a=5
    var b=10
    println("Before swapping a is $a and b is $b")
    println(" ********************** \nAfter swapping")
    run { val temp = a; a = b; b = temp }
    println("a is $a and b is $b")
    swap(a,b)
    a=b.also { b=a }
    println("values after swapping ")
    println("a = $a b= $b")
}

fun swap(a:Int,b:Int){
    var a=a
    var b=b
    var temp=a
    a=b
    b=temp

    println("a is $a and b is $b")


}