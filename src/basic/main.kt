package basic

fun main() {
//media(8f,9f,5f)
//media(1f,6f,2f,7f)
// media(1, 4f, "", false, "c")
    val str= "lorem ipsum"
    str.capitalize()
    str.decapitalize()

    arrayOf(1,2,6,5,9,7).size

}

fun media3(vararg notas: Float) {
    if (notas.isNotEmpty()) {
        var soma = 0f
        for (nota in notas) {
            soma += nota
        }
        println("A média é: ${soma / notas.size}")
    }
}

fun <T> media(vararg valores: T) {
    for (valor in valores) {
        println(valor)
    }
}

