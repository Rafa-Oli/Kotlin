package testesUri

fun maior(num1: Int,num2: Int, num3: Int){
   var maior1= (num1+num2+ (Math.abs(num1-num2)))/2
   var maior2= (num1+num3+ (Math.abs(num1-num3)))/2
   var maior3= (num2+num3+ (Math.abs(num2-num3)))/2
    if(maior1 == num1){
        if(maior2==num1){
            println("$num1 eh o maior")
        }else{

            println("$num3 eh o maior")
        }
    }else if(maior1==num2){
        if(maior3==num2){
            println("$num2 eh o maior")
        }else{

            println("$num3 eh o maior")
        }
    }

}



fun main(){

    val (n1,n2,n3) = readLine()!!.split(' ').map(String::toInt)
    maior(n1,n2,n3)


}