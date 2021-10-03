class Books (_title : String , _author : String , _price : Double ) {
    var title: String = _title
    var author : String = _author
    var price :Double = _price
    var availability : Boolean = true
    lateinit var availabilityInStockOrNot : String
    fun bookDetails():String{
        if (availability)
            availabilityInStockOrNot = " In stock"
        else
            availabilityInStockOrNot = "Out of stock"

       return  "--- Book Details --- \n" +
        "Name: $title \n" +
        "Author: $author \n" +
        "Price: $price $ \n" +
        "availability: $availabilityInStockOrNot \n"
    }

}

fun main(args: Array<String>) {

    // Solution (input from user)
    println("Enter the title book")
    var titleBook = readLine()!!.toString()

    println("Enter the author: ")
    var authorBooks = readLine()!!.toString()

    println("Enter the price: ")
    var priceBook = readLine()!!.toDouble()

    var book = Books(titleBook,authorBooks,priceBook)

    println(book.bookDetails())


    // another Solution
    var book1 = Books("Game of Thrones" , "George Martin", 54.00)
    println(book1.bookDetails())

    var book2 = Books ("We Were Liars","E. Lockhart",30.0)
    println(book2.bookDetails())




}
