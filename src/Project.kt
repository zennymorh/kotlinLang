//Declaring the class
class User {
 //Creating properties of the class
    var name : String = ""
    var age: Int = 0
    var sex: String = ""
    var email: String = ""
}
//Main method where the code runs
fun main(){
//creating an object of the class
    val user = User()

    println("Enter your name: ")
//Getting input from user and saving it
    user.name = readLine().toString()

    println("How old are you? ")
    user.age = readLine().toString().toInt()

    println("Enter your sex(e.g male): ")
    user.sex = readLine().toString()

    println("Enter your email: ")
    user.email = readLine().toString()

    println("Your name is " + user.name + ", you are " + user.age +" years old. " + "You are a " + user.sex + " and your email address is: " + user.email)

}
/*
* Class names always begin with a capital letter.
    Constructors are defined at the top in parentheses. They can also be initialized there to have a default.
    To create an instance of a class, we call the constructor as if it were a regular function
    * All classes except specified otherwise inherit from the default subclass Any
    * Functions in a superclass can be overridden by methods of the subclass that inherits from it
* */

//