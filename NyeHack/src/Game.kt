fun main(args: Array<String>) {
    val name = "Madrigal"
    var healthPoints = 100
    healthPoints = 89
    val isBlessed = true
    val isImmortal = false

    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    // Aura
    // if (isBlessed && healthPoints > 50 || isImmortal) {
//    if (auraVisible) {
//        println("GREEN")
//    } else {
//        println("NONE")
//    }
    val auraColor = if (auraVisible) "GREEN" else "NOEN"
    // println(auraColor)

    // if (healthPoints == 100) {
    // こんな書き方ができるのか、意外。変数の中身を指定できる
//    val healthStatus = if (healthPoints == 100) {
//        " is in excellent condition"
//
////    } else if (healthPoints >= 90){
//    } else if (healthPoints in 90..99){
//        " has a few scratches"
////    }else if (healthPoints >= 75){
//    }else if (healthPoints in 75..89){
//        // println(name + " has some minor wounds")
//        if (isBlessed) {
//           " has some minor wounds but is healing quite quickly!"
//        } else {
//            " has some minor wounds."
//        }
//    }else if (healthPoints in 17..74){
//    // }else if (healthPoints >= 15){
//        " looks pretty hurt"
//    }else {
//        " is in awful condition"
//    }
    val healthStatus = when (healthPoints) {
        100 -> " is in excellent condition"
        in 90..99 -> " has a few scratches"
        in 75..89 -> if (isBlessed) {
            " has some minor wounds but is healing quite quickly!"
        } else {
            " has some minor wounds."
        }
        in 17..74 -> " looks pretty hurt"
        else -> " is in awful condition"
    }

    println("(Aura: $auraColor) " + "Blessed: ${if (isBlessed) "YES" else "NO"})")
    // 文字列テンプレートを利用
    println("$name $healthStatus")
//    println(name + " " + healthStatus)

}