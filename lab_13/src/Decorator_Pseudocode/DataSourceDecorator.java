package Decorator_Pseudocode;

public class DataSourceDecorator implements DataSource {
    private DataSource wrappee;

    public DataSourceDecorator(DataSource wrappee) {
        this.wrappee = wrappee;
    }
    public void writeData(String data) {
        wrappee.writeData(data);
    }
    public String readData() {
        return wrappee.readData();
    }
}
