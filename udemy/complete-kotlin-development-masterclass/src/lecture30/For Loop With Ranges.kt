package lecture30

fun main(args: Array<String>) {
    // for loop with range ascending
    for (i in 1..12) {
        println(i)
    }
    println("----------------------------------------------------")

    // for loop with range descending
    for (i in 50 downTo 40) {
        println(i)
    }
    println("----------------------------------------------------")

    // for loop with range descending, step size
    for (i in 50 downTo 40 step 3) {
        println(i)
    }
    println("----------------------------------------------------")

    val start = 10
    val end = 25
    // for loop with range and variables
    for (i in start..end) {
        print("$i \t")
    }
    println("\n----------------------------------------------------")

    // print emoji in code (get value from getmoji website or emojipedia)
    println("\uD83D\uDE00")

}