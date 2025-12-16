package lecture38

fun main(args: Array<String>) {
    val myCar = Car(model = "Nissan Magnite", 100)
    println(myCar)

    val myCar2 = Car2()
    println(myCar2)

    val myCar3 = Car2("Skoda")
    println(myCar3)

    val myCar4 = Car2("Fortuner", 200)
    println(myCar4)
}

// class with one constructor (String, Int) only
class Car(var model: String, var topSpeed: Int) {

    override fun toString(): String {
        return "Car(model='$model', topSpeed=$topSpeed)"
    }
}


class Car2 {
    var model: String
    var topSpeed: Int

    constructor() {
        model = "No Model"
        topSpeed = 140
    }

    constructor (newModel: String) {
        model = newModel
        topSpeed = 140
    }

    constructor (newModel: String, newTopSpeed: Int) {
        model = newModel
        topSpeed = newTopSpeed
    }

    override fun toString(): String {
        return "Car2(model='$model', topSpeed=$topSpeed)"
    }
}