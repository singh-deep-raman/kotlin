package lecture6

fun main(args: Array<String>) {
    // practice 1 - length of the string
    val catName = "My cat's name is Fluffy"
    println(" The length of the string is ${catName.length}")

    // practice 2 - extract car out of the string
    val myCar = "My car won't start"
    println(myCar.substring(3,6))

    // practice 3 - dynamic name welcome text
    val clientName = "John"
    println("Hello $clientName, Welcome to the team !!!")

    // practice 4 - add amount of fruit available
    val apples = 3
    val oranges = 6
    println("Amount of fruit available is ${apples + oranges}")

    // practice 5 - print total amount client needs to pay
    val client = "Mary"
    val products = 3
    val price = 30
    println("The client is $client, who needs to pay ${products * price}")
}