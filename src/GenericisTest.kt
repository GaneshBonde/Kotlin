fun main(args: Array<String>) {
    var myAnimal = GenericsAnimalTest("Lion")
    var myAnimal2 = GenericsAnimalTest(20)
}

class GenericsAnimalTest<T>(kind: T){

    init {
        println(kind)
    }
}