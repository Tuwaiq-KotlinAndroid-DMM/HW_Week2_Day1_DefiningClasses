fun main (){
 var objectCar = car()
    println("The model of car is ${objectCar.modelOfCar}")
    println("The model year is ${objectCar.yearOfCar}")
}
class car {
    var modelOfCar: String = "Toyota"
    var yearOfCar :Int = 2020
}