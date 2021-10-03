/* creating a class named Book, with 3 instance variables, title of type String, author
 of type String, and price of type Double, and one instance function bookDetails() to print
 on the screen the book's details.
 */
class Book(_title: String, _author: String, _price: Double) {
    var title: String = _title
    var author: String = _author
    var price: Double = _price
    var inStock: Boolean = false

    fun bookDetails() {
        println("--- Book Details ---")
        println("Name: $title")
        println("Author: $author")
        println("Price: $$price")
        if (inStock == true) {
            println("Availability: In stock ")
        } else {
            println("Availability: Out of stock")
        }

    }
}