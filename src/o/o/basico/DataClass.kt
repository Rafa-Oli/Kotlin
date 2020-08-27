package o.o
//data class representa uma classe que transita dados
class Quadrado(val area: Float)

data class Triangulo(val area: Float)

fun teste(b: Boolean, s: String, i: Int){

}

fun main(){
    val q1= Quadrado(10f)
    val q2= Quadrado(10f)

    val t1= Triangulo(10f)
    val t2= Triangulo(10f)
    println(q1)
    println(t1==t2) //um dos ganhos é que ele faz a comparção dos valores de um classe

    //copy: copia todos os valores de uma classe para outra
    val t3= t2.copy()
    println(t3)
}