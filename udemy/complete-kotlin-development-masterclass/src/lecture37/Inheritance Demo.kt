package lecture37

// open keyword is must to perform inheritance, it means a class is open to inheritance
open class Dog {
    var age: Int = 10

    fun bark() {
        println("bark")
    }

    fun play() {
        println("play")
    }
}

class Corgi: Dog() {

}

fun main(args: Array<String>) {
    val myDoggy = Corgi()
    myDoggy.bark()
    myDoggy.play()
    myDoggy.age = 5
}