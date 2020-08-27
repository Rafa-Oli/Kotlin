package testesUri

fun distanciaEntreDoisPontos(x1: Double,y1: Double,x2: Double,y2: Double): String{

    val termo1: Double= Math.pow((x2-x1),2.0)
    val termo2: Double= Math.pow((y2-y1),2.0)
    val soma: Double = termo1 + termo2
    val distancia: Double= Math.sqrt(soma)
     return "%.4f".format(distancia)
}


fun main(){

    val (x1,y1) = readLine()!!.split(' ').map(String::toDouble)
    val(x2,y2)= readLine()!!.split(' ').map(String::toDouble)

    println(distanciaEntreDoisPontos(x1,y1,x2,y2))
}