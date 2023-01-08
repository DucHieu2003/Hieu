package Visitor_Ex2;

public interface ComputerPartVisitor {
    void visit(Computer computer);

    void visit(Keyboard keyboard);

    void visit(Mouse mouse);

    void visit(Monitor monitor);
}


