package o.o.heranca
//open diz que uma classe pode ser herdada
open class Maquina(val marca: String){
    open fun minhaMarca(){
        println("minha marca é $marca")
    }

class Computador(marca:String, val nucleos: Int): Maquina(marca){
    override fun minhaMarca() {
      "estou reescrevendo minha marca!!"
    }
    fun ligar(){}
    fun processar(){}
    //overload - sobrecarga
    fun overload(i: Int) = println("Overload 1")
    fun overload(i: String) = println("Overload 2")
    fun overload(i: Double, s: Int) = println("Overload 3")
}
}

fun main(){
    val c: Maquina.Computador= Maquina.Computador("apto",10)
    with(c){
        ligar()
        processar()
        minhaMarca()
  }

}
