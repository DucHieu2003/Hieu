package factory;

public class WindowsButton implements Button {
    public void render() {
        System.out.println("Render button in Windows style");
    }

    public void onClick() {
        System.out.println("Bind a native OS click event");
    }
}
