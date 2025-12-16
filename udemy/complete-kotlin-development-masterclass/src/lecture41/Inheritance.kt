package lecture41

fun main(args: Array<String>) {
    val carol = Daughter("french")
    carol.say("Hi")
}

open class Mom(nativeLanguage: String) {
    open var hairColor = "brown"
    var eyeColor = "blue"

    fun say(message: String) {
        println("mom says $message")
    }
}
// passing constructor argument from child class to parent class
class Daughter(nativeLanguage: String): Mom(nativeLanguage) {

}