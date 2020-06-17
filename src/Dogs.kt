//Initializing primary constructors
//Constructor variables
//member var must have same names as constructor var
class Dogs constructor(var breed: String, var color: String, var age: Int){

    fun eat(){
        println("${breed}s eat food")

    }

    fun bark(){
        println("${breed}s bark")

    }
}

fun main(){
    val dog1=Dogs("Labrador","Brown",3)
    dog1.eat()
    dog1.bark()
    println("Info Displayed")

    val dog2=Dogs("German Shepherd","Black",2)
    dog2.eat()
    dog2.bark()
    println("Info Displayed")
}