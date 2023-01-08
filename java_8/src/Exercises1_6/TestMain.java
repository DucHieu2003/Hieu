package Exercises1_6;

public class TestMain {
    public static void main(String[] args) {
        Animal cat1 = new Cat("Bella");
        cat1.greets();

        Animal dog1 = new Dog("Chilla");
        dog1.greets();
        Animal dog2 = new BigDog("Doug");
        Dog d_1 = (Dog) dog1;
        Dog d_2 = (Dog) dog2;
        d_1.greets(d_2);
        //Note: Must return from Animal to Dog or BigDog to use greets()

        BigDog d_22 = (BigDog) dog2;
        d_22.greets(d_2);
    }
}
