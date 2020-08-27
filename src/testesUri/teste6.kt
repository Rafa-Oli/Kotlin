package testesUri

import java.io.BufferedReader


fun main(){
    val list = mutableListOf<String>()

    var c: Boolean = true

    var exp: String= readLine()!!

    while(exp!= null) {


        if (exp.filter { it in "()" }.length % 2 == 0) {
            list.add("correct")
        } else {

            list.add("incorrect")

        }

    }

    for (i in list){
        println(i)
    }
}