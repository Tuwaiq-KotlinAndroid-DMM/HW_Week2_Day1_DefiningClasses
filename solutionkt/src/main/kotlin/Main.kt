//Solution Part1 "myCar"
//class Car()
class Car(){

    var model : String ="Toyota"
    var manifacturedYear : Int = 2020


}
fun main (){
    var mycar = Car()
    println(mycar.model)
    println(mycar.manifacturedYear)
}



//Solution Part2 "book"
class Book(name: String, author:String, price:Double, availability:Boolean)
{
     var name : String = name
     var author : String = author
     var price : Double = price
     var availability : Boolean = availability
        fun bookdetails(){
            println(".....Book details.....")
            println("$name")
            println("$author")
            println(price)
            println(availability)

        }



}
fun main(){
    var Book1 = Book("name: Game of thrones", "Author: George Martin", 54.00, false)

    var Book2 = Book("name: We Were Liars", "Author: E. Lockhart", 30.00, true)

    println(Book1.bookdetails())
    println(Book2.bookdetails())
}



 */
//Solution part3

fun main() {
    println("Enter the length : ")
    var length = readLine()!!.toInt()
    println("Enter the width: ")
    var wigth = readLine()!!.toInt()
    var x = Rectangle(length,wigth)
    println( "perimeter: ${x.getPer()}")
    println("area : ${x.getArea()}")

    println(x.draw())
}
class Rectangle (_length : Int , _width :Int){
    var length : Int = _length
    var width : Int = _width
    fun getPer() : Int{
        return 2 * (length + width)
    }
    fun getArea(): Int{
        return length * width
    }
    fun draw( ):String{
        for (A in 1.. width){
            for (E in 1 .. length){
                print("* ")
            }
            println("")

        }
        return ("")
    }
}
