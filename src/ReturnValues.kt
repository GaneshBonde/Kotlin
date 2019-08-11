var score = 100
fun main(args: Array<String>) {
    var myNumber =multiply(2,4)
    println(myNumber)
    subtract()
    outputArgument("Something")
    outputArgument(20)
    outputArgument(3.765789)

    var age = 20
    age = 21
    println(score)
}

fun multiply(firstNumber: Int , secondNumber: Int): Int{
    var result = firstNumber * secondNumber
    return result
}

fun subtract(firstNumber: Int = 20, secondNumber: Int =15) : Unit{
    println(firstNumber-secondNumber)
}

fun outputArgument(stringParameter: String){
    println(stringParameter)
}

fun outputArgument(integerParameter: Int){
    println(integerParameter)
}

fun outputArgument(doubleParameter: Double){
    println(doubleParameter)
}