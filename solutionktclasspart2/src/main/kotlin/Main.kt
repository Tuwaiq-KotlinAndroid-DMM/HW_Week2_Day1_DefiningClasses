import jdk.jfr.BooleanFlag

class Book(title: String, price: Double, author:String, availability:Boolean) {
var title:String=title
    var author:String=author
    var price:Double=price
   var availability:Boolean=availability
    fun bookdetails() {
        println(title)
        println(price)
        println(author)
        if(availability==true)
            println("inStock")
        else             println("out of Stock")

    }
    }
fun main(){
    var book1=Book("زهايمر",20.50,"غازي القصيبي",true)
    var book2=Book("حياة في الإدارة",40.50,"غازي القصيبي",false)

    println(book1.bookdetails())
    println(book2.bookdetails())


}


