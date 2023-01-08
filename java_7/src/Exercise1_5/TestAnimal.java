package Exercise1_5;

public class TestAnimal {
    public static void main(String[] args) {
        Animal a1 = new Mammal("Cat");
        System.out.println(a1);

        Mammal m1 = (Mammal) a1;
        System.out.println(m1);

        Animal a2 = new Cat("Cat");
        System.out.println(a2);
        Mammal m2 = (Mammal) a2;
        Cat c1 = (Cat) m2;
        System.out.println(c1);
        c1.greets();
        System.out.println();

        Animal a3 = new Dog("Dog1");
        Mammal m3 = (Mammal) a3;
        Dog d1 = (Dog) m3;
        Dog d2 = new Dog("Dog2");
        System.out.println(m3);
        d1.greets();
        System.out.println();
        d1.greets(d2);
    }
}
