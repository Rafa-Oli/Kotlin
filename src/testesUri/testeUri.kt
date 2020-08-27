package testesUri

import kotlin.math.pow

fun calculo(codigo: Int, quant: Int): String {
    return (if (codigo == 1) {
        "Total: R$ %.2f".format(quant * 4.00)
    } else if (codigo == 2) {
        "Total: R$ %.2f".format(quant * 4.50)
    }else if(codigo==3){
        "Total: R$ %.2f".format(quant * 5.00)
    }else if(codigo==4){
        "Total: R$ %.2f".format(quant * 2.00)
    }else{
        "Total: R$ %.2f".format(quant * 1.50)
    }
            ).toString()


}

fun calculoCirculo(a: Double, b: Double = 2.0): String {


   return "A=%.4f".format((3.14159) * (a.pow(b)))

}
fun main() {

    //b = readLine()!!.toInt()
   // val (code, quant) = readLine()!!.split(' ').map(String::toInt)
    // println(testesUri.calculo(code,quant))
    val a = readLine()!!.toDouble()
    println(calculoCirculo(a))

}