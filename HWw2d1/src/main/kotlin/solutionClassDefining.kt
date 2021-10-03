fun main(args: Array<String>) {

    //Part I - Practice with Class Defining
    var myCar = Car().apply { model="Toyota"
        year = 2020 }

    myCar.run {
        println("my car model is $model ,year of $year")
    }
}

class Car() {
    lateinit var model : String
    var year : Int = 0
}

/** other way */

//fun main(args: Array<String>) {
//
//    //Part I - Practice with Class Defining
//    var myCar = Car("Toyota", 2020)
//
//    myCar.run {
//        println("my car model is $model ,year of $year")
//    }
//}
//
//class Car(model: String, year: Int) {
//    var model = model
//    var year = year
//}