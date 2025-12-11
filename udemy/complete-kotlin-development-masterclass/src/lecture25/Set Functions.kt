package lecture25

fun main(args: Array<String>) {
    // Set functions
    val numbers = setOf(1,2,3,4,5)

    println(numbers.size)
    println(numbers.contains(5))
    println(numbers.containsAll(setOf(3,2,5)))
    println(numbers.isEmpty())

    // HashSet functions
    val mutableNumbers = hashSetOf(1,2,3,4,5)
    println(mutableNumbers.intersect(setOf(4,5,6,7,8,9)))
    mutableNumbers.clear()
    println(mutableNumbers)

}