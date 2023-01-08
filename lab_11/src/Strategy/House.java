package Strategy;

public class House implements Strategy {

    @Override
    public String build(String location) {
        return  location + ".";
    }
}
