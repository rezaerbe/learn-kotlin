package com.erbe.learnkotlin

fun main() {
    myFunction()
    var result1 = addUp(5, 3)
    var result2 = avg(3.4, 1.2)
    println("$result1 $result2")

    var name: String = "eRBe"
    // name = null -> ERROR
    var nullableName: String? = "eRBe"
    // nullableName = null

    var len1 = name.length
    var len2 = nullableName?.length
    nullableName?.let { println(it.length) }

    // ?: Elvis Operator
    val other = nullableName ?: "Guest"
    println("name is $other")

    println(nullableName!!.toLowerCase())

//    if (nullableName != null) {
//        var len2 = nullableName.length
//    } else {
//        null
//    }
}

fun addUp(a: Int, b: Int) : Int {
    return a+b
}

fun avg(a: Double, b: Double) : Double {
    return a/b
}

fun myFunction() {
    println("Called from myFunction")
}