package deeper


private fun Operator(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    val ret = op(x, y)
    return ret
}
fun Sum(x: Int, y: Int) = x + y
fun Multiply(x: Int, y: Int) = x * y

fun main() {

    Operator(1, 2, ::sum)
    Operator(1, 2, ::multiply)


    val l1 = {a: Int,b: Int ->a+b}
    val l2: (Int,Int) -> Int = { numerador, i -> numerador + i}
    Operator(10,20,l1)
    Operator(10,20,l2)

}