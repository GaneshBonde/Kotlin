fun main(args: Array<String>) {
var myPerson = Person()
    myPerson.name="Aaron"
    println(myPerson.name)
    var myStudent = Student()
    myStudent.name = "Mark"
    println(myStudent.name)
    myStudent.studentId=1234567
    println(myStudent.studentId!!)
}
open class Person{
    var name: String? = null
    var age: Int? = null
    var height: Int? =null
}

class Student: Person(){
    var studentId : Int?=null
}

class Employee(): Person(){
    var employeeId: Int? =null

}