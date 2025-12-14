package lecture32

fun main(args: Array<String>) {
    sayHello("Marry", "James", "Joseph")
}

fun sayHello(vararg names: String) {
    for (name in names)
        println("Hello $name!")
}
