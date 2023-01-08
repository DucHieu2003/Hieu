package com.patterns.singleton;

public class Application {
    public static void main(String[] args) {
        Database d1 = Database.getInstance();
        d1.query("Hanoi");

        Database d2 = Database.getInstance();
        d2.query("Hanoi");

        System.out.println(d1 == d2);
    }
}
