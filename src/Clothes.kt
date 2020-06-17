class Clothes(var material:String,var colour:String,var price:Int) {

    fun display(){
        println("${material},${colour},${price}")
    }

}

fun main(){

    var cloth=Clothes("Shifon","Blue",500)

    cloth.display()
}