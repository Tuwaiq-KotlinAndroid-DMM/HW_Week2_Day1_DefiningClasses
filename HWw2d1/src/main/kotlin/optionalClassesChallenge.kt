fun main() {


    var rectangleLength = 0
    var rectangleWidth = 0

    /* while loop
    // try - catch
    -> to make sure user enter positive integer value without stop program */
    while (rectangleLength <= 0) {
        println("Please enter length as an positive integer number")
        rectangleLength = try { (readLine() ?: "").toInt() } catch (e: NumberFormatException) { 0 }
    }

    while (rectangleWidth <= 0) {
        println("Please enter width as an positive integer number")
        rectangleWidth = try { (readLine() ?: "").toInt() } catch (e: NumberFormatException) { 0 }
    }


    var rectangle1 = Rectangle(rectangleLength, rectangleWidth)
    rectangle1.run {
        println(
            "Rectangle perimeter is ${getPer()} \n" +
                    "Rectangle area is ${getArea()} \n"
        )
        draw()
    }

}

class Rectangle(length: Int, width: Int) {
    var length = length
    var width = width

    fun getPer(): Int {
        return (2 * length + 2 * width)
    }

    fun getArea(): Int {
        return length * width
    }

    fun draw() {
        for (i in 1..width) {
            for (i in 1..length) {
                print("* ")
            }
            print("\n")
        }

    }
}

