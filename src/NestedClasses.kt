fun main(args: Array<String>) {
        var outerAnimal = OuterAnimalclass()
        var nestedLion = OuterAnimalclass.StationLionClass()
        var innerTiger = OuterAnimalclass().NonStaticTigerClass()

    innerTiger.printAnimalname()
}

class OuterAnimalclass{
    private var animalName: String = "Animal"

    class StationLionClass{
        fun printAnimalName(){
          /*
            println(animamlName) // Static classes can not
            // access members of the the enclosing class


           */
        }

    }

    inner class NonStaticTigerClass {
        fun printAnimalname(){
            println(animalName)
        }
    }
}