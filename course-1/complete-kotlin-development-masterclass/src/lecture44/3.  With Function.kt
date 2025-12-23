package lecture44

fun main(args: Array<String>) {
    // With Function is used when you want to perform some operations on an object
    // this keyword is optional
    with(Car()) {
        drive()
        speed = 80
        drive()
    }
}
class Car {
    var speed = 50
    fun drive() {
        println("Driving at $speed")
    }
}