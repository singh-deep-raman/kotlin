package lecture8

fun main(args: Array<String>) {
    // read text from command line
    println("Input something")
    val userInput = readln() //readLine() is deprecated
    println("Entered input is $userInput")

    // input a number
    val userInputNumber = readlnOrNull() ?: ""
    println("Entered number is ${userInputNumber.toInt()}")
}