package Exercises1_4;

public class Container {
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        x2 = x + width;
        y2 = y + height;
    }

    public int getX() {
        return this.x1;
    }

    public int getY() {
        return this.y1;
    }

    public int getWidth() {
        return x2 - x1;
    }

    public int getHeight() {
        return y2 - y1;
    }

    public boolean collidesWith(Ball ball) {
        if ((ball.getX() - ball.getRadius() <= x1) || (ball.getX() - ball.getRadius() >= x2)) {
            ball.reflectHorizontal();
            return true;
        }
        if ((ball.getY() - ball.getRadius() <= y1) || (ball.getY() - ball.getRadius() >= y2)) {
            ball.reflectVertical();
            return true;
        }
        return false;
    }

    public String toString() {
        return "Container[(" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + ")]";

    }
}
