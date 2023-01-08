package Exercises2_8;

public class TestMain {
    public static void main(String[] args) {
        MyPoint myPoint1 = new MyPoint(5, 6);
        System.out.println(myPoint1);
        MyPoint myPoint2 = new MyPoint(7, 8);
        System.out.println(myPoint2);
        MyPoint myPoint3 = new MyPoint(9, 10);
        System.out.println(myPoint3);
        MyCircle circle1 = new MyCircle(myPoint1, 1);
        System.out.println(circle1);
        MyCircle circle2 = new MyCircle(2, 3, 1);
        System.out.println(circle2);
        System.out.println(circle1.getArea());
    }
}
