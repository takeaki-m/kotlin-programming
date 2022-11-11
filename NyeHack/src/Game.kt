fun gameMain() {
    val name = "Madrigal"
    var healthPoints = 100
    healthPoints = 89
    val isBlessed = true
    val isImmortal = false

    // Aura
    val auraColor = auraColor(isBlessed, healthPoints, isImmortal)
    val healthStatus = formatHealthStatus(healthPoints, isBlessed)


    // Player Status
//    printPlayerStatus(auraColor, isBlessed, name, healthStatus)
    // 名前付き引数を定義。パラメータの順番を変更できる
    printPlayerStatus(auraColor = auraColor, isBlessed = isBlessed, name = "Madrigal", healthStatus = healthStatus)

//    castFireball(5)
    castFireball(2)

    return

}

private fun printPlayerStatus(
    auraColor: String,
    isBlessed: Boolean,
    name: String,
    healthStatus: String
) {
    println("(Aura: $auraColor) " + "Blessed: ${if (isBlessed) "YES" else "NO"})")
    // 文字列テンプレートを利用
    println("$name $healthStatus")
}

private fun auraColor(isBlessed: Boolean, healthPoints: Int, isImmortal: Boolean) =
    if (isBlessed && healthPoints > 50 || isImmortal) "GREEN" else "NONE"

// private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean): String {
// 単一式関数として書き換える
private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean) =
    when (healthPoints) {
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
//     return healthStatus
// }

// private fun castFireball(numFireballs: Int) {
// パラメータにデフォルト値を指定
//private fun castFireball(numFireballs: Int = 2) {
//    println("A glass of Fireball springs int existence. (x$numFireballs)")
//}
// 単一式関数として書き換える
private fun castFireball(numFireballs: Int = 2) =
    println("A glass of Fireball springs int existence. (x$numFireballs)")

