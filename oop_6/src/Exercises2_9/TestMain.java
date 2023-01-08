package Exercises2_9;


import org.w3c.dom.ls.LSOutput;

public class TestMain {
    public static void main(String[] args) {
        MyPoint myPoint1 = new MyPoint(2, 3);
        System.out.println(myPoint1);
        MyPoint myPoint2 = new MyPoint(4, 5);
        System.out.println(myPoint2);
        MyPoint myPoint3 = new MyPoint(6, 8);
        System.out.println(myPoint3);
        MyTriangle myTriangle1 = new MyTriangle(myPoint1, myPoint2, myPoint3);
        System.out.println(myTriangle1);
        System.out.println(myTriangle1.getPerimeter());
        System.out.println(myTriangle1.getType());
    }
}
