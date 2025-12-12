package lecture27

fun main(args: Array<String>) {
    // in is like collection.contains(element)
    val favoritePet = "dogg"
    val pets = listOf("dog", "cat", "frog")
    if (favoritePet in pets)
        println("Fav pet exists")
    else
        println("Fav pet does not exist")

    // !in
    if ("horse" !in pets)
        println("Horse doesn't exist")
    else
        println("Horse exists")

    // in with range
    println("Input a number: ")
    val number = readln().toInt()
    if (number in 0..9)
        println("Number is single digit")
    else
        println("Number is more digits")

}