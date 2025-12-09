package lecture17

fun main(args: Array<String>) {
    // elvis operator makes sure that some value is returned
    var catName: String? = null
    println(catName ?: "This cat has no name")
    catName = "Fluffy"
    println(catName ?: "This cat has no name")

    // it will return length of the variable if it has some value, otherwise length of "SmellyCat"
    println(catName?:"SmellyCat".length)
}