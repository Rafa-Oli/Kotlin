package testesUri

import collections.Ingredients

fun calculoSoma(x: Int, y: Int): List<Int> {
    val list = mutableListOf<Int>()
    var i: Int = 1
    fun calculo() {
        while (i <= y) {
            var x1: Int = x
            if (x1 % 2 != 0) {
                var soma: Int = 0
                i++
                soma += x1
                list.add(soma)
            }

            x1++
        }
    }
   return list
}
    fun valores(list: List<Int>) {
        for (i in list) {
            println(i)
        }
    }


fun main() {
    val quant: Int
    val list = mutableListOf<Int>(1,4,5)
    var i1: Int = 1
    quant = readLine()!!.toInt()
    var i: Int = 1
    var soma: Int = 0

    for (i1 in i1..quant) {
        var (x, y) = readLine()!!.split(' ').map(String::toInt)
        while (i <= y) {
            if (x % 2 != 0) {
                i++
                soma += x

            }
            x++
        }
        list.add(soma)
        i = 1
        soma = 0
    }

    list.add(4)
    for (i in list) {

        println(i)
    }


}


