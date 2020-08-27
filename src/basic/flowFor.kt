package basic

fun main() {
    val str = "Rafaela Oliveira"
    val numImpares = mutableListOf("(fsaf)","asdsafds()",")dfsf")

    for(i in numImpares){
     if(i.filter { it in "()"}.length % 2 == 0 ){
      println("correct")


      }else{
         println("incorrect")
     }
    }
/*
    val num = mutableListOf(4,2,6)
    for(c in str){
        //print(c)
    }
    for(i in 1..100 step 2){
    //   print(i)
    }
    for(j in 100 downTo 0){ //contagem descrecente
       // print("$j ")
    }
numImpares.sort()
println(numImpares)

numImpares.reverse()
println(numImpares)


for(t in numImpares.withIndex()){
    if(t.index % 2 == 0) println(t)

     }
*/


    }
