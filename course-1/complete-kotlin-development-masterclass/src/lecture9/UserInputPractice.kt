package lecture9

import java.time.LocalDate

fun main(args: Array<String>) {
    // print username with hello message
    println("Please enter your name: ")
    val name = readln()
    println("Hello, $name")

    // ask the user for a number and prints number multiplied by 5
    println("Please enter a number: ")
    val number = readln().toInt()
    println("5 times of $number is ${number * 5}")

    // print the age of the user from birth of year
    println("Enter your birth year")
    val birthYear = readln().toInt()
    println("Your age is ${LocalDate.now().year - birthYear}")
}