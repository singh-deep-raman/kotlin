package lecture36

// it is a singleton
// it is also called static class, it can be used without creating an object
// it is like static object of a class in java
object DatabaseAccess {
    var connected = false

    fun connect() {
        connected = true
        println("Connected to database")
    }

    fun disconnect() {
        connected = false
        println("Disconnected from database")
    }
}

fun main(args: Array<String>) {
    if (DatabaseAccess.connected)
        DatabaseAccess.disconnect()
    else
        DatabaseAccess.connect()
    println("Database is connected : ${DatabaseAccess.connected}")
}