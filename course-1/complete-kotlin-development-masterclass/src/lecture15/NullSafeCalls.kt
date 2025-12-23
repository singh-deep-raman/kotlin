package lecture15

fun main(args: Array<String>) {
    // example 1
    var catName: String? = "blablabla"
    println(catName?.length)
    catName = null
    println(catName?.length) // will return null

    // example 2 - chaining operations
    var dogName: String? = "abcabc"
    println(dogName?.length)
    dogName = null
    println(dogName?.length?.toString()) // will return null
}