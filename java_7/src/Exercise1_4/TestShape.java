package Exercise1_4;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Circle("red", false, 5.5);
        System.out.println(s1);
        System.out.println("Color: " + s1.getColor());
        System.out.println("Filled: " + s1.isFilled());
        System.out.println();

        Circle c1 = (Circle) s1;
        System.out.println(s1);
        System.out.println("Color: " + c1.getColor());
        System.out.println("Filled: " + c1.isFilled());
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());
        System.out.println("Radius: " + c1.getRadius());
        System.out.println();

        Shape s2 = new Rectangle("red", false, 5, 4);
        System.out.println(s2);
        System.out.println("Color: " + s2.getColor());
        System.out.println("Filled: " + s2.isFilled());
        System.out.println();

        Rectangle r1 = (Rectangle) s2;
        System.out.println(r1);
        System.out.println("Color: " + r1.getColor());
        System.out.println("Filled: " + r1.isFilled());
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
        System.out.println();

        Shape s3 = new Square(6.6);
        System.out.println(s2);
        System.out.println("Color: " + s3.getColor());
        System.out.println("Filled: " + s3.isFilled());
        System.out.println();

        Rectangle r2 = (Rectangle) s3;
        System.out.println(r2);
        System.out.println("Color: " + r2.getColor());
        System.out.println("Filled: " + r2.isFilled());
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());
        System.out.println();

        Square sq1 = (Square) r2;
        System.out.println(sq1);
        System.out.println("Color: " + sq1.getColor());
        System.out.println("Filled: " + sq1.isFilled());
        System.out.println("Area: " + sq1.getArea());
        System.out.println("Perimeter: " + sq1.getPerimeter());
        System.out.println();
    }
}
