package lecture51

import kotlin.random.Random

fun main(args: Array<String>) {
    // 'lateinit' is kind of promise to initialize the variable later on, means we will initialize before using it, otherwise UninitializedPropertyAccessException
    // Use '.isInitialized' to check if it is initialized or not, Common use case is DI or unit testing
    lateinit var networkService: String
    // println(networkService) // throws exception
    networkService = getNetworkService()
    println(networkService)

    // by 'lazy' variables are variables that are initialized when needed (memory optimisation)
    // saves memory if the variable is never used
    val someLargeVariable: String by lazy { "A large variable" }
    // println(someLargeVariable) // won't do anything
    val random = Random.nextInt()
    if (random %2 ==0)
        println(someLargeVariable)
}
fun getNetworkService() = "Network Service"