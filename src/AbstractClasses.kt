fun main(args: Array<String>) {

}

abstract class AnimalClass{
    abstract fun getName(): String

    open fun getSpeed(): Int{
        return 2000
    }
}

class LionClass: AnimalClass(){
    override fun getName(): String {
        return "Lion"
    }

    fun getLionSpeed(): Int {
        return getSpeed()
    }
}

class TigerClass : AnimalClass(){
    override fun getName(): String {
        return "Tiger"
    }

    fun getTigerSpeed(): Int{
        return getSpeed()
    }
}