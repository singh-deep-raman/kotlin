package lecture8

import kotlin.random.Random

fun main(args: Array<String>) {
    // a random integer
    var randomNumber = Random.nextInt()
    println("Number is $randomNumber")

    // random number till
    randomNumber = Random.nextInt(10)
    println("Number is $randomNumber")

    // random number with range
    randomNumber = Random.nextInt(100, 200)
    println("Number is $randomNumber")

    // a random double
    val randomDoubleNumber = Random.nextDouble()
    println("Double Number is $randomDoubleNumber")
}