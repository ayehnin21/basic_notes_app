package com.coder.mm.consoleapp.lambda

fun main() {
    whenPassingALambdaObject_thenCallTriggerLambda()
    invokeLambda { arg: Double ->
        arg == 10.2
    }
    whenPassingALambdaLiteral_thenCallTriggerLambda()
    invokeLambda {
        true
    }
    whenPassingALambdaLiteralOutsideBrackets_thenCallTriggerLambda()
    whenPassingAFunctionReference_thenCallTriggerLambda()

}

fun invokeLambda(lambda: (Double) -> Boolean): Boolean {
    return lambda(4.329)
}

fun whenPassingALambdaObject_thenCallTriggerLambda() {
    val lambda = { arg: Double ->
        arg == 4.329
    }

    val result = invokeLambda(lambda)

    assertTrue(result)
}
fun whenPassingALambdaLiteral_thenCallTriggerLambda() {
    val result = invokeLambda({
        true
    })

    assertTrue(result)
}
fun whenPassingALambdaLiteralOutsideBrackets_thenCallTriggerLambda() {
    val result = invokeLambda { arg -> arg.isNaN() }

    assertTrue(result)
}
fun whenPassingAFunctionReference_thenCallTriggerLambda() {
    val reference = Double::isFinite
    val result = invokeLambda(reference)

    assertTrue(result)
}

fun assertTrue(result: Boolean) {
    println(result)
}

