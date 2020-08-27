package moreClasses

sealed class Result{ // garante herança com uma limitação dentro de um msm arquivo que a classe esta, e nenhuma classe fora desse arquivo pode ter acesso
    class Sucess(val message: String): Result()
    class Error(val message: String ,val errorCode: Int): Result()
}

class Repo{
    fun execute(): Result{
        //return Result.Sucess("Deu certo")
        return Result.Error("Deu error",404)
    }}
fun main() {
val r1= Repo()
    r1.execute()
    val result: Result= r1.execute()
    when(result){
        is Result.Sucess -> {
            println("Deu sucesso!")
        }
        is Result.Error ->{
            println("Deu erro!")
        }
    }
}