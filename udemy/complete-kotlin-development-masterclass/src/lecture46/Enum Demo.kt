package lecture46

fun main(args: Array<String>) {
    // enum e.g. 1
    val color = Color.RED
    when (color) {
        Color.RED -> println("You chose red")
        Color.GREEN -> println("You got a green")
        Color.BLUE -> println("You got a blue")
    }

    // enum e.g. 2
    val color2 = Color2.GREEN
    println(color2)
    println(color2.timesUsed)
    println(color2.name)
    println(color2.ordinal)
}

enum class Color {
    RED, GREEN, BLUE
}

enum class Color2(val timesUsed: Int) {
    RED(10),
    GREEN(20),
    BLUE(15)
}