public class Hero {
    private int heroHealth;
    private int heroDamage;
    private String heroAbility;

    public Hero(int health, int damage, String superpower) {
        this.heroHealth = health;
        this.heroDamage = damage;
        this.heroAbility = superpower;
    }

    public Hero(int health, int damage) {
        this.heroHealth = health;
        this.heroDamage = damage;
        this.heroAbility = "None";
    }

    public int getHealth() {
        return heroHealth;
    }

    public int getDamage() {
        return heroDamage;
    }

    public String getSuperpower() {
        return heroAbility;
    }

    @Override
    public String toString() {
        return "Hero{health=" + heroHealth + ", damage=" + heroDamage + ", ability='" + heroAbility + "'}";
    }
}
