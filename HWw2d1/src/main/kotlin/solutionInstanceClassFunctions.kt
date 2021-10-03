fun main() {
//Part II - Practice with Instance Constructing and Class Functions
    var book1 = Book("Game of Thrones", "George Martin", 54.00)
    var book2 = Book("We Were Liars", "E. Lockhart", 30.00)

    book1.bookDetails(true)
    book2.bookDetails(false)

}

class Book(title: String, author: String, price: Double) {
    var title = title
    var author = author
    var price = price

    fun bookDetails(inStock: Boolean) {
        var checkInStock =
            if (inStock) "In stock"
            else "Out of stock"

        println(
            "--- Book Details ---\n" +
                    "Name: $title \n" +
                    "Author: $author\n" +
                    "Price: \$$price \n" +
                    "Availability: $checkInStock\n"
        )

    }
}