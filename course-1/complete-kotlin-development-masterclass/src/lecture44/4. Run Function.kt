package lecture44

fun main(args: Array<String>) {
    // Same as with but invokes an extension function, useful when you need a lambda that returns a result
    // Can be used to limit the scope of variables
    val car = Car().run {
        speed = 800
        drive()
        println("Car is driving")
        this // this is the return statement
    }
    println(car)

    // another syntax
    run {
        val newCar = Car()
        newCar.speed = 100
        newCar.drive()
        // variable newCar cease to exist
    }
}