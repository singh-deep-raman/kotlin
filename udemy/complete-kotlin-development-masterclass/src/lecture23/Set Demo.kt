package lecture23

fun main(args: Array<String>) {
    // setOf() function
    val numbers = setOf(3,45,7,12,3)
    println(numbers)

    // empty set requires a type
    val numbersEmpty = setOf<Number>()
    println(numbersEmpty)

    // set & null
    val numbersWithNull = setOf(6,5, 2, null, 23, null, 45, null)
    println(numbersWithNull)
}