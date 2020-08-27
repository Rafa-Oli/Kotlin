package testesUri



fun numImpares(num: Int): List<Int>{
   val list= mutableListOf<Int>()

  if(num in 1..1000) {
      for (i in 1..num) {
          if (i % 2 != 0) {
              list.add(i)
          }
      }
  }
    return list
}

fun main(){
    val num:Int
    num= readLine()!!.toInt()

   numImpares(num).forEach { println(it) }


}

