package basic//para formatar é CTRL + ALT + L

fun calculaBonus(cargo: String, salario: Float): Float {
    //Gerente junior, Gerente Senior, Coordenador

    return if (cargo == "Coordenador") {
        salario * 0.2f
    } else if (cargo == "Gerente Junior") {
        salario * 0.5f
    } else {
        salario * 2
    }

}

fun main(array: Array<String>) {
    val a = 10
    val b = 20
    val c = 30
    val valor= 10
    //String str= valor ==10 ? "Sim" : "Não"; JAVA
    val str= if(valor == 10) "Sim" else "Não"

    println(hello("Rafaela"))
    println(soma(2, 2))
    maiorDeIdade(10)
    maiorDeIdade(18)
    maiorDeIdade(27)
    println(calculaBonus("Coordenador", 1000f))
    println(calculaBonus("Gerente Junior", 1000f))
    println(calculaBonus("Gerente Senior", 1000f))

  //operador elvis ?: (trabalha com variaveis que podem ser nulos)
    val test: Int? = null

    val op = test ?: 100 // verifica se test é nula, se for usa 100, caso não é usa o valor de test
    println(op)
}

fun hello(nome: String): String {
    return "olá, $nome"
}

fun hello2(nome: String) = "olá, $nome"
fun soma(a: Int, b: Int) = a + b

//if - else
fun maiorDeIdade(idade: Int): Boolean {
    return idade >= 18
}