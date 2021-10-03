fun main(args: Array<String>) {
    // Part 1 - Practice with class defining
    var car = Car().apply {
        model = "Toyota"
        yearOfType = 2020
    }
    println("Car model: ${car.model}, Year of type: ${car.yearOfType}")
}

class Car {
    lateinit var model: String
    var yearOfType: Int = 0
}