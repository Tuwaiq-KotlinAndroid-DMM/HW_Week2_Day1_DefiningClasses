fun main()
{

var instance=Car()
    instance.model="Toyota"
    instance.year=2020
    println("Model: "+instance.model)
    println("Year: "+instance.year)


var instance2=Book("Game of Thrones ","George Martin",54.00)
    instance2.bookDetails(true)
    var instance22=Book("We Were Liars","E. Lockhart",30.00)
    instance22.bookDetails(false)


var instance3=Rectangle()
println("Enter length")
var ulength= readLine()!!.toInt()
println("Enter width")
var uwidth= readLine()!!.toInt()

    instance3.length=ulength
    instance3.width=uwidth
    println("Area is: "+instance3.getarea( ))
    println("perimeter is: "+instance3.getper())
    instance3.draw()







}



class Car
{
    lateinit var model:String
    var year:Int=0
}


class Book(title:String,author:String,price:Double)
{
    init {
        var stock:Boolean=true
    }
var title:String=title
var author:String=author
var price:Double=price

    fun bookDetails(stock:Boolean)
    {
        if(stock==true)
        {
            println("--- Book Details ---")
            println("name: $title")
            println("Author: $author")
            println("Price: $price")
            println("Availability: In stock ")

        }
        else
        {
            println("--- Book Details ---")
            println("name: $title")
            println("Author: $author")
            println("Price: $price")
            println("Availability: Out of stock ")
        }
    }
}


class Rectangle()
{
   var length:Int = 0
    var width:Int = 0

    fun getper():Int
    {
        var per= 2*(length+width)
    return per
    }


    fun getarea():Int{
        var area=(length * width)
        return area
    }

    fun draw()
    {
        var w= mutableListOf<String>()
        var i=0
        for (i in 1..length)
        {


            for (j in 1..width)
            {
                print("*")

            }
            println()

        }

    }
}