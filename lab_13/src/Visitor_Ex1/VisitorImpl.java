package Visitor_Ex1;

public class VisitorImpl implements Visitor {
    @Override
    public void visit(BusinessBook book) {
        System.out.println("BusinessBook");
        System.out.println("Publisher: " + book.getPublisher());
    }

    @Override
    public void visit(DesignPatternBook book) {
        System.out.println("DesignPatternBook");
        System.out.println("Resource: " + book.getResource());
        System.out.println("Best Seller: " + book.getBestSeller());
    }

    @Override
    public void visit(JavaCoreBook book) {
        System.out.println("JavaCoreBook");
        System.out.println("Resource: " + book.getResource());
        System.out.println("Favourite Book: " + book.getFavouriteBook());
    }
}


