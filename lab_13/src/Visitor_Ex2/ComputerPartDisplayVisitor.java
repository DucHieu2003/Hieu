package Visitor_Ex2;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor{
    @Override
    public void visit(Computer computer) {
        System.out.println("Visit computer");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Visit keyboard");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Visit mouse");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Visit monitor");
    }
}


