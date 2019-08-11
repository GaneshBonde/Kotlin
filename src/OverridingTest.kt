fun main(args: Array<String>) {
    var myAnimal = AnimalX()
    myAnimal.fight()

    var myTiger = Tiger()
    myTiger.fight()
}

open class AnimalX{
    var name: String = ""

    open fun fight(){
        println("The animal is fighting")
    }
}

class Tiger: AnimalX(){
    override fun fight(){
        println("Fight Harder ")
    }
}