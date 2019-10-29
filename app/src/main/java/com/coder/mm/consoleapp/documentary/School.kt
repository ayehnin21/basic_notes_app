package com.coder.mm.consoleapp.documentary

open interface School {
    val prop: Int // abstract

    val propertyWithImplementation: String
        get() = "foo"

    fun foo() {
        print(prop)
    }
}