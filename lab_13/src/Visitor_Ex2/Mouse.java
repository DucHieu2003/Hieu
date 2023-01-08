package Visitor_Ex2;

public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor v) {
        v.visit(this);
    }
}


