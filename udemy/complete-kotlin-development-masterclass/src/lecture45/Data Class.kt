package lecture45

fun main(args: Array<String>) {
    // Data class is just a POJO for storing data
    // It should have a primary constructor with at least one parameter
    // All primary constructor parameters need to be val or var
    // Can have a body, but not mandatory

    val user = User("Raman", "raman@gmail.com", "mai-kyun-batau")
    println(user) // in case of object, you get object reference as output, but in case of data class, you will see the contents

    // default methods provided by Data classes

    // equal() or == which compares data
    val dataUser1 = User("A", "a@gmail.com", "abc")
    val dataUser2 = User("A", "a@gmail.com", "abc")
    println(dataUser1.equals(dataUser2))
    println(dataUser1 == dataUser2)
    val regularUser1 = RegularUser("A", "a@gmail.com", "abc")
    val regularUser2 = RegularUser("A", "a@gmail.com", "abc")
    println(regularUser1 == regularUser2)
    println(regularUser1.equals(regularUser2))

    // prints out variables and data
    println(dataUser1.toString())
    println(regularUser1.toString())

    // copy()
    val copiedUserWithNewEmail = dataUser1.copy(email = "copied@gmail.com")
    println(copiedUserWithNewEmail)
}

data class User(
    val name: String,
    val email: String,
    val password: String
)

class RegularUser (
    val name: String,
    val email: String,
    val password: String
)


