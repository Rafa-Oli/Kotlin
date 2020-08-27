package basic

fun main() {
    val str: String? = null

    println(str?.length) // o "?" é como se fosse um tratamento do NullPointerException
    println(str!!.length) // o "!!" esta assumindo a responsabilidade de dar erro
}