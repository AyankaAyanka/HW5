public class Main {
    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(100, 20, "Wind");
        Hero hero2 = new Hero(150, 25);
        Hero hero3 = new Hero(120, 30, "Invisibility");

        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;
    }

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        boss.setDefenseType("Shield");

        System.out.println(boss);

        Hero[] heroes = createHeroes();

        System.out.println("List of Heroes:");
        for (Hero hero : heroes) {
            System.out.println(hero);
        }
    }
}
