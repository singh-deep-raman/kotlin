package lecture34

fun main(args: Array<String>) {
    // lambda function has no name and can be assigned to a variable
    val lambdaFunction = { name: String -> println("calling from lambda $name") }
    lambdaFunction.invoke("hello")
    println("----------------------------------------------------------------------------")

    // Higher Order Functions is a function that takes another function as a parameter
    sayHello(listOf("Raman", "NMSJ", "ABC"), lambdaFunction)
    println("----------------------------------------------------------------------------")

    // another syntax to specify lambda on the fly
    sayHello(listOf("Raman", "NMSJ", "ABC")) { name ->
        println("that is something new $name")
    }
    println("----------------------------------------------------------------------------")

    // common Higher Order Functions
    val names = listOf("Raman", "NMSJ", "ABC")
    names.forEach { input -> println(input) } // forEach is a HOF
    println("----------------------------------------------------------------------------")

    names.filter {name -> name.length > 3} // filter is a HOF
        .forEach { name -> println("After filtering $name") }
    println("----------------------------------------------------------------------------")

    names.map { name -> name.uppercase() } // map is a HOF
        .forEach { name -> println("After mapping $name") }
    println("----------------------------------------------------------------------------")

    names.sortedBy { name -> name.length } // sortedBy is a HOF
        .forEach { name -> println("After sorting by length $name") }
    println("----------------------------------------------------------------------------")

    println("maxBy ${names.maxBy { name -> name.length }}")
    println("minBy ${names.minBy { name -> name.length }}")
    println("----------------------------------------------------------------------------")

}

fun sayHello(names: List<String>, doSomething: (String) -> Unit) {
    for (name in names) {
        doSomething(name)
    }
}