package lecture31

fun main(args: Array<String>) {
    // one another way of loop without for keyword
    (1..3)
        .forEach { i ->
            sayHello()
        }

    // fun with parameters or arguments
    sayHelloTo("Raman")
    sayHelloTo("NMSJ")

    // fun with parameters with default values for optional parameters
    defaultParameterValues("Raman", 10000)
    defaultParameterValues("Chinu")

    // fun with return type
    var areaOfCircle = calculateAreaOfCircle(radius = 10)
    println("areaOfCircle = $areaOfCircle")

    // fun with return shorthand (doesn't have {} as it has one line of code)
    areaOfCircle = areaOfCircleShortHand(10)
    println("areaOfCircle = $areaOfCircle")

    // fun with nullable type
    val products = mapOf("shoes" to 29.99)
    val finalPrice = addTwentyPercentTax(products["shoes"])
    println("finalPrice = $finalPrice")

}

fun addTwentyPercentTax(price: Double?) = price?.times(1.2)

fun areaOfCircleShortHand(radius: Int) = 3.1415 * radius * radius

fun calculateAreaOfCircle(radius: Int): Double {
    return 3.1415 * radius * radius
}

fun defaultParameterValues(name: String, salary: Int = 0) {
    println("$name has salary $salary")
}

fun sayHelloTo(name: String) {
    println("Hello my friend $name")
}

// fun keyword declares a function
fun sayHello() {
    println("Hello everyone !!")
}
