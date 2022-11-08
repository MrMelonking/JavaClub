package game;

public class Mage extends Hero{

    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy, int damage){
        System.out.println("Attacking enemy with Mana bolt");
        enemy.takeDamage(damage);
        enemy.isAlive();
    }
}
