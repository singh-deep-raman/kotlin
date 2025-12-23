package lecture47

fun main(args: Array<String>) {
    // Define a restricted hierarchy and abstract by default
    // Useful in when expressions

    // Kotlin sealed classes are used to represent restricted class hierarchies,
    // where all possible subclasses are known at compile time. This design provides
    // type safety and ensures exhaustive checks when using when expressions, eliminating
    // the need for an else branch in many cases.
    val somePlant = getPlant()
    when (somePlant) {
        is Fruit -> println("Fruit")
        is Vegetable -> println("Vegetable")
    }
}

abstract class Plant

sealed class Fruit: Plant()

sealed class Vegetable: Plant()

class Apple: Fruit()

class Potato: Vegetable()

fun getPlant(): Plant = Apple()

