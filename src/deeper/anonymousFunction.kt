package deeper

private fun operator(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    val ret = op(x, y)
    return ret
}
fun main(){
    operator(1,2, fun(n1: Int, n2: Int): Int{ // a diferença de funcao anonima para lambdas é que pode fazer varios trechos de codigos
        return n1+n2
    })
}