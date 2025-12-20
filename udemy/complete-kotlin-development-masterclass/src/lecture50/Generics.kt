package lecture50

fun main(args: Array<String>) {
    // generics example with predefined classes
    val myBox = Box<String>()
    myBox.display("contents")

    // generics example with custom class
    val myBox2 = Box<Car>()
    myBox2.display(Car("Nissan Magnite", 100.0))

    // generics example with multiple types
    val myNewBox = NewBox<Int, Float>()
    myNewBox.display(10, 20.0F)
}

class Box<T> {
    fun display(item: T) {
        println(item)
    }
}

data class Car(val model: String, val topSpeed: Double)

class NewBox<T,U> {
    fun display(item1: T, item2: U) {
        println(item1)
        println(item2)
    }
}