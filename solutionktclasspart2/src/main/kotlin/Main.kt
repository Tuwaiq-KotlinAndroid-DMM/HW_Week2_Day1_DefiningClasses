import jdk.jfr.BooleanFlag

class Book(title: String, price: Double, author:String, availability:Boolean) {
var title:String="زهايمر"
    var author:String="غازي القصيبي"
    var price:Double=20.50
   var availability:Boolean=availability
    fun bookdetails() {
        println(title)
        println(price)
        println(author)
        if(availability==true)
            println("inStock")
        }
    }
fun main(){
    var book1=Book("زهايمر",20.50,"غازي القصيبي",true)
    println(book1.bookdetails())


}


