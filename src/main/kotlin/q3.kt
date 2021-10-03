//Q3
fun main() {
    println("please enter length")
    var length = readLine()!!.toInt()
    println("please enter width")
    var width = readLine()!!.toInt()

    var rectangle = Rectangle(length, width)

    rectangle.getPer()
    rectangle.getArea()
    println(rectangle.draw())
}

class Rectangle(length: Int, width: Int) {
    var rwidth: Int = width


    var rlength: Int = length


    fun getPer() {
        println("perimeter: ${2 * (rlength + rwidth)}")
    }

    fun getArea() {
        println(" area: ${rlength * rwidth}")
    }

    fun draw() {
        for (l in 0..rlength) {
            for (r in 1..rwidth) {
                print("*")
            }
            println("")
        }
    }
}
