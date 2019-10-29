package com.coder.mm.consoleapp.documentary

class Student:School {
    override val prop: Int
        get() = 100
}

fun main(){
    val s=Student()
    s.foo()
    println(s.prop)
    println(s.propertyWithImplementation)
    val p=Person()
    println(p.name)

}

interface Named {
    val name: String
    //get()="Hello"
}

class Person : Named {
    override val name: String
        get() = "$firstName $lastName"
    val firstName: String = "Mg"
    val lastName: String = "Mg"

    

}