package ordenacao

fun insertionSort(list: MutableList<Int> = mutableListOf()): List<Int>{

    for (i in 1 until list.count()){
        val key= list[i]
        var j = i
        while (j > 0 && list[j-1] > key){
           list[j]=list[j-1]
        j-=1
        }
        list[j]= key
    }
  return list
}

fun main(){
    val list = mutableListOf(10,9,4,52,3,7,8)
   var insertion= insertionSort(list)
   println(insertion)


}