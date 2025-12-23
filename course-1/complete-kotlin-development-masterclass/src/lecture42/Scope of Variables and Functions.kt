package lecture42

fun main(args: Array<String>) {
    val parent = Parent()
    parent.checkingScope()
    println("================================================")

    val daughter = Daughter()
    daughter.checkingScope()

    println("================================================")

}
open class Parent {
    private var privateVariable : String? = "visible inside this class only"
    protected var protectedVariable : String? = "visible inside this class and subclasses"
    internal var internalVariable : String? = "visible inside the package"
    public var publicVariable : String? = "visible to anyone, by default"

    // same above scopes work with method/functions also
    open fun checkingScope() {
        println(privateVariable)
        println(protectedVariable)
        println(internalVariable)
        println(publicVariable)
    }

}
class Daughter: Parent() {
    override fun checkingScope() {
        // println(variable1) // can't access private variables outside the class
        println(protectedVariable)
        println(internalVariable)
        println(publicVariable)
    }
}