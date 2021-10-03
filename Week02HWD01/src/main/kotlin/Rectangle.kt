/*creating a Rectangle class, with two instance variables, length
of type Int, and width of type Int, with 3 functions, getPer() to
calculate and return the perimeter of the rectangle, getArea() to
calculate and return the area of the rectangle, and draw() to draw
a rectangle using starts
 */
class Rectangle(_length: Int, _width: Int) {
    var length: Int = _length
    var width: Int = _width

    fun getPer(): Int {
        return 2 * (length + width)
    }

    fun getArea(): Int {
        return length * width
    }

    fun draw() {
        for (i in 1..length) {
            for (j in 1..width) {
                print("* ")
            }
            println()
        }
    }

}