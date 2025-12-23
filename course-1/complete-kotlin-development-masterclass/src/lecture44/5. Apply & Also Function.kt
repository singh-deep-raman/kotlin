package lecture44

fun main(args: Array<String>) {
    // Similar to Run, but returns the initial object
    // Common use case is applying configuration to an object creation
    val newCar = Car().apply {
        speed = 20
        drive()
    }

    // Also, used to perform additional actions on object
    // Common use case is adding some actions that don't affect the object, such as logging or debugging
    // Removing an 'also' block should not affect the execution of a program
    Car().apply {
        speed = 40
        drive()
    }.also { println(it) }

}