package Decorator_Ex2;

public class NutsToppingDecorator extends ToppingDecorator {

    public NutsToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + addTopping();
    }

    @Override
    public String addTopping() {
        return " + nuts";
    }
}


