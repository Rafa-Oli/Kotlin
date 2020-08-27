package moreClasses
class Computer(val processorModel: String){


    inner class Memory(){ // inner garante que a classe memory seja a interna, e podendo ter acesso a classe externa
        fun getMemoryLevel(): Int{
            println(processorModel)
            return 70
        }
    }
}


fun main(){
val m1: Computer.Memory= Computer("Intel").Memory()
m1.getMemoryLevel()

}