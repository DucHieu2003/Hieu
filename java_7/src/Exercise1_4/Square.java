package Exercise1_4;

public class Square extends Rectangle {

    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(Double side, String color, boolean filled) {
        super(color, filled, side, side);
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    public double getSide() {
        return getLength();
    }

    public void setWidth(double side) {
        setWidth(side);
    }

    public void setLength(double side) {
        setLength(side);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString();
    }
}
