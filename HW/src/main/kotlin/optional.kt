//part#3
fun main() {
   println("Enter the length : ")
    var length = readLine()!!.toInt()
   println("Enter the width: ")
    var wigth = readLine()!!.toInt()
   var z = Rectangle(length,wigth)
    println( "perimeter: ${z.getPer()}")
    println("area : ${z.getArea()}")
   println(z.draw())
}
class Rectangle (_length : Int , _width :Int) {
    var length: Int = _length
    var width: Int = _width
    fun getPer(): Int {
        return 2 * (length + width)
    }

    fun getArea(): Int {
        return length * width
    }

    fun draw() {
        for (U in 1..width) {
            for (M in 1..length) {
                print("*")
            }
            println("")
        }

    }
}