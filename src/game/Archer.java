package game;

public class Archer extends Hero{

    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy, int damage){
        System.out.println("Attacking enemy with Bow");
        enemy.takeDamage(damage);
        enemy.isAlive();
    }
}
