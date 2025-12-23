package lecture39

fun main(args: Array<String>) {
    val myCar = Car()
    myCar.speed = 100
    println("${myCar.name} - ${myCar.speed}")
}

class Car {
    var name = ""
    var speed: Int = 0
        // this get will be called everytime you get a field
        get() = 50 // field, if you want to return 'speed' variable
        // this set will be called everytime you try to set a value
        set(value) {
            name = "High speed car $value"
            // if you want to access speed variable, you need to use 'field' keyword
            field = value
        }
}