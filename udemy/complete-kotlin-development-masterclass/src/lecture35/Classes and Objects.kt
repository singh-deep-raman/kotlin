package lecture35

fun main(args: Array<String>) {
    val myCar = Car()
    myCar.model = "Nissan Magnite"
    myCar.start()
    myCar.drive(20)

    val yourCar = Car()
    yourCar.model = "Skoda"
    yourCar.start()
    yourCar.drive(30)
}

class Car {
    var model: String? = null
    var topSpeed = 100

    fun start() {
        println("Starting the car $model")
    }

    fun drive(speed: Int) {
        println("Driving at the speed of $speed, Don't go beyond $topSpeed")
    }
}