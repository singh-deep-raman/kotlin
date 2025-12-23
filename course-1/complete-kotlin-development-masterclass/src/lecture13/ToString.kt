package lecture13

fun main(args: Array<String>) {
    val cats = 3
    val catsString = cats.toString()
    println(catsString::class.java)

    val pi = 3.1415
    val piString = pi.toString()
    println(piString::class.java)
}