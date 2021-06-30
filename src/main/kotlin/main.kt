import kotlin.concurrent.thread
import kotlin.system.exitProcess

fun main (args: Array<String>) {
    println("Welcome to our game \n Enter your username")

    var player = Player("")
    var choice : String = ""
    var username = readLine()
    player = Player("$username")
    while (username!!.isBlank()) {
        println("enter a valid username")
        username = readLine()
    }

    println("Welcome," + player)

    println("You arrive at school with the bus for a redo on a project")
    Thread.sleep(1000)
    println("You walk to school and feel a chill through your spine.")
    Thread.sleep(1000)
    println("when you arrive in the class you sit down and start listening to your teacher.")
    Thread.sleep(1000)
    println("you start working on the project and notice you dont understand a thing")
    Thread.sleep(1000)
    println("you start feeling angry.")


    val startGame = (1..2).random();
    if (startGame == 1) {
        println("You walk to the teacher and say you dont understand what you need to do")
        Thread.sleep(1000)
        println("The teacher says to you that you need to figure it out yourself")
        Thread.sleep(1000)
        println("you tell him that you already tried")
        Thread.sleep(1000)
        println("the teacher tries to walk away but you raise your mighty fist")
        val Ron = Ron("Ron", 5)
        println(Ron)
        while(Ron.maxHitpoints > 0) {
            println("What do you want to do?")
            Thread.sleep(500)
            println("Press 1 to Hit with your fists")
            Thread.sleep(500)
            println("Press 2 to kick")
            Thread.sleep(500)
            println("Press 3 scream")

            choice = readLine().toString()
            if (Ron.maxHitpoints > 0 && choice == "1" || choice == "2" || choice == "3") {
                Ron.attack(player, 0, 2)
            }
        }




    } else {
        println("The teacher walks up to you.")
        Thread.sleep(1000)
        println("you look him in the eyes and ask him if he needs something.")
        Thread.sleep(1000)
        println("he says that you need to work harder")
        Thread.sleep(1000)
        println("you tell him that you are doing the best you can")
        Thread.sleep(1000)
        println("he tells you that its not enough and if you dont work harder he will suspend you.")
        Thread.sleep(1000)
        println("you raise your mighty fist.")
        //Start fight
    }



}

fun level2() {
    println("Shane walks up to you and ask what you are doing.")
    Thread.sleep(1000)
    println("you tell him that he was being mean and he got what he deserved")
    Thread.sleep(1000)
    println("shane isnt happy")
    Thread.sleep(1000)
    println("you raise your mighty fist")
}

fun outro() {
    println("you walk out of school with a sense of accomplishment")
    Thread.sleep(1000)
    println("you wait for the bus")
    Thread.sleep(1000)
    println("you say to yourself  i must get a 10 for what you have done")
    Thread.sleep(1000)
    println("the police arrives")
    Thread.sleep(1000)
    println("you are sentenced 25 years in jail")

}


fun died(){
    println("You have died and lost the game")
    exitProcess(1)
}
