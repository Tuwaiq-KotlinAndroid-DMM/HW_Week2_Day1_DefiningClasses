
class Rectangle(var length:Int, var wedth:Int){

fun getper():Int {
    return 2*length + 2*wedth
}
    fun getarea():Int{
        return length*wedth

    }
}

fun main (){

    println("Eter the length value: ")
   var length = readLine()!!.toInt()

    println("Enter the wedth value: ")
    var wedth = readLine()!!.toInt()

    var R = Rectangle(length , wedth)

    println("the perimeter is ${R.getper()}")
    println("the Area is ${R.getarea()}")

}
