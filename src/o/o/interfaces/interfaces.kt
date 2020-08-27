package o.o.interfaces
interface Maquina{
    fun ligar()
    fun desligar(){ // pode ter comportamentos
        println("off")
    }
}

class Computador: Maquina{
    override fun ligar() {

    }
}

interface interface1{
    fun Ola(){
        println("Interface 1")
    }
}

interface interface2{
    fun Ola(){
        println("Interface 2")
    }
}
class ImplementsInterface: interface1,interface2{
    override fun Ola() {
        super<interface1>.Ola()
    }
}

fun main(){

}