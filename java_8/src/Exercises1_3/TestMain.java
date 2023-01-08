package Exercises1_3;

public class TestMain {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(1, 1, 1, 1);
        for (int i = 0; i < 5; i++) {
            m1.moveUp();
            m1.moveLeft();
            m1.moveDown();
            m1.moveLeft();
            m1.moveUp();
            m1.moveRight();
            System.out.println(m1);
        }
    }
}
