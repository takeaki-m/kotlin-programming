import javax.swing.SwingWorker

fun main(args: Array<String>) {
    val game = Game();
    game.gameMain()
    val tarvan =  Tarvan();
    tarvan.execute()

    val swordJugger = SwordJugger()
    swordJugger.execute()



}