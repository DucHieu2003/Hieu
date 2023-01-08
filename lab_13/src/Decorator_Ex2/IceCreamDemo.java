package Decorator_Ex2;

public class IceCreamDemo {
    public static void main(String[] args) {
        IceCream vanillaIceCreamWithHoney = new HoneyToppingDecorator(new VanillaIceCream());
        System.out.println(vanillaIceCreamWithHoney.getDescription());

        IceCream strawberryCreamWithNuts = new NutsToppingDecorator(new StrawberryIceCream());
        System.out.println(strawberryCreamWithNuts.getDescription());

//        IceCream chocolateIceCreamWithHoneyAndNuts = new NutsToppingDecorator(new HoneyToppingDecorator((IceCream) new ChocolateIceCream()));
//        System.out.println(chocolateIceCreamWithHoneyAndNuts.getDescription());
    }
}


