const val TAVERN_NAME = "Taerny‘s Folly"

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

        placeOrder("shandy,Dragon‘s Breath,5.91")
        placeOrder("elixir,Shirley‘ Temple,4.12")
        placeOrder("elixir,DRAGON‘S BREATH,4.12")
    }

    private fun placeOrder(menuData: String) {
        val indexOfApostrophe = TAVERN_NAME.indexOf('‘')
        val tavernMaster = TAVERN_NAME.substring(0 until indexOfApostrophe)
        println("Madrigal speaks with $tavernMaster about their order.")

        //val data = menuData.split(',')
        //val type = data[0]
        //val name = data[1]
        //val price = data[2]
        val (type, name, price) = menuData.split(',')
        val message = "Madrigal busy a $name ($type) for $price."
        println(message)

//        val phrase = "Ah, delicious $name!"
//        println("Madrigal exclaims:${toDragonSpeak(phrase)}")
        val phrase = if (name == "Dragon‘s Breath") {
            "Madrigal exclaims:${toDragonSpeak("Ah, delicious $name!")}"
        } else if (name == "DRAGON‘S BREATH") {
            "Madrigal exclaims:${toDragonSpeak("AH, DELICIOUS $name!")}"
        } else {
            "Madrigal says: Thanks for the $name."
        }

        println(phrase)
    }
    private fun toDragonSpeak(phrase: String) =
        phrase.replace(Regex("[aeiou]", RegexOption.IGNORE_CASE)) {
            when (it.value) {
                "a" -> "4"
                "e" -> "3"
                "i" -> "1"
                "o" -> "0"
                "u" -> "|_|"
                else -> it.value
            }
        }

}