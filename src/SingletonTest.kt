fun main(args: Array<String>) {
    var mySamsunGalaxy = SamsunGalaxy.theOnlyGalaxyS8Instance
    mySamsunGalaxy.name= "Galaxy Note"

    println(mySamsunGalaxy.name)

    var yourSamsumgGalaxy = SamsunGalaxy.theOnlyGalaxyS8Instance

    println(yourSamsumgGalaxy.name)
}

class SamsunGalaxy{
    var name : String= "Galaxy S8"

    private constructor(){
        println("$name is created ")
    }

    companion object{
        val theOnlyGalaxyS8Instance : SamsunGalaxy by lazy {SamsunGalaxy()}
        // Everytime the time instance is sent back.
        // This instance is created only once
    }
}