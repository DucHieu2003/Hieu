package factory_ex;

public class FruitFactory {
    Fruit provideFruit(String fruit) throws Exception {
        if (fruit.equals("Apple")) {
            return new Apple();
        } else if (fruit.equals("Banana")) {
            return new Banana();
        }
        else if (fruit.equals("Orange")) {
            return new Banana();
        } else {
            throw new Exception("Error!!");
        }

    }
}
