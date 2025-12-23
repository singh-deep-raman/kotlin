package lecture42

fun main(args: Array<String>) {
    val daughter = Daughter()
    daughter.checkingScope()
}
class Son: Parent() {
    override fun checkingScope() {
        println(protectedVariable)
        println(internalVariable)
        println(publicVariable)
    }
}