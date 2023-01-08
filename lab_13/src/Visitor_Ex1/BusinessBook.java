package Visitor_Ex1;

public class BusinessBook implements Book {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getPublisher() {
        return "Call Me Fox";
    }
}

