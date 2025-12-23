package lecture20

fun main(args: Array<String>) {
    // create a list immutable
    val colors = listOf("red", "orange", "yellow", "green", "blue")
    println(colors)

    // list can't be created without a type
    val colors2 = listOf<String>()
    println(colors2)

    // accessing/retrieving the elements of list
    println(colors.get(0))
    println(colors[1])

    // size of the list
    println(colors.size)
}