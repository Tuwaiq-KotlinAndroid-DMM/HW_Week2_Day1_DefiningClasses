fun main() {
    var myCar = car()
        println(myCar.model)
        println(myCar.year)
        println("\n")

    var thebook = book()
    print(thebook.bookDetails())
    println("\n")
    var theSecbook = book()
        theSecbook.title = "We Were Liars"
        theSecbook.author = "E. Lockhart"
        theSecbook.price = 30.0
        theSecbook.inStock = false

        println(theSecbook.bookDetails())




}

class car {
    var model: String = "Toyota"
    var year: Int = 2020

}


class book() {
     var title: String = "Game of Thrones"
     var author: String = "George Martin"
    var price: Double =  54.00
    var inStock:Boolean = true


    fun bookDetails():String{

       return "The book title : ${title} \n The author name: ${author} \n The price: $ ${price} ,\n Availability : ${inStock()} \n"
    }
    fun inStock():Boolean {
        return inStock
    }
}



