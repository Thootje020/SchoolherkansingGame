open class Characters (val name: String, open var maxHitpoints: Int) {

    open fun takeDamage(damage: Int){
        val remainingHitpoints = maxHitpoints - damage
        if (remainingHitpoints > 0){

            println("$name took $damage points of damage and has $remainingHitpoints hitpoints left.")

        } else {
            if (remainingHitpoints <= 0) {

                println("$name took $damage points of damage and is dead")

            } else {

                println("$name has $remainingHitpoints left.")

            }
        }
        maxHitpoints = remainingHitpoints
    }
    override fun toString(): String {
        return "Name: $name, Hitpoints: $maxHitpoints"
    }

    open fun attack(character: Characters, minDamage: Int, maxDamage: Int){
        val attackDamage = (minDamage..maxDamage).random()
        character.takeDamage(attackDamage)
        Thread.sleep(1000)
    }


}