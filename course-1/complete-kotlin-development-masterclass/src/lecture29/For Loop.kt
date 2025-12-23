package lecture29

fun main(args: Array<String>) {
    // for loop with collection
    val animals = listOf("cat", "dog", "frog", "water", "fish")
    for (item: String in animals) { // specifying the type is optional as it is clear from the collection
        println(item)
    }
    println("----------------------------------------------------")

    // for loop with range
    for (i in 1..12) {
        println(i)
    }
    println("----------------------------------------------------")

    // for loop with map
    val customerPurchases = mapOf("A" to 100, "B" to 200, "C" to 300)
    for (customerName in customerPurchases.keys) {
        println("$customerName bought ${customerPurchases[customerName]}")
    }
    println("----------------------------------------------------")

    // for loop with map (another syntax)
    for ((k,v) in customerPurchases) {
        println("$k bought $v")
    }
}