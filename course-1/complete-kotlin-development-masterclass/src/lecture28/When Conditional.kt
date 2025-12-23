package lecture28

fun main(args: Array<String>) {
    // when is same like switch case in Java
    val animal = "dog"
    var action: String? = null
    when(animal) {
        "cat" -> action = "pet it"
        "dog" -> action = "feed it"
        else -> action = "google it"
    }
    println(action)

    // when as a statement means it can return values also, just like if block
    action = when(animal) {
        "cat" -> "pet it"
        "dog" -> "feed it"
        else -> "google it"
    }
    println(action)

    // two values with same effect
    val typeOfAnimal = when (animal) {
        "dog", "bear" -> "Omnivore"
        "cat", "lion", "tiger" -> "Carnivore"
        else -> "herbivore"
    }
    println(typeOfAnimal)

    // capturing the subject
    val name = "Ramandeep"
    when (val length = name.length) { // useful when value is returned from function
        in 1..5 -> println("$length is too short")
        in 6..10 -> println("$length is medium")
        else -> println("$length is too long")
    }
}