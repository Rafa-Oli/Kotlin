package testesUri

fun main() {
    val list = mutableListOf<String>()
    val quant: Int
    var num: Int
    quant = readLine()!!.toInt()
    var i: Int = 1
    while (i <= quant) {

        num = readLine()!!.toInt()

        list.add(num.toString())
        i++
    }

    calculoLed(list)
}

private fun calculoLed(list: MutableList<String> = mutableListOf()) {
    val somas = mutableListOf<Int>()
    for (i in list) {
        var soma: Int = 0
        for (num in i) {

            if (num == '1') {
                soma += 2
            } else if (num == '2') {
                soma += 5
            } else if (num == '3') {
                soma += 5
            } else if (num == '4') {
                soma += 4
            } else if (num == '5') {
                soma += 5
            } else if (num == '6') {
                soma += 6
            } else if (num == '7') {
                soma += 3
            } else if (num == '8') {
                soma += 7
            } else if (num == '9') {
                soma += 6
            } else if (num == '0') {
                soma += 6
            }

        }
        somas.add(soma)
    }
    for (i in somas) {
        println("$i leds")
    }
}