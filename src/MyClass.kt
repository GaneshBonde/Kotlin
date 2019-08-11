fun main(args: Array<String>) {
    println("This is my first Kotlin app !!");

    var myPlaceHolder: String = " My Value";
    print(myPlaceHolder);

    myPlaceHolder =" Another value";
    print(myPlaceHolder)

    var myNumber = 20;
    print(myNumber)

    val myConstant = "Fixed Value";
    print(myConstant)

    //myConstant = " another Value"

    var myVariable: String?
    myVariable = null
    println(myVariable)

    var anotherVariable: String
    anotherVariable = null.toString()
    println(anotherVariable)

    val myConstan:Int?
    myConstan = null
/*
    var age =10;
    println("This is the age value "+ age)
    var childAge = readLine()
    println(childAge);
*/




/*
    println("Please enter a number")
    var myNumberInt: Int = readLine()!!.toInt();
    println(myNumberInt);
*/

    var myDecimalNumber: Float = 2.5f;
    var myPreciseDecimalNumber : Double = 2.1276575876;
    println(myDecimalNumber);
    println(myPreciseDecimalNumber);

    for (myNymber in 1..10){
        println("$myNumber Welcome !!!!!")
    }
}