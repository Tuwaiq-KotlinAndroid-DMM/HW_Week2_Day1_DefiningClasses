fun main() {
    println("Enter the length : ")
    var length = readLine()!!.toInt()
    println("Enter the width: ")
    var wigth = readLine()!!.toInt()
    var Rec = Rectangle(length,wigth)
    println( "perimeter: ${Rec.getPer()}")
    println("area : ${Rec.getArea()}")
    println(Rec.draw())
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
        for (U in 1.. width){
            for (M in 1 .. length){
                print("*")
            }
            println("")
        }
        return "welcome"
    }
}