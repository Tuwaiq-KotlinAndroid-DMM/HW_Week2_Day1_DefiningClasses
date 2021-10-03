import java.awt.print.Book

//part 1
//make decleration for the class
//properties

//class Car(){
//    var companyModel: String = "Toyota"
//    var yearOfManufacture: Int = 2020
//
//}
////Instance variables :object-> put the value
//fun main()
//{
//    var carInfo = Car ()
//
//    println("${carInfo.companyModel}, ${carInfo.yearOfManufacture}")
//}




//part2

//fun main() {
//// II - Practice with Instance Constructing and Class Functions
//    var book1 = Book("Game of Thrones", "George Martin", 54.00)
//    var book2 = Book("We Were Liars", "E. Lockhart", 30.00)
//
//    book1.bookDetails(true)
//    book2.bookDetails(false)
//
//}
//
//class Book(title: String, author: String, price: Double) {
//    var title = title
//    var author = author
//    var price = price
//
//    fun bookDetails(inStock: Boolean) {
//        var checkInStock =
//            if (inStock) "In stock"
//            else "Out of stock"
//
//        println(
//            "--- Book Details ---\n" +
//                    "Name: $title \n" +
//                    "Author: $author\n" +
//                    "Price: \$$price \n" +
//                    "Availability: $checkInStock\n"
//        )
//
//    }
//}




//part3


//fun main() {
//
//
//    var rectangleLength = 0
//    var rectangleWidth = 0
//
//     while loop
    // try - catch
//    -> to make sure the user enter a positive integer value without stop program */
//    while (rectangleLength <= 0) {
//        println("Please enter length as an positive integer number")
//        rectangleLength = try { (readLine() ?: "").toInt() } catch (e: NumberFormatException) { 0 }
//    }
//
//    while (rectangleWidth <= 0) {
//        println("Please enter width as an positive integer number")
//        rectangleWidth = try { (readLine() ?: "").toInt() } catch (e: NumberFormatException) { 0 }
//    }
//
//
//    var rectangle1 = Rectangle(rectangleLength, rectangleWidth)
//    rectangle1.run {
//        println(
//            "Rectangle perimeter is ${getPer()} \n" +
//                    "Rectangle area is ${getArea()} \n"
//        )
//        draw()
//    }
//
//}
//
//class Rectangle(length: Int, width: Int) {
//    var length = length
//    var width = width
//
//    fun getPer(): Int {
//        return (2 * length + 2 * width)
//    }
//
//    fun getArea(): Int {
//        return length * width
//    }
//
//    fun draw() {
//        for (i in 1..width) {
//            for (i in 1..length) {
//                print("* ")
//            }
//            print("\n")
//        }
//
//    }
//}
