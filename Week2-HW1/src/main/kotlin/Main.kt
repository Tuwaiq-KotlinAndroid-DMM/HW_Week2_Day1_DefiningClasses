fun main(args: Array<String>) {


    var Cardetails = Car("toyota", 2020)
    println (Cardetails.myCarName)
    println (Cardetails.myCarModel)
}
class Car (Name: String , Model: Int) {
    var myCarName = Name
    var myCarModel = Model
}