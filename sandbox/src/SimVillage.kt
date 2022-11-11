fun simVillageMain() {
    println("==============SimVillage==============")
    // 関数、式または文字を波括弧のペアで囲むことによって無名関数を書く
    // () -> String
    // (): 関数パラメター
    // -> String: 戻り値の型
    // ()がからなので引数を受け取らない
    // Stringを返す関数ならば、どれでもgreetingFunctionに代入できること
    // 無名関数は、データを出力するのにreturnを必要としない
    // 特殊なケースを除けが、returnキーワードを許さない
    // 暗黙のうちに最後の行を返す
    val greetingFunction: () -> String = {
        {
            val currentYear = 2018
            "Welcome to SimVillage, Mayor! (copyright $currentYear)"
        }()
    }
    println(greetingFunction())

    // 文字列パラメーターの名前を関数の内側で、開き波括弧の直後に書く。名前の後に矢印を置く
    val greetingFunctionWithArgument: (String) -> String = { playerName ->
        val currentYear = 2018
        "Welcome to SinVillage, $playerName! (copyright $currentYear)"
    }
    println(greetingFunctionWithArgument("Guyal"))

    // 文字列パラメータが1つの場合にはitを使える
    // 他あし混乱するため、基本的には名前付きパラメータを使う
    val greetingFunctionWithOnlySingleArgument: (String) -> String = {
        val currentYear = 2018
        "Welcome to SinVillage, $it! (copyright $currentYear)"
    }
    println(greetingFunctionWithOnlySingleArgument("Guyal"))

    // val greetingFunctionWithMultiArgument: (String, Int) -> String = {
    val greetingFunctionWithMultiArgument = { playerName: String, numBuildings: Int ->
        val currentYear = 2018
        println("Adding $numBuildings houses")
        "Welcome to SinVillage, $playerName! (copyright $currentYear)"
    }
    println(greetingFunctionWithMultiArgument("Builders", 999))
    // runSimulation("Guyal", greetingFunctionWithMultiArgument)

    // 関数の略記
    // 関数が最後のパラメータで関数型を受け取るときは、そのラムダ引数を囲む丸括弧を省略できる
    // runSimulation("George") { playerName: String, numBuildings: Int ->
    // runSimulation("George", ::printConstructionCost) { playerName: String, numBuildings: Int ->
    //     val currentYear = 2018
    //     println("Adding $numBuildings houses")
    //     "Welcome to SinVillage, $playerName! (copyright $currentYear)"
    // }
    runSimulation()


}



// ラムダを定義すると、一つのオブジェクトインスタンスとなる
// ラムダが利用できる全部の変数についてメモリ割り当てを意実行するのでリソースを消費する
// インライン化することによって、JVMがオブジェクトインスタンスを使う必要がなくなり、変数メモリ割り当ても実行されなくなる
//inline fun runSimulation(playerName: String, costPrinter: (Int) -> Unit, greetingFunction: (String, Int) -> String) {
//   val numBuildings = (1..3).shuffled().last() // 1 or 2 or 3
//    costPrinter(numBuildings)
//    println(greetingFunction(playerName, numBuildings))
//}

fun runSimulation() {
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("Guyal"))
    println(greetingFunction("Guyal"))
}

fun printConstructionCost(numBuildings: Int) {
    val cost = 500
    println("construction cost: ${cost * numBuildings}")

}

fun configureGreetingFunction(): (String) -> String {
    val structureType = "hospital"
    var numBuildings = 5
    return {playerName: String ->
        val currentYear = 2018
        numBuildings += 1
        println("Adding $numBuildings $structureType")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }

}