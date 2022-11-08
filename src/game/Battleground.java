package game;

public class Battleground {
    public static void main(String[] args) {
        Hero Arthas = new Warrior("Arthas");
        Enemy orc = new Enemy(500);


        System.out.println(Arthas.getName());
        Arthas.attackEnemy(orc, 1000);
    }
}
