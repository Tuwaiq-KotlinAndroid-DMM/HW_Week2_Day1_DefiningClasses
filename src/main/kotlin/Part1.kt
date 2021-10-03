class Car(_model: String, _year: Int) {
    var model: String = _model
    var year: Int = _year
}

fun main() {
    var mycar = Car("Toyota", 2020)
    println(mycar.model)
                println(mycar.year)

}