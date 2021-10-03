
// Q1

fun main()
{
    var carInfo = Car("toyota",2020)

    println("${carInfo.carModel} ${carInfo.carName}")
}


class Car(name:String,model:Int) {

    var carName = name
    var carModel = model
}





