package lecture33

fun main(args: Array<String>) {
    // local function is a function inside the function
    listAnimals()
}
fun listAnimals() {
    fun listOne(animal: String) {
        println("I have a $animal")
    }
    val myAnimals = listOf("cat", "dog", "frog", "horse")
    for (animal in myAnimals) {
        listOne(animal)
    }
}