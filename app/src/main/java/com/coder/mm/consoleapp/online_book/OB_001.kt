package com.coder.mm.consoleapp.online_book

fun main() {
    val name = "Mg " to "Aung"
    println(name.first)
    println(name.second)
    println(name)

    println("*************************")
    /** ********************* */

    var capital = "Myanmar" to "Yangon"
    var (country, city) = capital
    println(country)
    println(city)

    println("************************")

    /** ********************* */
    val cityList = listOf("England" to "London", "Thailand" to "Bangok")
    for ((country, city) in cityList) {
        println("city of $country is $city ")
    }



}

