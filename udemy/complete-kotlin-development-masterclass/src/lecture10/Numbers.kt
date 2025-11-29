package lecture10

fun main(args: Array<String>) {
    // simplest example of numbers in kotlin
    val price = 34
    val items = 3
    val totalPrice = price * items
    println("Total price is $totalPrice")
    println("----------------------------------------------------")

    // number types
    println("Byte: Min is ${Byte.MIN_VALUE} and Max is ${Byte.MAX_VALUE} ")
    println("Short: Min is ${Short.MIN_VALUE} and Max is ${Short.MAX_VALUE} ")
    println("Int: Min is ${Int.MIN_VALUE} and Max is ${Int.MAX_VALUE} ")
    println("Long: Min is ${Long.MIN_VALUE} and Max is ${Long.MAX_VALUE} ")
    println("Float: Min is ${Float.MIN_VALUE} and Max is ${Float.MAX_VALUE} ")
    println("Double: Min is ${Double.MIN_VALUE} and Max is ${Double.MAX_VALUE} ")
    println("----------------------------------------------------")

    // implicit types and how to identify the type of variable
    val noOfItems = 5                   // Int
    val nbOfPeople = 7500000000000      // Long
    val newPrice = 29.99                // Double
    val pi = 3.14131933828290           // Double
    println(noOfItems::class.java)
    println(nbOfPeople::class.java)
    println(newPrice::class.java)
    println(pi::class.java)

}