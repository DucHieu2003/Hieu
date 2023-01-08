package Strategy;

public class Mall implements Strategy {

    @Override
    public String build(String location) {
        return location +".";
    }
}
