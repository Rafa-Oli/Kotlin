package collections

fun main(){
    //List- array,Set, Hashmap

    val l1= listOf<String>("Madrid","São Paulo","Berlim") // listof é uma coleção imutavel
    val l2= mutableListOf<String>("Madrid","São Paulo","Berlim")

    val a1= arrayListOf<String>("Madrid","São Paulo","Berlim")

    val s1= setOf<String>("Madrid","São Paulo","Berlim") // verifica se ja existe um item e não permite operações
    val s2= mutableSetOf<String>("Madrid","São Paulo","Berlim")// permite alteracoes

    val h1 = hashMapOf<String,String>(Pair("França","Paris"), Pair("key","value")) // chave-valor e pode realizar operações

    //não tem diferença entre hashmap e mapOf
    val h3= mapOf<String,String>(Pair("França","Paris"), Pair("key","value"))
    val h2= mutableMapOf<String,String>(Pair("França","Paris"), Pair("key","value"))
}