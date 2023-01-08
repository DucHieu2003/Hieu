package Exercises1_2;

public class TestMain {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1.0);
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());

        Rectangle rectangle1 = new Rectangle(2.0, 3.0);
        System.out.println(rectangle1);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());
    }
}
