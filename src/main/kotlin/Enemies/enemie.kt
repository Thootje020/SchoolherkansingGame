public enum class Enemy(var enemyname: String, var hp: Int) {
    Shane("Shane", 10), Ron("Ron", 15)
}

public fun attackShane() {
    if (Enemy.Shane.hp == 0) {
    } else {
        val attackDamage = (1..2).random();
        Enemy.Shane.hp -=attackDamage
    }
}
public fun attackRon() {
    if (Enemy.Ron.hp == 0) {
    } else {
        val attackDamage = (1..2).random();
        Enemy.Ron.hp -=attackDamage
    }
}

