import kotlin.properties.Delegates

fun main(){
    var rectangle1 = Rectangle()
 println("Please enter length:")
}
class Rectangle {

var length by Delegates.notNull<Int>()
    var width by Delegates.notNull<Int>()
  var per = 0
 var area = 0

    fun getPer(){
    println("Please enter length:")
     length = readLine()!!.toInt()
        println("Please enter width:")
        width = readLine()!!.toInt()
     per = 2*(width + length)

}
fun getArea(){
  area = width*length
}
   fun draw(){

    }
}