package com.erbe.learnkotlin

abstract class Mammal(private val name: String, private val origin: String, private val weight: Double) {

    abstract var maxSpeed: Double

    abstract fun run()
    abstract fun breath()

    fun displayDetails() {
        println("$name, $origin, $weight, $maxSpeed")
    }
}

class Human(name: String, origin: String, weight: Double, override var maxSpeed: Double) : Mammal(name, origin, weight) {

    override fun run() {
        println("Runs on two legs")
    }

    override fun breath() {
        println("Breath trough mouth or nose")
    }
}

class Elephant(name: String, origin: String, weight: Double, override var maxSpeed: Double): Mammal(name, origin, weight) {

    override fun run() {
        println("Runs on four legs")
    }

    override fun breath() {
        println("Breath through the trunk")
    }
}

fun main() {

    val human = Human("erbe", "indo", 70.0, 28.0)
    val elephant = Elephant("gajah", "india", 5400.0, 21.0)

    human.run()
    elephant.run()

    human.breath()
    elephant.breath()
}