package basic

fun main() {
  var index: Int = 0
    while(index < 100){
        println(index)
        index++

        if(index == 50){
            break
        }
    }
    var l: Int = 10
    do{
     println(l)
     l+=5
    }while(l <= 100)
}