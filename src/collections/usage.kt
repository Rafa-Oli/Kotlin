package collections

data class Food(val name: String, val calories: Double, val ingredientes: List<Ingredients> = listOf())
data class Ingredients(val name: String, val quantity: Int)

fun hasIngredient(list: List<Ingredients>, name: String): Boolean {
    return list.filter { it.name.equals("farinha", true) }.any()

}

fun main() {
    val data = listOf(
            Food("Lasanha", 1200.0,
                    listOf(Ingredients("farinha", 1),
                            Ingredients("Presunto", 5),
                            Ingredients("Queijo", 10),
                            Ingredients("Molho de tomate", 2),
                            Ingredients("Manjericão", 3)

                    )

            ),
            Food("Panqueca", 500.0),
            Food("Omelete", 200.0),
            Food("Parmegiana", 700.0),
            Food("Sopa de Feijão", 300.0),
            Food("Hamburguer", 2000.0,
                    listOf(Ingredients("Pão", 1),
                            Ingredients("Hamburguer", 3),
                            Ingredients("Queijo", 1),
                            Ingredients("Catupiry", 1),
                            Ingredients("Bacon", 3),
                            Ingredients("Alface", 1),
                            Ingredients("Tomate", 1)
                    )

            )
    )

    //tenho receitas na lista?
    println("Tenho receitas? ${if (data.any()) "sim" else "não"}")

    //quantas receitas tenho na coleção?
    println("tenho ${data.count()} receitas")

    //qual a primeira e ultima receita
    println("a primeira receita é: ${data.first().name}")
    println("a ultima receita é: ${data.last().name}")

    //Qual a soma de calorias
    val sumCalories = data.sumByDouble { it.calories }
    println("A soma de calorias é: $sumCalories")
    //listOf(1,2,3,4,5).sum()

    //Me dê as duas primeiras receitas!
    val firstTwo = data.take(2)
    for (x in firstTwo.withIndex()) {
        println("${x.index + 1} - ${x.value.name}")

        //Sei como fazer panqueca? e sushi?
        val knowPancake = data.filter { it.name == "Panqueca" }.any()
        println("Sei fazer panqueca? ${if (knowPancake) "sim" else "não"}")
        val knowSushi = data.filter { it.name == "Panqueca" }.any()
        println("Sei fazer panqueca? ${if (knowPancake) "sim" else "não"}")

        //quais são as comidas com mais de 500 calorias?
        val more500 = data.filter { it.calories > 500 }.forEach { println(it.name) }

        //Par(chave,valor) de comidas com mais de 500 calorias(nome,calorias)
        data.filter { it.calories > 500 }.map { Pair(it.name, it.calories) }.forEach { println("${it.first}: ${it.second} calorias") }

        //quais das receitas possuem farinhas como ingrediente?
        val result = data.filter { hasIngredient(it.ingredientes, "Farinha") }.forEach { println("${it.name}") }
    }
}
