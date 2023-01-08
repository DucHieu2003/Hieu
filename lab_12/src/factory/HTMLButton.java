package factory;

public class HTMLButton implements Button {
    public void render() {
        System.out.println("HTML representation of button");
    }

    public void onClick() {
        System.out.println("Bind a web browser click event");
    }
}
