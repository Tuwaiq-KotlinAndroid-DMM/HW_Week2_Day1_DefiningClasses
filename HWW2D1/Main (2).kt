//PART1
//class Car(){
//    var car1:String = "Toyota"
//    var year1:Int = 2020
//}
//fun main (){
//    var car = Car()
//    println("Model: ${car.car1}  Year: ${car.year1}")
//}
//Part2
//class bookd(title:String,Auther:String,Price:Double){
//    var title1= title
//    var auther = Auther
//    var p = Price
//    var ba = true
//    fun bookDetails(){
//        ba = false
//    }}
//fun main () {
//    var mybook = bookd("The life of Belal", "Belal", 500.02)
//    var mybook1 = bookd("The life of bee", "Belal", 30.2)
//    var details = "----Book details----"
//    mybook1.bookDetails()
//    var instock: String = if (mybook1.ba == true){
//        "in Stock"}
//    else {
//        "Out of stock"
//    }
//    println("$details\nName:${mybook1.title1}\nAuthor:${mybook1.auther}\nPrice:${mybook1.p}\nAvailability:${instock}")
//    instock = if (mybook.ba == true){
//        "in Stock"}
//    else {
//        "Out of stock"
//    }
//println("$details\nName:${mybook.title1}\nAuthor:${mybook.auther}\nPrice:${mybook.p}\nAvailability:$instock ")
//}
//Part 3
//fun main() {
//    println("Enter the length : ")
//    var length = readLine()!!.toInt()
//    println("Enter the width: ")
//    var wigth = readLine()!!.toInt()
//    var z = Rectangle(length,wigth)
//    println( "perimeter: ${z.getPer()}")
//    println("area : ${z.getArea()}")
//    println(z.draw())
//}
//class Rectangle (_length : Int , _width :Int){
//    var length : Int = _length
//    var width : Int = _width
//    fun getPer() : Int{
//        return 2 * (length + width)
//    }
//    fun getArea(): Int{
//        return length * width
//    }
//    fun draw( ):String{
//        for (U in 1.. width){
//            for (M in 1 .. length){
//                print("*")
//            }
//            println("")
//        }
//        return "THANK YOU"
//    }
//}

