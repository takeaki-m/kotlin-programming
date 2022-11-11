import java.lang.Exception

class SwordJugger {
    fun execute() {
        var swrodsJuggling: Int? = null
        var isJugglingProficient = (1..3).shuffled().last() == 3
        if (isJugglingProficient) {
            swrodsJuggling = 2
        }
        try {
            proficientCheck(swrodsJuggling)
            swrodsJuggling = swrodsJuggling!!.plus(1)
        } catch (e: Exception) {
            print(e)
        }

        println("You juggle $swrodsJuggling sword")
    }

    fun proficientCheck(swordJugging: Int?) {
//        swordJugging ?: throw UnskilledSwordJugglerException()
        // 事前条件関数
        // kotlinで言語レベルで定義されているnullCheck関数
        checkNotNull(swordJugging, {"Player cannot juggle swords"})
    }

    class UnskilledSwordJugglerException() :
        IllegalStateException("Player cannot juggle swords")

}