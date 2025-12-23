package lecture49

fun main(args: Array<String>) {
    // Extensions allow us to extend a class functionality without inheritance that we don't own or cannot modify
    // Can extend -> 1. Functions 2. Properties 3. Companion object
    extensionFunctionsDemo()

    extensionProperties()

    companionObjectExtensions()
}

//===================================================
fun extensionFunctionsDemo() {
    val name = "Michael"
    println(name.slim())
}
// String class is not modified or new functions are not inserted into the class
// it is just a shortcut to make the functions available using the casual object.function notation
fun String.slim() = this.substring(1, this.length - 1)
//====================================================

// $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
fun extensionProperties() {
    val name = "Michael"
    println(name.betterLength)
}
// these properties can't be local
// we cannot update an extension property, so it is always 'val' not 'var'
val String.betterLength: Int
    get() = 200
// $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
fun companionObjectExtensions() {
    // companion object can be extended only if it exists in the class we want to extensify
    Book.printMe()
}
class Book {
    companion object {}
}
fun Book.Companion.printMe() = println("printing the book... printing done !!!")
// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@