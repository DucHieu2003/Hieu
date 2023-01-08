package adapter;

public class TestAdapter {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(2);
        RoundPeg roundPeg = new RoundPeg(2);
        System.out.println(hole.fits(roundPeg));

        SquarePeg smallSquarePeg = new SquarePeg(15);
        SquarePeg largeSquarePeg = new SquarePeg(20);

    }
}
