import java.lang.Exception

fun main() {
    /*creating an object of type Car, assigning the model to
    Toyota, and the year to 2020
     */
    try {
        var car1 = Car()
        car1.model = "Toyota"
        car1.year = 2020
        println("car model is : ${car1.model}")
        println("car year is : ${car1.year}")


//promoting the user to enter book's details.
        println("Enter the name of the book: ")
        var bookName: String = readLine()!!
        println("Enter the author name: ")
        var authorName: String = readLine()!!
        println("Enter the price of the book: ")
        var price: Double = readLine()!!.toDouble()

        // promoting the user to enter rectangle width and length
        println("Enter the length of the rectangle: ")
        var length: Int = readLine()!!.toInt()
        println("Enter the width of the rectangle: ")
        var width: Int = readLine()!!.toInt()

        /*creating an object of type Book, and pass the information taken
    from the user.*/
        var book1 = Book(bookName, authorName, price)

        /* creating an object of type Rectangle, and pass the width and length
    taken from the user
     */
        var rectangle1 = Rectangle(length, width)

        //printout book details using bookDetails method
        book1.bookDetails()

        //printout perimeter, area of the rectangle and draw the rectangle
        println("\nRectangle perimeter is ${rectangle1.getPer()}")
        println("Rectangle area is ${rectangle1.getArea()}\n")
        rectangle1.draw()
    } catch (e: Exception) {
        println(e.message)
    }

}