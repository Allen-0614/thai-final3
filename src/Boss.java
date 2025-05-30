public class Boss {
    private int health;
    private int initialHealth;
    private String name;
    private boolean alive;
    
    public Boss(int health, String name) {
        this.health = health;
        this.initialHealth = health; // store initial health
        this.name = name;
        this.alive = true;
    }

    public int getHealth(){
        return health;
    }    
    public void setHealth(int h){
        health = h;
    }
    public void setAlive(boolean a){
        alive = a;
    }

    public String toString(){
        if(alive){
            return name + " Has " + health + "hp";
        }
        else{
            return name + " is dead";
        }
    }

    public void Attack(Player player, boolean success, int damage){
        if (success) {
            player.setHealth(player.getHealth() - damage);
            System.out.println("");
            return ;
        }
        System.out.println("");
        return;
    }

    public void reset() {
        this.health = initialHealth;
        this.alive = true;
    }
}
