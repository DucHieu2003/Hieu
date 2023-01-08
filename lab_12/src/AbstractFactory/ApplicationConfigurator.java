package AbstractFactory;

import java.util.*;

public class ApplicationConfigurator {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String configOS = sc.nextLine();

        GUIFactory factory;
        if (configOS.equals("Windows")) {
            factory = new WinFactory();
        } else if (configOS.equals("Mac")) {
            factory = new MacFactory();
        } else {
            throw new Exception("Error! Unknown OS");
        }
        Application app = new Application(factory);
        app.createUI();
        app.paint();
    }

}
