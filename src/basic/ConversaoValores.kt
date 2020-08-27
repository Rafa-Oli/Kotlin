package basic

fun main() {

    try {
println("dfsafd".toInt())
    } catch (e: NumberFormatException) {
        println("esse valor n é um numero")
    } catch (e: Exception) {
        println("algo de errado ocorreu")
    } finally {
        print("sdfsdf")
    }
}

