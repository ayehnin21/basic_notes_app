package com.coder.mm.consoleapp.lambda
fun main(){
    var num= calculateGrade(50)
    println(num)
}
val calculateGrade = { grade : Int ->
    when(grade) {
        in 0..40 -> "Fail"
        in 41..70 -> "Pass"
        in 71..100 -> "Distinction"
        else -> false
    }
}