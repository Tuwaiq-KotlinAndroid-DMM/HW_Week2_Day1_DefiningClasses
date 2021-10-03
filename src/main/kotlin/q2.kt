//Q2

fun main() {
    bookDetails()

    var book = Book("scream", "tomas", 30.0)

    println("name: ${book.bookTitle}  author: ${book.bookAuthor}  price: ${book.bookPrice} ")


}

class Book(title: String, author: String, price: Double) {

    var bookTitle = title
    var bookAuthor = author
    var bookPrice = price
}

fun bookDetails() {

    var inStock = true

    if (inStock) {
        println(" book in stock")

    } else {
        println("book out of stock")
    }

}

