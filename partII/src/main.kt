class Book{
    var title:String = ""
    var author:String = ""
    var price:Double = 0.0
    var isInStock:Boolean = true

    fun inStockOrNot() {
        isInStock = true
    }

}

fun bookDitails(){
    var bookInfo = Book()
    var bookInfo2 = Book()


    bookInfo.title = "Game of Thrones"
    bookInfo.author = " George Martin"
    bookInfo.price = 54.00

    println("--- Book '1' Details ---")
    println(bookInfo.title)
    println(bookInfo.author)
    println("$${bookInfo.price}")
    bookInfo.inStockOrNot()
    if (bookInfo.isInStock){
        println("In Sotck")
    }else{
        println("Out of stock")
    }

    println("--- Book '2' Details ---")
    bookInfo2.title = "We Were Liars"
    bookInfo2.author = "E.Lockhart"
    bookInfo2.price = 30.00


    println(bookInfo2.title)
    println(bookInfo2.author)
    println("$${bookInfo2.price}")
    bookInfo2.inStockOrNot()
    if (!bookInfo2.isInStock){
        println("In Sotck")
    }else{
        println("Out of stock")
    }
}

fun main(){
    bookDitails()
}