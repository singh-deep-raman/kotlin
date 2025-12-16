package lecture41

fun main(args: Array<String>) {
    val daughter = Daughter2("hindi")
    daughter.say("Jaa yr!!!")
}

open class Mom2(nativeLanguage: String) {
    // if you want child class to override this value, you need to use 'open' keyword
    open var hairColor = "brown"
    var eyeColor = "blue"

    // to override a function, you need to declare this function as 'open'
    open fun say(message: String) {
        println("mom says $message")
    }
}

class Daughter2(nativeLanguage: String): Mom2(nativeLanguage) {
    // 'override' keyword overrides the variable declared with 'open' keyword
    override var hairColor = "black"

    override fun say(message: String) {
        println("daughter says $message with color $hairColor but mom has ${super.hairColor}")
        super.say("calling from daughter!!")
    }
}