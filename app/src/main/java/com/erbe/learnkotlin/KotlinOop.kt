package com.erbe.learnkotlin

import java.lang.IllegalArgumentException

fun main() {
//    var erbe = Person("Reza", "RB", 22)
//    var john = Person()
//    var johnPeterson = Person(lastName = "Peterson")
//    erbe.hobby = "Swimming"
//    erbe.stateHobby()
//
//    var myCar = Car()
//    println("${myCar.myModel} ${myCar.myBrand}")
//
//    val user1 = User(1, "Erbe")
//    user1.name = "Reza"
//    val name = user1.name
//    println(name)
//
//    val updateUser = user1.copy(name = "Reza RB")
//    println(user1)
//    println(updateUser)
//
//    println(updateUser.component1()) // 1
//    println(updateUser.component2()) // Reza RB
//
//    val (id,nameok) = updateUser
//    println("$id, $nameok")

    var myCar = Mobile(200.0,"A3", "Audi")
    var myECar = ElectricMobile(250.0,"S-Model", "Tesla", 85.0)
    myCar.drive(200.0)
    myECar.chargerType = "Type2"
    myECar.drive(200.0)
    myECar.extendRange(300.0)
    myECar.drive()
    myECar.brake()
}

interface Drivable {
    val maxSpeed: Double
    fun drive(): String
    fun brake() {
        println("The drivable is braking")
    }
}

open class Mobile(override val maxSpeed: Double, val name: String, val brand: String) : Drivable{

    open var range: Double = 0.0

    fun extendRange(amount: Double) {
        if (amount > 0)
            range += amount
    }

    // override fun drive(): String = "Driving the interface drive"

    override fun drive(): String {
        return "Driving the interface drive"
    }

    open fun drive(distance: Double) {
        println("Drove for $distance KM")
    }
}

class ElectricMobile(maxSpeed: Double, name: String, brand: String, batteryLife: Double): Mobile(maxSpeed, name, brand) {

    override var range = batteryLife * 6

    var chargerType = "Type1"

    override fun drive(distance: Double) {
        println("Drove for $distance KM on electricity")
    }

    override fun drive(): String {
        return "Drove for $range KM on electricity"
    }

    override fun brake() {
        super.brake()
        println("brake inside of electric car")
    }
}

data class User(val id: Long, var name: String)

class Car() {

    lateinit var owner: String

    val myBrand: String = "BMW"

    get() {
        return field.toLowerCase()
    }

    var maxSpeed: Int = 250
    set(value) {
        field = if (value > 0) value else throw IllegalArgumentException("Max speed cannot be less than 0")
    }

    var myModel: String = "M5"
    private set

    init {
        this.owner = "Reza"
        this.myModel = "M3"
    }
}

class Person(firstName: String = "John", lastName: String = "Doe") {

    // Member Variables - Properties
    var age: Int? = null
    var hobby: String = "Watch Course"
    var firstName: String? = null

    // Initializer Block
    init {
        this.firstName = firstName
        println("initialize a new person object with " +
        "firstname : $firstName and lastname : $lastName")
    }

    constructor(firstName: String, lastName: String, age: Int):
            this(firstName, lastName) {
        this.age = age
        println("initialize a new person object with " +
                "firstname : $firstName and lastname : $lastName and $age years old")
    }

    // Member Functions - Methods
    fun stateHobby() {
        println("$firstName hobby is $hobby")
    }
}