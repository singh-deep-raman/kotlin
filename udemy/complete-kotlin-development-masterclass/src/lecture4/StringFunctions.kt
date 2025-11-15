package lecture4

fun main(args: Array<String>) {
    // length of the string
    val myPet = "Crocodile"
    println(myPet.length)

    // capitalize (deprecated)
    val name = "raman"
    println(name.capitalize())

    // decapitalize (deprecated)
    val animalName = "Giraffe"
    println(animalName.decapitalize())

    // trim beginning and trailing spaces
    val myTextWithSpaces = "    this is text      with     many spaces        "
    println(myTextWithSpaces.trim())

    // get character at specified position
    println(myPet.get(3))
    println(myPet[3])

    // substring (starting index till end)
    println(myPet.substring(3))

    // substring (starting, ending) where ending index is exclusive
    println(myPet.substring(3,6))

}