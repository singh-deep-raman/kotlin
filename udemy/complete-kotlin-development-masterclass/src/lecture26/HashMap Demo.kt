package lecture26

fun main(args: Array<String>) {
    // declare
    val count = hashMapOf(1 to "one", 2 to "two", 3 to "three")
    println(count)

    count.put(30, "Thirty")
    count[40] = "Forty"
    count.putAll(mapOf(4 to "Four", 5 to "Five"))
    println(count)

    count.remove(30)
    println(count)

    count.replace(1, "First")
    println(count)

    count.clear()
    println(count)
}