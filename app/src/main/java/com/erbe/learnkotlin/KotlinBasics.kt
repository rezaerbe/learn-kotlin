package com.erbe.learnkotlin

fun main() {

    // Todo: Add new function

    /*
    This
    is
    multiline
    comments
     */

    // var is mutable variable
    var myName = "Reza RB"
    myName = "Reza eRBe"
    // val is immutable variable
    val myAge = 22;
    println("Hello $myName, Iam $myAge years old")

    // Integer Types
    val myByte: Byte = 12 // 8 bit
    val myShort: Short = 125 // 16 bit
    val myInt: Int = 123123123 // 32 bit
    val myLong: Long = 123_456_789_123_456 // 64 bit

    // Floating Point Types
    val myFloat: Float = 12.34F // 32 bit
    val myDouble: Double = 1.23456789  // 64 bit

    // Booleans (true or false)
    var isSunny: Boolean = true

    // Characters
    val letterChar = 'A'
    val digitChar = '1'

    // Strings
    val myStr = "Hello World"
    var firstCharInStr = myStr[0] // "H"
    val lastCharInStr = myStr[myStr.length - 1] // "d"

    // Arithmetic operators (+, - ,*, /, %)
    var result: Int
    var resultDouble: Double
    val a = 5.0
    val b = 3
    result = (a/b).toInt()
    resultDouble = a / b

    // Comparison operators (==, !=, <, >, <=, >=)

    // Assignment operators (+=, -=, *=, /=, %=)

    // Increment & Decrement operators (++, --)
    var myNum = 32
//    println(myNum) // 32
//    println(myNum++) // 32
//    println(++myNum) // 34
//
//    println(myNum) // 34
//    println(myNum--) // 34
//    println(--myNum) // 32

    var season = 3
    when(season) {
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }

    var month = 4
    when(month) {
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12, 1, 2 -> println("Winter")
        else -> println("Invalid Season")
    }

    var x : Any = 12.34
    when(x) {
        is Int -> println("$x is an Int")
        is Double -> println("$x is a Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }

    var y = 1
    while (y <= 5) {
        print(y)
        y++
    }
    println("\ndone")

    var z = 1
    do {
        print(z)
        z++
    } while (z <= 5)
    println("\ndone")

    for (num in 1..5) {
        print(num)
    }

    for (i in 6 until 10) {
        print(i)
    }

    for (i in 9 downTo 1 step 2) {
        print(i)
    }
}