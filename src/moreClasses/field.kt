package moreClasses

class Car(val model:String, val maxSpeed: Int){
    var currentSpeed: Int = 0
    set(value){
        if(value > maxSpeed){
            throw Exception("Velocidade maior que a permitida!")
        }else{
            field= value
        }
    }
}

fun main(){
    val c1= Car("",220)
    c1.currentSpeed= 50
    println(c1.currentSpeed)
}