package com.coder.mm.consoleapp.lambda



fun main(){

    val stu=Student()
    stu.stuData{

        it.showName("Name")
    }

}



class Student {

    fun stuData(emitter:(emit:Emitter)->Unit){

    }

    interface Emitter{

        fun showName(name:String){

        }
    }

}