package Exercises1_6;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.print("Woof");
    }

    public void greets(Dog another) {
        System.out.print("Wooooof");
    }
}
