package factory_ex;

public class CallingClass {
    public static void main(String[] args) {
        try {


            FruitFactory fruitFactory = new FruitFactory();
            Fruit fruit = fruitFactory.provideFruit("Apple");
            fruit.produceJuice();
            Fruit fruit1 = fruitFactory.provideFruit("Oil");
            fruit1.produceJuice();
            //fruitFactory.provideFruit("Apple");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
