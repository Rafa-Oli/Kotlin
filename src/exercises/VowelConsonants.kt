package exercises

fun countVowels(phase: String): Int {
    var vowels: Int = 0

    for (i in phase) {
        if (i.toLowerCase() == 'a' || i.toLowerCase() == 'e' || i.toLowerCase() == 'i' || i.toLowerCase() == 'o' || i.toLowerCase() == 'u') {
            vowels++
        }
    }

    return vowels
}


fun countConsonants(phase: String): Int {
    var consonants: Int = 0

    for (i in phase) {
        if (i.toLowerCase() != 'a' && i.toLowerCase() != 'e' && i.toLowerCase() != 'i' && i.toLowerCase() != 'o' && i.toLowerCase() != 'u' && i.toLowerCase() != '!' && i.toLowerCase() != ' ') {
            consonants++
        }
    }

    return consonants
}

fun countVowelFilter(frase: String) = frase.filter { it.toLowerCase() in "aeiou" }.length //vai filtrar os caracteres a partir do filter retornando o tamanho

