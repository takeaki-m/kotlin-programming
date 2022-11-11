// コンパイル時定数
// 絶対に変更されないもの。コンパイルの段階で呼び出される。そのため基本型でしか定義しない
const val MAX_EXPERIENCE: Int = 5000
fun typeMain() {
    // var can be changed
    var experiencePoints = 5
    // val cannot be assigned
    val playerName = "Estragon"

    var hasSteed: Boolean = false;

    var publican = "Estrada"

    var gold = 100

    var drinks: Set<String> = setOf("Coke","Cafe","Tea")
    //    playerName = "Madrigal"
    //    var experiencePoints: Int = "thirty-tow"
    println("==============TypeIntro==============")
    experiencePoints +=5
    println(experiencePoints)
    println(playerName)

    println(playerName.reversed())
}