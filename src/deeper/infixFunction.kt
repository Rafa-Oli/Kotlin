package deeper
class Person(val name: String){
    infix fun isName(value: String): Boolean{
        return value == name
    }
}
infix fun Int.isHalfOf(value: Int) = value / 2 == this


fun main(){
 10.isHalfOf(40) // sem infix
 10 isHalfOf 30 //com infix

    val p1: Person= Person("Gabriel")
    p1 isName "Gabriel" //com infix


}