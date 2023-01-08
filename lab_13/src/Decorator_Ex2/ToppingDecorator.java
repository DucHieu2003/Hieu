package Decorator_Ex2;

public abstract class ToppingDecorator implements IceCream {

    protected IceCream iceCream;

    public String getDescription() {
        return iceCream.getDescription();
    }

    public abstract String addTopping();
}


