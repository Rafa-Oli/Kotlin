package o.o.lateInit
class Pessoa{
  lateinit var nome: String  //inicializa a variavel depois que a classe é instanciada

    fun geradorDeNome(){
        nome= "fsdf"
    }
}

fun main(){
  val p= Pessoa()
    p.geradorDeNome()
}