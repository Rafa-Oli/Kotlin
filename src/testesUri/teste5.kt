package testesUri


fun main(){
    val list = mutableListOf<Int>()
    var num: Int
    val quant: Int
    quant= readLine()!!.toInt()
    var i: Int = 0
    while (i<quant){
        num= readLine()!!.toInt()
        list.add(num)
        i++
    }
paresImpares(list)
}

fun paresImpares(list: MutableList<Int> = mutableListOf()){
    val pares = mutableListOf<Int>()
    val impares= mutableListOf<Int>()
    for (i in list){
        if(i % 2 == 0){ // par
            pares.add(i)

        }else{
            impares.add(i)
        }
    }

    pares.sort()
    for (i in pares){
        println(i)
    }

    impares.sort()
    impares.reverse()
    for (i in impares) {
        println(i)
    }
}