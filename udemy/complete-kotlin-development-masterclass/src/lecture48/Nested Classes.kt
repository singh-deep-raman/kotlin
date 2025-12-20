package lecture48

fun main(args: Array<String>) {
    val myCar = Car()
    myCar.Engine().run()

    val myCar2 = Car2()
    myCar2.drive()
}
class Car {
    var speed = 100
    fun drive() {
        println("Driving at $speed")
    }

    inner class Engine {
        val rpm = 300
        fun run() {
            this@Car.speed = 120
            this@Car.drive()
            println("Engine running !!!")
        }
    }

}

class Car2 {
    var speed = 100
    private val engine = Engine()
    fun drive() {
        engine.run()
        println("Driving car 2 at $speed")
    }

    // making this private so that it can't be used outside Car2 class
    private inner class Engine {
        val rpm = 300
        fun run() {
            this@Car2.speed = 120
            println("Engine 2 running !!!")
        }
    }

}