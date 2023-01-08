package Excercises2_1;

public class TestLine {
    public static void main(String[] args)  {
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);

        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 5);
        Line l2 = new Line(p1, p2);
        System.out.println("\n" + l2);
        System.out.println("length: " + l2.getLength());
        System.out.println("gradient: " + l2.getGradient());
    }
}
