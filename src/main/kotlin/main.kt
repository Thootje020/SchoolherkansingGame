import kotlin.system.exitProcess
fun main (args: Array<String>) {
    println("Welcome to our game")

    var player = Player("")

    var username = readLine()
    player = Player("$username")
    while (username!!.isBlank()) {
        println("enter a valid username")
        username = readLine()
    }
        println("Welcome," + player)



}


fun died(){
    println("You have died and lost the game")
    exitProcess(1)
}
