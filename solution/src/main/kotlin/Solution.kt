fun main(args: Array<String>) {
    //Part I - Practice with Class Defining.
    class Car(model: String, year: Int) {
        var model: String = model
        var year: Int = year
    }

    var myCar = Car("Toyota", 2022)
    println("This Car's model is : " + myCar.model + " and the car's year of production is " + myCar.year)

    /////////////////////////
    //Part II - Practice with Instance Constructing and Class Functions.

    var firstBook = Book("Game of Throne", "George Martin", 54.00, true)

    println(
        "---Book Details--- \n Name: " + firstBook.title +
                "\n Auther: " + firstBook.auther + "\n Price: " + firstBook.price +
                "\n Availibility:" + firstBook.bookDetails()
    )

    var secondBook = Book("We Were Lairs", "E. Lockhart", 30.00, false)
    println(
        "---Book Details--- \n Name: "
                + secondBook.title + "\n Auther: " + secondBook.auther + "\n Price: "
                + secondBook.price + "\n Availibility:" + secondBook.bookDetails()
    )
    ///////////////////////////////
    //Part III - (Optional) Classes Challenge.
    println("Enter the length of Rectangle:")
    var length = readLine()!!.toInt()
    println("Enter the width of Rectangle:")
    var width = readLine()!!.toInt()
    var rec = Rectangle(length, width)

    println("Perimeter Of Rectangle is:" + rec.getPer())
    println("Area Of Rectangle is:" + rec.getArea())
    rec.draw()


}

// for Part 2 Solution
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
/////////////////////////////////////

// for Part 3 solution
class Rectangle(length: Int, width: Int) {
    var length: Int = length
    var width: Int = width
    fun getPer(): Int {
        var perimeter = 2 * (length + width)
        return perimeter
    }

    fun getArea(): Int {
        var area = length * width
        return area
    }

    fun draw() {

        for (l in 1..length) {
            for (w in 1..width) {
                print("* ")
            }
            print("\n")
        }
    }
}

