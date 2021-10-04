fun main (){
var book1 = book("Game of Thrones", "George Martin",54.00 )
    var book2 = book("We Were Liars", "E. Lockhart",30.00 )


    book1.bookDetails(true)
    book2.bookDetails(false)

}
class book( var title:String,var author:String, var price:Double ){
var bookTitle = title
    var bookAuthor = author
    var bookPrice = price


    fun bookDetails( instock:Boolean){
      var stock = if(instock) {
          "In stock"
       }else  {
            "Out of stock"
        }

        println("** Book Details **\n Name: ${title}\n Author: ${author}\n " +
                "Price: $${price}\n Availability: ${stock}\n")

    }
}