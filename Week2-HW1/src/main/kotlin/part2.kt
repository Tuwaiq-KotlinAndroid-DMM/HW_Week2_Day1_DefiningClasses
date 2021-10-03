fun main () {

var xBookx = Book ("Title: How to focus", "Name: joe simon" , 40.50 )
    xBookx.Bookdetails()
}
class Book(Booktitle: String, Author: String, thebookPrice: Double) {
    var myBook = Booktitle
    var theAuthor = Author
    var bookPrice = thebookPrice

fun Bookdetails() {
    println (theAuthor)
    println("price:\$${bookPrice}")

    var Available = true
    if (Available) {
        println("book is Available")
    } else
        println("book is not Available")
}}

