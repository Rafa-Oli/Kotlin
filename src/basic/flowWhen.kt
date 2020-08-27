package basic

fun operacao(a: Int, b: Int, c: String){
   /*
    when(c){
        "Soma" -> return a + b

        "Subtracao" -> return a - b

        else -> return 0


    } */
    when{
        a > 0 && b > 0 -> {
            println("Variaveis maiores que zero")

        }    }
    when(a){ // range: intervalo de valores
        in 1..99 ->{
      println("Século")
        }
    }

}

fun main() {
    operacao(10, 10, "Soma")
}