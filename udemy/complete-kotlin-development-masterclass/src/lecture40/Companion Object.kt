package lecture40

fun main(args: Array<String>) {
    println(Car.yearOfManufacture)
    println(Car.getDrivingInstructions())
}

// make class code available without creation of an object (like static fields/methods in java)
class Car {
    companion object {
        var yearOfManufacture = 2025
        fun getDrivingInstructions() = "Please drive safely !!!"
    }
}