class Rectangle (_length : Int , _width :Int){
    var length : Int = _length
    var width : Int = _width

    fun getPer() : Int{
        return 2 * (length + width)
    }
    fun getArea(): Int{
        return length * width
    }
    fun draw( ){
        for (i in 1.. length){
            for (j in 1 .. width){
                print("*")
            }
                println("")
        }

    }
}


fun main(args: Array<String>) {
    println("Enter the length : ")
    var length = readLine()!!.toInt()

    println("Enter the width: ")
    var wigth = readLine()!!.toInt()

   var a = Rectangle(length,wigth)

    println( "perimeter: ${a.getPer()}")
    println("area : ${a.getArea()}")
    println(a.draw())
}
