class Tarvan {
    fun execute() {
        // null test
        var signatureDrink = "Buttered Ale"

        var beverage = "Pale Ale"
         // var beverage = readLine()?.let {
         //     if (it.isNotBlank()) {
         //         it.capitalize()
         //     } else {
         //         "Buttered Ale"
         //     }
         // }
//        var beverage = readLine()!!.capitalize()
//    beverage = null
        // var beverage = readLine()
        // beverage = null
        if (beverage != null) {
            beverage = beverage.capitalize()
        } else {
            println("I can't do that without crashing -beverage was null!")
        }

        // null coalescing operator
        // 左辺がnullならば、右辺を実行する
        val beverageServed: String = beverage ?: "Buttered Ale"

        println(beverage)
        println(beverageServed)
    }

}