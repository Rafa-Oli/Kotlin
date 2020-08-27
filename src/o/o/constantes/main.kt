package o.o.constantes

class Constants {
    companion object BANCO {  //companion object pode ter ou não um nome
        val TABLE = "Pessoa"
        fun teste() {
            println("sou um método estático")
        }
    }

    object VENDAS { // PRECISA TER NOME
        val TABLE_NOME = "vendas"

        object COLUNAS {
            val id = "id"
            val total = "Total"
        }

    }

}

fun main() {
    println(Constants.TABLE)
    Constants.teste()

    Constants.BANCO.TABLE
    Constants.VENDAS.COLUNAS.total
}