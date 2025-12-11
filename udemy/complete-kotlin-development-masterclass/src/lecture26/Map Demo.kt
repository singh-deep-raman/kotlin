package lecture26

fun main(args: Array<String>) {
    // Create a Map
    val count = mapOf(Pair(1,"One"), Pair(2, "Two"), Pair(3, "Three"))
    println(count)

    // way 2
    val count2 = mapOf("One" to 1, 2 to "Two", 3 to "Three") // because each element in a map is Pair, so it doesn't matter if the key is of same type
    println(count2)

    // get value
    println(count.get(1))
    println(count[2])
    println(count2["One"]) // get by any datatype, it's not index, it's the key

    println(count.keys)
    println(count2.keys)

}