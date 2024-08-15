public class Boss {
    private int bossHealth;
    private int bossDamage;
    private String bossDefenseType;

    public int getHealth() {
        return bossHealth;
    }

    public int getDamage() {
        return bossDamage;
    }

    public String getDefenseType() {
        return bossDefenseType;
    }

    // Сеттеры для всех полей
    public void setHealth(int health) {
        this.bossHealth = health;
    }

    public void setDamage(int damage) {
        this.bossDamage = damage;
    }

    public void setDefenseType(String defenseType) {
        this.bossDefenseType = defenseType;
    }

    @Override
    public String toString() {
        return "Boss{health=" + bossHealth + ", damage=" + bossDamage + ", defenseType='" + bossDefenseType + "'}";
    }
}
