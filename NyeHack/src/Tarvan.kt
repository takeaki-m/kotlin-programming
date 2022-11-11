class Tarvan {
    fun execute() {
        // null test
        var signatureDrink = "Buttered Ale"

//        var beverage = readLine()?.capitalize()
        var beverage = readLine()?.let {
            if (it.isNotBlank()) {
                it.capitalize()
            } else {
                "Buttered Ale"
            }
        }
//    beverage = null
        println(beverage)
    }

}