package o.o.abstract

abstract class Mamifero(var nome:String){
   var peso: Float= 0f
 abstract fun falar()
    fun dormir(){
        println("estou dormindo")
    }
}
class Cachorro(nome: String,meuPeso: Float) : Mamifero(nome){
    init{ // é executado quando uma classe é instaciada, independente da quantidade de construtores
    this.peso= meuPeso
    }

    override fun falar() {
       println("au au")
    }

}
class Gato(nome: String) : Mamifero(nome){
    override fun falar() {
        println("miau")
    }
}

fun main(){
  Cachorro("Bolt",100f)
}