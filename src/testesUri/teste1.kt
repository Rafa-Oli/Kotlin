package testesUri

import java.util.*

fun media(vararg notas: Float) {
    var contador: Int = 0

    var soma = 0f
    for (nota in notas) {
        if (nota > 0f) {
            soma += nota
            contador++
        }
    }
    println("$contador valores positivos")
    println("Total: R$ %.1f".format(soma /contador))

}

fun main() {
    val num1 = readLine()!!.toFloat()
    val num2 = readLine()!!.toFloat()
    val num3 = readLine()!!.toFloat()
    val num4 = readLine()!!.toFloat()
    val num5 = readLine()!!.toFloat()
    val num6 = readLine()!!.toFloat()
    media(num1, num2, num3, num4, num5, num6)
}