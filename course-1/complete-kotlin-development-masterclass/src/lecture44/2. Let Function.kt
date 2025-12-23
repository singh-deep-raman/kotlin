package lecture44

fun main(args: Array<String>) {
    val animals = listOf("cat", "dog", "mouse", "bear", "zebra")
    animals.map { it.length}
        .filter { it > 3}
        .let {
            println(it)
            println("Size of the list is ${it.size}")
        }

    // method reference
    animals.let(::println)

    // most common use of let is to avoid NPE
    val name = readlnOrNull()
    name?.let {
        println("Name: $it")
    }

}