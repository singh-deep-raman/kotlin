package lecture14

fun main(args: Array<String>) {
    val nonNullableName = "NMSJ"
    var nullableName: String? = "I will assign null"
    println(nonNullableName)
    println(nullableName)

    // nonNullableName = null // compilation error
    nullableName = null
    println(nullableName)
}