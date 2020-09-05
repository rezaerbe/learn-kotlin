package com.erbe.learnkotlin

fun main() {

    val stringList: List<String> = listOf("asdf", "zxcv", "qwer")
    val mixedTypeList: List<Any> = listOf("asdf", 12, 3.4)

    for (value in mixedTypeList) {
        if (value is Int) println("Integer")
        else if (value is Double) println("Double")
        else if (value is String) println("String")
        else println("Unknown")
    }

    for (value in mixedTypeList) {
        when(value) {
            is Int -> println("Integer")
            is Double -> println("Double")
            is String -> println("String")
            else -> println("Unknown")
        }
    }

    // Smart Cast
    val obj1: Any = "I have a dream"
    if (obj1 !is String) println("Not a string")
    else println("String")

    // Explicit or unsafe casting
    val str1: String = obj1 as String
    println(str1.length)

//    val obj2: Any = 1234
//    val str2: String = obj2 as String
//    println(str2)

    // Explicit or safe casting
    val obj3: Any = 1234
    val str3: String? = obj3 as? String
    println(str3)
}