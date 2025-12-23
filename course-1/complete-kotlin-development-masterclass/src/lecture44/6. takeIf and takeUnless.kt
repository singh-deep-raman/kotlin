package lecture44

import kotlin.random.Random

fun main() {
    // takeIf returns object if predicate is TRUE or NULL
    val number = Random.nextInt(100)
    val evenOrNull = number.takeIf { it % 2 == 0 }
    println("The number is $number")
    println("The even number is $evenOrNull")

    //takeUnless returns object if predicate is FALSE or NULL
    val oddOrNull = number.takeUnless { it % 2 == 0 }
    println("The odd number is $oddOrNull")

    // combining both
    val newNumber = readlnOrNull()?.toInt()
    newNumber?.takeIf { it % 2 == 0 }
        .takeUnless { it == 4 || it == 6 }
        .let { println(it) }
}