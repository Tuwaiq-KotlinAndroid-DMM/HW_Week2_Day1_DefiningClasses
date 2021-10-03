fun main() {
    // Part 3 - Classes challenge (Optional) love it :)
    println("Please enter length: ")
    var length = readLine()!!.toInt()
    println("Please enter width: ")
    var width = readLine()!!.toInt()
    var rectangle = Rectangle(length, width)
    println("---------------")
    println("Rectangle perimeter is ${rectangle.getPer()}")
    println("Rectangle area is ${rectangle.getArea()}")
    rectangle.draw()
}

class Rectangle(var length: Int, var width: Int) {
    fun getPer(): Int {
        return length * 2 + width * 2
    }
    fun getArea(): Int {
        return length * width
    }
    fun draw() {
        println() // Just for more space before drawing the rectangle
        for (line in 1..length) {
            for (star in 1..width)
                print("* ")
            print("\n")
        }
    }
}