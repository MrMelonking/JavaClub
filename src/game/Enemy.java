package game;

public class Enemy implements Mortal{
    int health;
    int healthDamaged;


    public Enemy(int health) {
        this.health = health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public int takeDamage(int damage){
        healthDamaged = health - damage;
        return healthDamaged;
    }

    public boolean isAlive(){
        if (healthDamaged <= 0){
            System.out.println("Enemy killed");
            return false;
        }
        else {
            System.out.println("Alive. Health left: " + healthDamaged);
            return true;
        }
    }


}
