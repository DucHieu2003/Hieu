package Decorator_Ex1;

public abstract class ShapeDecorator implements Shape {
    Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }
    public void draw() {
        shape.draw();
    }
}
