package com.patterns.strategies;
import java.util.*;
public class ExampleApplication {
    public static void main(String[] args) {
        Context context = new Context();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = sc.next();

        switch (c) {
            case "+" -> context.setStrategy(new ConcreteStrategyAdd());
            case "-" -> context.setStrategy(new ConcreteStrategySubtract());
            case "*" -> context.setStrategy(new ConcreteStrategyMultiply());
        }
        int result = context.executeStrategy(a, b);
        System.out.println(result);
    }
}
