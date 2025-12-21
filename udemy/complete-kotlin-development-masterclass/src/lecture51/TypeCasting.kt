package lecture51

fun main(args: Array<String>) {
    // 'is' operator and 'as' operator

    // 'is' checks whether an object is of a certain type
    val value = "Testing my strings"
    if (value is String)
        println("This is a type of String")

    // '!is' checks the opposite of above
    if (value !is Integer)
        println("This is not a type of Int")

    // 'as' converts on object into a different type
    val myCar: Car = BMW()
    if (myCar is BMW)
        (myCar as BMW).driveBMW() // type casting so that we can use specific methods of a class
    if (myCar is Audi)
        (myCar as Audi).driveAudi()

    // 'as?' is null safe, means it only converts an object if it is of the type specified
    val car: Car = getCar()
    val nullSafeCar = car as? BMW
    nullSafeCar?.driveBMW()
}

open class Car {}
class BMW: Car() {
    fun driveBMW() {
        println("Driving BMW")
    }
}
class Audi: Car() {
    fun driveAudi() {
        println("Driving Audi")
    }
}
fun getCar(): Car = Audi()