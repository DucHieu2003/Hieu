package factory;

public abstract class Dialog {
    abstract Button createButton();
    void render() {
        Button okButton = createButton();
        okButton.onClick();
        okButton.render();
    }
}
