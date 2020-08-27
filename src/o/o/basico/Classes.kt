package o.o.basico

class Maquina(var marca: String){
    var nucleos: Int= 0
    get(){
        println("get foi chamado")
        return field
    }
    set(value){
        println("set foi chamado")
        field=value
    }
    fun ligar(){

    }
    fun processar(){

    }
    fun desligar(){

    }
}


fun main(){
    var m= Maquina("apto")
    println(m.nucleos)

   //with é utilizado quando vc chama varios metodos de uma msm variavel
   with(m){
       ligar()
       processar()
       desligar()
   }

}
