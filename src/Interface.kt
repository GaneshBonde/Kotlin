fun main(args: Array<String>) {
    var myNexus = NexusClass()
    println(myNexus.getName() + " - "
            +myNexus.getRam()+" - "+myNexus.getCPUType())

    var myIphone = IphoneClass()
    println(myIphone.getName()+" - "+
            myIphone.getRam()+ " - "+ myIphone.getCPUType())
}

interface ComputerInterface{
    fun getName(): String
    fun getRam(): Int
    fun getCPUType(): String
}

// Multiple classes can implement this interface

class NexusClass:ComputerInterface{
    override fun getRam(): Int {
        return 1000
    }

    override fun getCPUType(): String {
        return "Snapdragon"
    }

    override fun getName(): String {
        return "Nexus 6"
    }

}

class IphoneClass: ComputerInterface{
    override fun getName(): String {
        return "iPhone 7"
    }

    override fun getRam(): Int {
        return 3000
    }

    override fun getCPUType(): String {
        return  "A5"
    }

}