//part 1
class Car {
    var model: String? = null
    var years: Int? = null
}

fun main() {
    val car1 = Car()
    with(car1) {
        model = "Toyota"
        years = 2020
        println("car model is  $years $model ")
    }
}
