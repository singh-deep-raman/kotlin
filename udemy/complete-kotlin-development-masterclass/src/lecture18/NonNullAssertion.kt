package lecture18

fun main(args: Array<String>) {
    val catName: String? = null
    println(catName!!.length) // throw NPE
    // avoid this operator as much as you can
}