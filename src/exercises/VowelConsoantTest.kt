package exercises

import org.junit.Assert
import org.junit.Test

class VowelConsoantTest {

    @Test fun countVowels(){
        Assert.assertEquals(11,countVowels("Quantas vogais tem esta frase?"))
    }
    @Test fun countConsonants(){
        Assert.assertEquals(21, countConsonants("Geralmente uma frase possui mais consoantes!"))
    }
    @Test fun countVowelsConsonants(){
        val phase= "estou gostando muito de aprender Kotlin"
        Assert.assertEquals(15, countVowels(phase))
        Assert.assertEquals(19,countConsonants(phase))
    }
    @Test fun countVowelFilter(){
        Assert.assertEquals(8,countVowelFilter("Minha frase com vogais!"))
    }
}