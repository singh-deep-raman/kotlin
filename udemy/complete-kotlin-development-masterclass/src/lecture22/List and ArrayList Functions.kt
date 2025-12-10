package lecture22

fun main(args: Array<String>) {
    // List functions
    val colors = listOf("red", "green", "blue", "yellow", "blue")
    println(colors.size)
    println(colors.contains("green"))
    println(colors.contains("purple"))
    println(colors.containsAll(listOf("yellow", "green")))
    println(colors.indexOf("blue"))
    println(colors.lastIndexOf("blue"))
    println("------------------------------------------")

    // ArrayList functions
    val colorsMutable = arrayListOf("red", "green", "blue", "yellow")
    println(colorsMutable)
    colorsMutable.set(0, "grey")
    println(colorsMutable)
    println(colorsMutable.subList(2,4))
    println(colorsMutable.subList(2,4)::class.java)
    colorsMutable.clear()
    println(colorsMutable.isEmpty())


}