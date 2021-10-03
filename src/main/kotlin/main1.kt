//part 2
class Book(var title:String, var author:String, var price:Double){


    fun stock(a:String){
        if (a == "yes")
            println("Availability: In stock")
        else
            println("Availability:Out of stock")

    }
}
fun main() {
    println("--- Book Details ---")
    val book1 = Book("Jane Eyre", "Charlotte Bronte", 55.5)
    with(book1) {
        println("Name:$title")
        println("Author:$author")
        println("Price:$$price")
        stock("yes")
    }
    println("--- Book Details ---")
    val book2 = Book("The Great Gatsby", "F.Scott Fitzerald", 70.5)
    with(book2) {

        println("Name:$title")
        println("Author:$author")
        println("Price:$$price")
        book2.stock("no")
    }
}