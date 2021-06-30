import kotlin.io.println as println

class Player(name: String, override var maxHitpoints: Int = 10, var hitpoints: Int = maxHitpoints) :
    Characters (name, maxHitpoints){
    val inventory = ArrayList<Loot>()
    var weapon = Weapons("Fists", 1, 2)

    fun show() {
        if (hitpoints < 0) {
            println("$name is dead")
        } else {
            println("$name is alive")
        }

    }

    override fun takeDamage(damage: Int) {
        val remainingHitpoints = hitpoints - damage
        if (remainingHitpoints > 0){

            println("$name took $damage points of damage and has $remainingHitpoints hitpoints left.")

        } else {
            if (remainingHitpoints <= 0) {

                println("$name took $damage points of damage and is dead")
                died()

            } else {

                println("$name has $remainingHitpoints left.")

            }
        }
        hitpoints = remainingHitpoints
    }


    override fun toString(): String {

        return """
          
            name:  $name
            life:  $hitpoints out of $maxHitpoints
            weapon: ${weapon.name}
            Min-Damage: ${weapon.minDamage}
            Max-Damage: ${weapon.maxDamage}
           
            """

    }



}