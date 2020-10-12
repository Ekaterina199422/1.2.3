fun main() {
    val sumPrice = 100
    val client = true
    println("Покупка на сумму: $sumPrice руб")


    if (sumPrice > 1000 && sumPrice <= 10000) {
        print("Со скидкой 100 руб: ")
        val price = sumPrice - 100
        println("$price руб")
        if (client) {
            print("Со скидкой 1%: ")
            val priceClient = price - price * 0.01
            println("$priceClient руб")
        }
    } else {
        print("Со скидкой 5%: ")
        val price = sumPrice - sumPrice * 0.05
        println("$price руб")
        if (client) {
            print("Со скидкой 1%: ")
            val priceClient = price - price * 0.01
            println("$priceClient руб")
        }
    }
}
