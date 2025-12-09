package lecture16

fun main(args: Array<String>) {
    // example to show operations
    var a: Int? = 10
    println(a?.plus(3))
    println(a?.minus(3))
    println(a?.times(3))
    println(a?.div(3))
    println(a?.rem(3))

    // example to show null operator will result in null values only
    a = null
    println(a?.plus(3))
    println(a?.minus(3))
    println(a?.times(3))
    println(a?.div(3))
    println(a?.rem(3))

}