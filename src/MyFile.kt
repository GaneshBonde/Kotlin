fun main(args: Array<String>) {
        
    var myCar: Car = Car()
    myCar.speed = 200
    println(myCar.speed)

    var yourCar = Car()
    yourCar.power = 1000
    println(yourCar.power)
    println(yourCar.speed)

    println(Car().numberOfWheels)

    var myBoxer = Boxer("Mark", 2000, 3000)
    var animal = Animal(1000)
    var animal2 = Animal("My Lion", "Yellow",2000,2000)
    var myPanther = Animal(5000)
}

class Car {
    var speed: Int = 0
    var power : Int = 0
    var name : String = ""
    var numberOfWheels : Int =0
}

class Boxer(name: String, power: Int, speed :Int ){
    private var name: String = ""
    private var power: Int? = null
    private var speed:Int =0

    init{
        this.name = name
        println(name + " _ " + power + " _ "+speed)
    }
}

class Animal(power: Int){
    init{
        println(power)
    }
    constructor(name: String, color: String, speed: Int, power: Int):this(power){
        println(name+" _ "+color + " _"+speed +" _ "+power)
    }
}