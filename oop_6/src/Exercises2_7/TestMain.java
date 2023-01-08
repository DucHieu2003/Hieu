package Exercises2_7;

public class TestMain {
    public static void main(String[] args) {
        MyPoint myPoint1 = new MyPoint(2, 3);
        System.out.println(myPoint1);
        MyPoint myPoint2 = new MyPoint(4, 5);
        System.out.println(myPoint2);
        MyLine myLine1 = new MyLine(myPoint1, myPoint2);
        System.out.println(myLine1);
        MyLine myLine2 = new MyLine(5, 2, 4, 7);
        System.out.println(myLine2);
        System.out.println(myLine1.getLength());
        System.out.println(myLine1.getGradient());
    }
}
