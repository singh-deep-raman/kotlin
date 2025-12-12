package lecture27

fun main(args: Array<String>) {
    // simplest if (can omit curly brackets if one statement)
    val night = true
    var activity: String? = null
    if (night) {
        activity = "Sleep"
    } else {
        activity = "Be active"
    }
    println(activity)

    // shorthand if, write the whole statement in one line
    val number = 25
    var isEven : String? = null
    if (number % 2 == 0) isEven = "Even" else isEven = "Odd"
    println(isEven)

    // if as an expression (when you want to return a value from if)
    val checkEvenOrOdd = if (number % 2 == 0) "Even" else "Odd"
    println(checkEvenOrOdd)

    // if, else if, else (already know about it)

}