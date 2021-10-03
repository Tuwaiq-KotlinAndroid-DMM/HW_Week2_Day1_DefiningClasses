//======================================================================================================================
//Part I - Practice with Class Defining.
//======================================================================================================================
class car{
    var model : String = "Toyota"
    var year : String = "2020"
}
//======================================================================================================================
//Part II - Practice with Instance Constructing and Class Functions.
//======================================================================================================================
class Book(t:String,a:String, p:Double) {

    var title : String = "Name: $t"
    var author : String = "Author: $a"
    var price : Double = p
    fun bookDetails(b:Boolean){
        var inStock : Boolean? = b
        if (inStock == true){
            println("Availability: In Stock")
        }else{
            println("Availability: Out of stock")
        }
    }
}
//======================================================================================================================
//Part III - (Optional) Classes Challenge.
//======================================================================================================================
class Rectangle( length : Int, Width : Int) {
    var i = length
    var j = 0
    var p = length + Width
    var a = length * Width
    fun getPer(l: Int, w: Int) { println("the perimeter of the rectangle = $p") }
    fun getArea(l: Int, w: Int) { println("the area of the rectangle = $a") }
    fun draw(length: Int, Width: Int) {
        while(i != 0){
            j = Width
            while(j != 0) {
                print("*")
                j--
            }
            println("")
            i--
        }
    }
}
//======================================================================================================================
fun main(args: Array<String>) {
    //==================================================================================================================
    //Part I - Practice with Class Defining.
    //==================================================================================================================
    /*Write a class named 'Car' with the following features:
    //------------------------------------------------------------------------------------------------------------------
    Instance variables :
    model for the car model of type String.
    year for the car year of type int.
    //------------------------------------------------------------------------------------------------------------------
    How it works:
    Create an instance of car
    Assign the values "Toyota" and "2020" to model and year variables respectively
    print the result*/
    //==================================================================================================================

    var Mycar = car()
    println(Mycar.model)
    println(Mycar.year)

    //==================================================================================================================
    //Part II - Practice with Instance Constructing and Class Functions.
    //==================================================================================================================
    /*Write a class named Book using primary constructor with following features:
    //------------------------------------------------------------------------------------------------------------------
    Instance variables :
    title for the title of book of type String.
    author for the author’s name of type String.
    price for the book price of type double.
    //------------------------------------------------------------------------------------------------------------------
    Instance functions:
    bookDetails(): This method well take a inStock boolean value to check if the book in stock or not,
    and then print out book’s details to the screen*/
    //==================================================================================================================

    print("Please Enter the name of the book: ")
    var t = readLine()!!.toString()
    print("Please Enter the name of the author: ")
    var a = readLine()!!.toString()

    var book = Book(t, a,54.00)
    println("--- Book Details ---")
    println(book.title)
    println(book.author)
    print("Price: ${book.price}$\n")
    println(book.bookDetails(b = true))

    //==================================================================================================================
    //Part III - (Optional) Classes Challenge.
    //==================================================================================================================
    /*Write a class named 'Rectangle' with following features.
    //------------------------------------------------------------------------------------------------------------------
    Instance variables :
    length for the length of rectangle of type int.
    width for the width of rectangle of type int.
    //------------------------------------------------------------------------------------------------------------------
    Instance functions:
    'getPer()' which return the perimeter of the rectangle.
    'getArea()' which return the area of the rectangle.
    'draw()' which draws rectangle by stars.
    //------------------------------------------------------------------------------------------------------------------
    How it work:
    Ask user to input length and width for a rectangle.
    Print the result.*/
    //==================================================================================================================
    println("Please Enter length: ")
    var l = readLine()!!.toInt()
    println("Please Enter width: ")
    var w = readLine()!!.toInt()
    var r = Rectangle(l,w)
    println(r.getPer(l,w))
    println(r.getArea(l,w))
    println(r.draw(l,w))



}