package kg.geeks.game.players;

public class Spitfire extends Hero {

    private static final int BONUS_DAMAGE = 80;

    public Spitfire(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.BONUS_DAMAGE);
    }


    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (boss != null && boss.isAlive()) {
            System.out.println(this.getName() + " показывает агрессию и наносит боссу " + BONUS_DAMAGE + " единиц дополнительного урона!");
            boss.takeDamage(BONUS_DAMAGE);
        }
    }
}
