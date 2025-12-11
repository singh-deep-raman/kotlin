package lecture24

fun main(args: Array<String>) {
    // HashSet is mutable
    val mutableNumbers = hashSetOf(3,4,6,1,2,6,4,null)
    println(mutableNumbers)

    // add element
    mutableNumbers.add(44)
    println(mutableNumbers)

    // add a collection
    mutableNumbers.addAll(setOf(9,8,7))
    println(mutableNumbers)

    // remove
    mutableNumbers.remove(null)
    println(mutableNumbers)

    // removeAll
    mutableNumbers.removeAll(setOf(1,2,3))
    println(mutableNumbers)
}