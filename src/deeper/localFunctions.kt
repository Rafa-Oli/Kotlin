package deeper

import java.text.SimpleDateFormat
import java.util.*
fun log(string: String){
    println(string)
}
fun top(){
    fun log(str: String){
        val calendar= Calendar.getInstance()
        val formated= SimpleDateFormat("HH:mm:ss")
        println("$str- ${formated.format(calendar.time)}")
    }
    log("Inicio") // sabe que é a função interna
    deeper.log("") //função externa
    val interval= 1..100000000
    var sum: Double= 0.0
    for(i in interval){
        sum += i * 2 *1
    }
    log("fim")

}

fun main(){
top()
}