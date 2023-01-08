package singleton_hero;

public class DemoHero {
    public static void main(String[] args) {
        Hero  hero = Hero.getInstance("Vayne");
        System.out.println(hero.getName());

        Hero hero1 = Hero.getInstance("Irelia");
        System.out.println(hero1.getName());
    }
}
