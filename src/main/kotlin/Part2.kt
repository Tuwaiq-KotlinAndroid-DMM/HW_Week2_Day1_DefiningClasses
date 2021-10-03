class Book(_Name: String, _Price: Double,_Author:String,_Availability:Boolean) {
    var Name: String = _Name
    var Price: Double = _Price
    var Author: String = _Author
    var Availability:Boolean= _Availability
    fun bookdetails(){
        println("--------------------------------")
        println("$Name")
        println(Price)
        println("$Author")
        println(Availability)


    }
}

fun main(){

    var book1 = Book("gameOfThrones",54.00,"George Martin",false)
    var book2 = Book("We Were Liars",30.00,"E. Lockhart",true)
println(book1.bookdetails())
    println(book2.bookdetails())

}