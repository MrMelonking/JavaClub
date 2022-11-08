package game;

public class TrainingGround {
    public static void main(String[] args) {

        Warrior warrior = new Warrior("Arthas");
        Mage mage = new Mage("Medieve");
        Archer archer = new Archer("Rexar");
        Enemy enemy = new Enemy(50);

        System.out.println(warrior.getName());
        warrior.attackEnemy(enemy, 50);
        System.out.println(mage.getName());
        mage.attackEnemy(enemy, 75);
        System.out.println(archer.getName());
        archer.attackEnemy(enemy, 25);
    }
}
