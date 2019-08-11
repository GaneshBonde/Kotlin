fun main(args: Array<String>) {
    var myLion:Animal2 = Animal2()
    myLion.animalName="Some Name"
    println(myLion.animalName)

    var iPhone = Computer()

}

class Animal2{
    public var animalName:String = ""
}
class Computer{
    private var computerName:String =""
}

open class Person2{
    protected var personName: String = ""
}

class Student2 : Person2(){
    fun changePersonName(){
        personName = "Some Name"
    }
}