package Visitor_Ex1;

public class App {
    public static void main(String[] args) {
        Book book1 = new BusinessBook();
        Book book2 = new JavaCoreBook();
        Book book3 = new DesignPatternBook();

        Visitor v = new VisitorImpl();
        book1.accept(v);
        System.out.println();
        book2.accept(v);
        System.out.println();
        book3.accept(v);
    }

}
