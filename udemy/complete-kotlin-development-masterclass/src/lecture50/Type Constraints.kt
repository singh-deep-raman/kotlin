package lecture50

fun main(args: Array<String>) {
    val chef = Chef<Apple>()
    chef.cook(Apple())

    val chef2 = Chef<Banana>()
    chef2.cook(Banana())
}

abstract class Fruit {
    abstract fun peel()
}
class Apple: Fruit() {
    override fun peel() {
        println("peeling the apple")
    }
}
class Banana: Fruit() {
    override fun peel() {
        println("peeling the banana")
    }
}
// we are constraining the type here to Fruit only
class Chef<T: Fruit> {
    fun cook(item: T) {
        item.peel() // if we don't constrain the type, we won't able to call peel() method from here
    }
}
// for multiple types
// class Chef<T: Fruit, U: Vegetable>