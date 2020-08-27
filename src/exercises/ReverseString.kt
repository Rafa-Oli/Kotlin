package exercises

import java.lang.StringBuilder

fun reverseUsingSB(str: String): String {
    return StringBuilder(str).reverse().toString()
}

fun reverseUsingLoop(str: String): String {
    var frase: String = ""
    for (j in str.reversed()) {
        frase += j
    }
    return frase
}

fun reverseUsingLoopProf(str: String): String {
    var sbPhase = StringBuilder()
    var i = str.length - 1

    while (i >= 0) {
        sbPhase.append(str[i])
        i--
    }
    return sbPhase.toString()
}