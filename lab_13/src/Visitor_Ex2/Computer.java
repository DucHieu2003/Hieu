package Visitor_Ex2;

public class Computer implements ComputerPart {
    private ComputerPart[] computerParts;

    public Computer(ComputerPart[] computerParts) {
        this.computerParts = computerParts;
    }

    @Override
    public void accept(ComputerPartVisitor v) {
        for (ComputerPart computerPart : computerParts) {
            computerPart.accept(v);
        }
        v.visit(this);
    }
}


