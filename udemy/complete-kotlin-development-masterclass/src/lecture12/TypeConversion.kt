package lecture12

fun main(args: Array<String>) {
    // from small datatype to larger datatype
    val cats = 3
    val longCats = cats.toLong()
    println(cats::class.java)
    println(longCats::class.java)
    println(longCats)

    // from larger datatype to smaller datatype, corrupted data if it doesn't fit
    val people = 7500000000
    val fewPeople = people.toInt()
    println(people::class.java)
    println(fewPeople::class.java)
    println(fewPeople)

    // some other conversion methods
    val dogs = 5
    val byteDogs = dogs.toByte()
    val floatDogs = dogs.toFloat()
    println(byteDogs::class.java)
    println(floatDogs::class.java)


}