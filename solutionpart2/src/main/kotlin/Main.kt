class bookd(title:String,Auther:String,Price:Double){
    var titleAA= title
    var autherBB = Auther
    var priceCC = Price
    var ABV = true
    fun bookDetails(){
        ABV = false
    }}
fun main () {
    var mybookAA = bookd("Game of Thrones", "George Martin", 54.00)
    var mybookBB = bookd("We Were Liars", "E. Lockhart", 30.00)
    var details1 = "----Book details----"
    mybookBB.bookDetails()
    var instock: String = if (mybookBB.ABV == true){
        "In Stock"}
    else {
        "Out of Stock"
    }
    println("$details1\nName:${mybookBB.titleAA}\nAuthor:${mybookBB.autherBB}\nPrice:${mybookBB.priceCC}\nAvailability:${instock}")
    instock = if (mybookAA.ABV == true){
        "in Stock"}
    else {
        "Out of stock"
    }
    println("$details1\nName:${mybookAA.titleAA}\nAuthor:${mybookAA.autherBB}\nPrice:${mybookAA.priceCC}\nAvailability:$instock ")
}