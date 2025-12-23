package lecture21

fun main(args: Array<String>) {
    // mutable list i.e. ArrayList
    val colors = arrayListOf("blue", "green", "red")
    println(colors)
    val noColors = arrayListOf<String>()
    println(noColors)

    // add one element
    colors.add("yellow")
    println(colors)

    // add multiple elements or another collection
    colors.addAll(listOf("lavender", "purple"))
    println(colors)

    // remove first element by value
    colors.remove("green")
    println(colors)

    // remove element by position
    colors.removeAt(3)
    println(colors)
}