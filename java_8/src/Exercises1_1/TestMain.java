package Exercises1_1;

public class TestMain {
    public static void main(String[] args) {
        //Upcase Circle to Shape
//        Shape shape1 = new Circle(5.5, "red", false);
//        System.out.println(shape1);
//        System.out.println(shape1.getArea());
//        System.out.println(shape1.getPerimeter());
//        System.out.println(shape1.getColor());
//        System.out.println(shape1.isFilled());
//        System.out.println(shape1.getRadius()); //Cannot resolve in Shape

//        //Downcast back to Circle
//        Circle circle1 = (Circle) shape1;
//        System.out.println(circle1);
//        System.out.println(circle1.getArea());
//        System.out.println(circle1.getPerimeter());
//        System.out.println(circle1.isFilled());
//        System.out.println(circle1.getColor());
//        System.out.println(circle1.getRadius());

//        Shape shape2 = new Shape(); // Cannot be instantiated

        // Upcast
        Shape shape3 = new Rectangle("red", false, 2.0, 3.0);
        System.out.println(shape3);
        System.out.println(shape3.getColor());
        System.out.println(shape3.getArea());
        System.out.println(shape3.getPerimeter());
//        System.out.println(shape3.getLength()); //Cannot resolve in Shape

        //Downcast
        Rectangle rectangle1 = (Rectangle) shape3;
        System.out.println(rectangle1);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());
        System.out.println(rectangle1.getColor());
        System.out.println(rectangle1.isFilled());
        System.out.println(rectangle1.getLength());
        System.out.println(rectangle1.getWidth());

        //Upcast
        Shape shape4 = new Square(6.6);
        System.out.println(shape4);
        System.out.println(shape4.getArea());
        System.out.println(shape4.getColor());
//        System.out.println(shape4.getSide()); //Cannot resolve in Shape

        //Downcast to Rectangle
        Rectangle rectangle2 = (Rectangle) shape4;
        System.out.println(rectangle2.getWidth());
        System.out.println(rectangle2.getLength());
        System.out.println(rectangle2.getArea());
//        System.out.println(rectangle2.getSide()); //Cannot resolve in Rectangle

        //Downcast to Square
        Square square1 = (Square) rectangle2;
        System.out.println(square1.getArea());
        System.out.println(square1.getColor());
        System.out.println(square1.getSide());
        System.out.println(square1.getLength());
    }
}
