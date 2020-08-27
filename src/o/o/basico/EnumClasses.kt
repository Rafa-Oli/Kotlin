package o.o.basico

enum class Prioridade1{
    BAIXA,MEDIA,ALTA
}
enum class Prioridade2(val id: Int){
    BAIXA(1){
        override fun toString(): String {
            return "super baixa, não se preocupe"
        }
    }
    ,MEDIA(5),ALTA(10)
}

class Alarme(var desc: String, p: Prioridade2)
fun main(){
   println(Prioridade2.BAIXA.id)

    for (p in Prioridade2.values()){

        println("$p - ${p.id}")
    }


    Alarme("Aviso!", Prioridade2.ALTA)
}