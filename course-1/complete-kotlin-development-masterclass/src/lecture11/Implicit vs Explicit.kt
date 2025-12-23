package lecture11

fun main(args: Array<String>) {
    // implicit types
    val cats = 3
    val price = 14.99
    println("Implicit types:")
    println("-------------------------------------------")
    println(cats::class.java)
    println(price::class.java)
    println("-------------------------------------------")

    // explicit types
    println("Explicit types:")
    println("-------------------------------------------")
    val dogs: Byte = 5
    println(dogs::class.java)
    val days: Short = 20000
    println(days::class.java)
    val life: Long = 42
    println(life::class.java)
    val lifeL = 42L
    println(lifeL::class.java)
    val money = 5.0F
    println(money::class.java)
    println("-------------------------------------------")

}