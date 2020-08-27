package deeper
data class Fraction(val numerator: Int,val denominator: Int){
    operator  fun plus(add: Fraction): Fraction{ //plus é soma
        if(denominator ==  add.denominator){
            return Fraction(numerator + add.numerator,denominator)
        }else{
            val comum= denominator * add.denominator
            return Fraction(((comum/denominator) * numerator) + ((comum/add.denominator) * add.numerator),comum)
        }
    }
    operator fun inc(): Fraction{ //operador incrmentador
      return this

    }
}

fun main(){
    val f1: Fraction= Fraction(3,2)
    val f2: Fraction= Fraction(5,3)
    println(f1+f2)
}
