package testesUri

fun intervalo(valor: Float){
    if(valor<0 || valor>100){
        println("Fora de intervalo")
    }else if(valor in 0f..25.0000f){
        println("Intervalo [0,25]")
    }else if(valor>25.00001 && valor<=50.0000000){
        println("Intervalo (25,50]")
    }else if(valor>50.00001 && valor<=75.0000000){
        println("Intervalo (50,75]")
    }else if(valor>75.00001 && valor<=100){
        println("Intervalo (75,100]")
    }

}

fun main(){


    val valor: Float
    valor= readLine()!!.toFloat()
   intervalo(valor)
}