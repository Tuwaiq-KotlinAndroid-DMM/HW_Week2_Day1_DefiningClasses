fun main() {
    // Part 2 - Practice with instance constructing and Class Functions
    var book1 = Book("Game of Thrones", "George Martin", 54.00)
    var book2 = Book("We Were Liars", "E. Lockhart", 30.00)

    book1.bookDetails(true)
    book2.bookDetails(false)
}

class Book(var title: String, var author: String, var price: Double) {

    fun bookDetails(inStock: Boolean) {
        var isInStock = if (inStock) "In stock" else "Out of stock"
        println("--- Book Details ---")
        println("Name: $title\nAuthor: $author\nPrice: \$$price\nAvailability: $isInStock\n")
    }
}
