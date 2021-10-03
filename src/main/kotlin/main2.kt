//part 3
class Rectangle {
    var length: Int? = null
    var width: Int? = null

    val per: (Int, Int) -> Int = { l, w -> 2 * (w + l) }
    val area: (Int, Int) -> Int = { l, w -> w * l }
}

fun main() {
    val rect = Rectangle()
    with(rect) {
        print("Enter the length:")
        length = readLine()!!.toInt()
        print("Enter the width:")
        width = readLine()!!.toInt()
    }
    fun numbe(number: (num1: Int, num2: Int) -> Int) {
        println(number(rect.length!!, rect.width!!))
    }
    numbe(rect.per)
    numbe(rect.area)
    // this for draws rectangle
    for (j in 1..rect.length!!) {
        for (i in 1..rect.width!!) {
            print(" * ")
        }
        println()
    }
}
