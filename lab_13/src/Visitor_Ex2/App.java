package Visitor_Ex2;

public class App {
    public static void main(String[] args) {
        ComputerPart[] computerParts = new ComputerPart[]{new Monitor(), new Monitor(), new Mouse(), new Keyboard()};
        ComputerPart computer = new Computer(computerParts);
        computer.accept(new ComputerPartDisplayVisitor());
    }

}
