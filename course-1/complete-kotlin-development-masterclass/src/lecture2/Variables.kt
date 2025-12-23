package lecture2

fun main(args: Array<String>) {
    var mutableVariable = "I can be changed"
    mutableVariable = "see, I am changed"

    val immutableVariable = "I can't changed"
    // immutableVariable = "don't you dare to change me" // error
}