fun main(args: Array<String>) {
    var myCar= Car("Toyota", 2020)
    print(myCar.model)
    print(myCar.year)
}
class Car(_model: String, _year: Int) {
    var model: String = _model
    var year: Int = _year
}