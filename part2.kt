//Part II - Practice with Instance Constructing and Class Functions.

class Book (title: String, Author:String, price:Double, availability:Boolean)

{
    var title: String= title
    var Author: String= Author
    var price: Double= price
    var availability:Boolean= availability
    fun bookdetails(){
        println(".....Book details.....")
        println("$title")
        println("$Author")
        println(price)
        println(availability)
    }
}
fun main(){
    var Book1 = Book("Game of thrones", "George Martin", 54.00, false)

    var Book2 = Book("We Were Liars", "E. Lockhart", 30.00, true)

    println(Book1.bookdetails())
    println(Book2.bookdetails())
}