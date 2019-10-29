package com.coder.mm.consoleapp.documentary

data class Teacher(var id: Int = 0, var name: String = "", var surname: String = "") {
    fun id(anId: Int): Teacher = apply { id = anId }
    fun name(aName: String): Teacher = apply { name = aName }
    fun surname(aSurname: String): Teacher = apply { surname = aSurname }
}

fun main(){
    val teacher = Teacher()
        .id(1000)
        .name("AA")
        .surname("Sr.Jhon")

    println(teacher.id)
    println(teacher.name)
    println(teacher.surname)
}
