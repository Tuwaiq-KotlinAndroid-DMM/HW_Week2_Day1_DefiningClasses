//part#2
fun main(){
    var Book1 = Book("Game of Throne", "George Martin", 54.00, true)

    println(
        "---Book Details--- \n Name: " + Book1.title +
                "\n Auther: " + Book1.auther + "\n Price: " + Book1.price +
                "\n Availibility:" + Book1.bookDetails()
    )

    var Book2 = Book("We Were Lairs", "E. Lockhart", 30.00, false)
    println(
        "---Book Details--- \n Name: "
                + Book2.title + "\n Auther: " + Book2.auther + "\n Price: "
                + Book2.price + "\n Availibility:" + Book2.bookDetails())
}

class Book(title: String, auther: String, price: Double, availibility: Boolean) {
    var title: String = title
    var auther: String = auther
    var price: Double = price
    var availibilty = availibility

    fun bookDetails(): String {

        if (availibilty == true) {
            return "In Stock"
        } else {
            return "Out of Stock"
        }

    }
}
