class Rectangle(_length:Int,_width:Int){
    var length:Int = _length
    var width:Int = _width

    fun getPer(){
        println("Rectangle perimeter is:${2*(length+width)}")
    }

    fun getArea(){
        println("Rectangle area is: ${length*width}")
    }

    fun draw(){
        for(i in 1..length){
            for (j in 1..width){
                print("*")
            }
            println("")
        }
    }
}

fun main(){
    println("Please Enter length:")
    var length = readLine()!!.toInt()
    println("Please Enter width:")
    var width = readLine()!!.toInt()

    var rectangle= Rectangle(length,width)

    rectangle.getPer()
    rectangle.getArea()
    println(rectangle.draw())
}