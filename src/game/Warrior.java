package game;

public class Warrior extends Hero{

    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy, int damage){
        System.out.println("Attacking enemy with Frostmorne");
        enemy.takeDamage(damage);
        enemy.isAlive();
    }
}
