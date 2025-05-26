public class Player {
    private String name;
    private int health;
    private int damage;

    public Player(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    
    
    public void attackBoss(Boss boss, boolean correct){
        if(correct){
            boss.setHealth(boss.getHealth() - damage);
            if(boss.getHealth() <= 0){
                boss.setAlive(false);
                boss.setHealth(0);
            }
        }
    }
}

