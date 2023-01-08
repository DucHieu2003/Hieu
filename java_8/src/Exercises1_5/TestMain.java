package Exercises1_5;

public class TestMain {
    public static void main(String[] args) {
        ResizableCircle g1 = new ResizableCircle(2.0); //Upcast to  Circle
        System.out.println(g1.getArea());
        System.out.println(g1.getPerimeter());
        g1.resize(200);
        System.out.println(g1);
        System.out.println(g1.getArea());
        System.out.println(g1.getPerimeter());

        GeometricObject g2 = new Circle(1.5);
        System.out.println(g2);
        System.out.println(g2.getPerimeter());
        System.out.println(g2.getArea());
    }
}
